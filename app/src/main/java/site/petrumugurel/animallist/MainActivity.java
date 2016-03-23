package site.petrumugurel.animallist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView animalsRV = (RecyclerView) findViewById(R.id.mainA_recycleView);
        animalsRV.setHasFixedSize(true);
        animalsRV.setLayoutManager(new LinearLayoutManager(this));
        animalsRV.setAdapter(new AnimalAdapter(new Animals().getAnimals()));
    }


    private class AnimalHolder extends RecyclerView.ViewHolder {
        public TextView  mAnimalDescriptionTV;
        public ImageView mAnimalIV;

        public AnimalHolder(View itemView) {
            super(itemView);

            mAnimalDescriptionTV = (TextView) itemView.findViewById(R.id.animal_description);
            mAnimalIV = (ImageView) itemView.findViewById(R.id.animal_image);
        }

        private void bindAnimals(Animals.Animal animal) {
            mAnimalDescriptionTV.setText(animal.getDescription());
            mAnimalIV.setImageResource(getResources().getIdentifier(animal.getImageLocation(),
                                                                    "drawable",
                                                                    getPackageName()));
        }
    }


    private class AnimalAdapter extends RecyclerView.Adapter<AnimalHolder> {
        private List<Animals.Animal> mAnimals;

        private AnimalAdapter(List<Animals.Animal> animals) {
            mAnimals = animals;
        }


        @Override
        public int getItemCount() {
            return mAnimals.size();
        }

        @Override
        public AnimalHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View           v        = inflater.inflate(R.layout.animals, parent, false);
            return new AnimalHolder(v);
        }

        @Override
        public void onBindViewHolder(AnimalHolder holder, int position) {
            holder.bindAnimals(mAnimals.get(position));
        }
    }
}

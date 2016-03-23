package site.petrumugurel.animallist;

import java.util.ArrayList;
import java.util.List;

/**
 * Various animals. Has 3 members: name, description and an image.
 * The small description and pictures are from wikipedia.
 */
public class Animals {
    public class Animal {
        public Animal(String name, String description, String imageLocation) {
            mName = name;
            mDescription = description;
            mImageLocation = imageLocation;
        }

        private String mName;
        private String mDescription;
        private String mImageLocation;

        public String getName() {
            return mName;
        }
        public String getDescription() {
            return mDescription;
        }
        public String getImageLocation() {
            return mImageLocation;
        }
    }


    private List<Animal> mAnimals;


    public Animals() {
        mAnimals = new ArrayList<>();
        mAnimals.add(new Animal("Goose",
                                "Domestic geese (Anser anser domesticus or Anser cygnoides) are" +
                                " domesticated grey geese (either greylag geese or swan geese)" +
                                " kept as poultry for their meat, eggs, and down feathers since" +
                                " ancient times.",
                                "goose"));
        mAnimals.add(new Animal("Horse",
                                "The horse (Equus ferus caballus)[2][3] is one of two extant " +
                                "subspecies of Equus ferus. It is an odd-toed ungulate mammal" +
                                " belonging to the taxonomic family Equidae.",
                                "horse"));
        mAnimals.add(new Animal("Chicken",
                                "The chicken (Gallus gallus domesticus) is a domesticated fowl, a" +
                                " subspecies of the red junglefowl. Currently there are more " +
                                "hickens in the world than any other species of bird or domestic" +
                                " animal.",
                                "chicken"));
        mAnimals.add(new Animal("Cow",
                                "Cattle—colloquially cows[note 1]—are the most common type of " +
                                "large domesticated ungulates. Cattle are raised as livestock for" +
                                " meat (beef and veal), as dairy animals for milk and other dairy " +
                                "products, and as draft animals.",
                                "cow"));
        mAnimals.add(new Animal("Duck",
                                "Duck is the common name for a large number of species in the" +
                                " waterfowl family Anatidae, which also includes swans and geese." +
                                " Ducks are mostly aquatic birds, mostly smaller than the swans " +
                                "and geese, and may be found in both fresh water and sea water.",
                                "duck"));
        mAnimals.add(new Animal("Squirrel",
                                "Squirrels are members of the family Sciuridae, consisting of " +
                                "small or medium-size rodents. They are most closely related to" +
                                " the mountain beaver and to the dormouse among living rodent" +
                                " families." ,
                                "squirrel"));
        mAnimals.add(new Animal("Moneky",
                                "Monkeys are haplorhine (\"dry-nosed\") primates, a paraphyletic " +
                                "group generally possessing tails and consisting of approximately" +
                                " 260 known living species. Are generally considered to be " +
                                "intelligent, particularly Old World monkeys.",
                                "monkey"));
        mAnimals.add(new Animal("Hipo",
                                "The common hippopotamus (Hippopotamus amphibius), or hippo, is a" +
                                " large, mostly herbivorous mammal in sub-Saharan Africa. The name" +
                                " comes from the ancient Greek for \"river horse\"",
                                "hipo"));
        mAnimals.add(new Animal("Eagle",
                                "Eagle is a common name for many large birds of prey of the " +
                                "family Accipitridae; it belongs to several groups of genera " +
                                "that are not necessarily closely related to each other.",
                                "eagle"));
        mAnimals.add(new Animal("Human",
                                "Modern humans " +
                                "(Homo sapiens, primarily ssp. Homo sapiens sapiens) are the only" +
                                " extant members of Hominina clade (or human clade), a branch of " +
                                "the taxonomical tribe Hominini belonging to the family " +
                                "of great apes.",
                                "human"));
        mAnimals.add(new Animal("Dog",
                                "The domestic dog (Canis lupus familiaris or Canis familiaris)[2]" +
                                " is a domesticated canid which has been selectively bred for" +
                                " millennia for various behaviors, sensory capabilities, " +
                                "and physical attributes.[3]",
                                "dog"));
        mAnimals.add(new Animal("Parrot",
                                "Parrots, also known as psittacines /ˈsɪtəsaɪnz/,[2][3] are birds" +
                                " of the roughly 393 species in 92 genera that make up the order" +
                                " Psittaciformes,[4] found in most tropical and subtropical " +
                                "regions",
                                "parrot"));
    }

    public List<Animal> getAnimals() {
        return mAnimals;
    }

}

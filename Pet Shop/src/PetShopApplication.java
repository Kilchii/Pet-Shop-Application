public class PetShopApplication {
    public static void main(String[] args) {
        // Creating instances of Pet, Cat, and Budgie
        Pet pet = new Pet("State Pet", "Cyprus");
        Cat cat = new Cat("Whinkky", "Robbert", 32, 12);
        Budgie budgie = new Budgie("Sky", "Chris", "Blue");
        Pet []pets = {pet,cat,budgie};

        for(int i = 0; i<pets.length; i++){
            if(pets[i] instanceof Cat){
                Cat c = (Cat) pets[i];
                System.out.println("Cat: " + c.getName() + ", Owner: " + c.getOwnerName() +
                        ", Teeth: " + c.getNumberOfTeeth() + ", Tail: " + c.getLengthOfTail());
            } else if (pets[i] instanceof Budgie) {
                Budgie b = (Budgie) pets[i];
                System.out.println("Budgie: " + b.getName() + ", Owner: " + b.getOwnerName() +
                        ", Feather Color: " + b.getColourOfFeathers());
            }else {
                System.out.println("Pet: " + pet.getName() + ", Owner: " + pet.getOwnerName());
            }
        }

        // Displaying information


    }
}

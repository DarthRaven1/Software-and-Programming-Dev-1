import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Dog {
  
    public void bark() {//this is the Bark behavior for the dogs

    };

    public void dig() {//this is the Dig behavior for the dogs

    };

    public void growl() {//this is the Growl behavior for the dogs

    };

String name;// current name of the dog
    
    int birthYear;//year the dog was born
    
    String breed;//the breed of the dog
    
    String stateOfMind;//how the dog is feeling
     
     public Dog(String name, int birthYear, String breed, String stateOfMind) {//this calls the attributes in each dog object
     
     this.name = name;
     
     this.birthYear = birthYear;
    
    this.breed = breed;
    
    this.stateOfMind = stateOfMind;
 
     };
    
    public static void main(String args[]) {
    
        List<Dog> objects = new ArrayList<>();//this initializes the dog array
    
 Dog dog1 = new Dog("Spot", 2022, "French Bulldog", "is currently calm"); // this is the first dog.

    Dog dog2 = new Dog("Charlie", 2018, "Golden retriever", "is currently calm"); // this is the second dog.

    Dog dog3 = new Dog("Beau", 2020, "Poodle", "is currently calm"); //(Beau is pronounced Bow, like a bow tie, don't ask me why)

    objects.add(dog1);
    
    objects.add(dog2);
    
    objects.add(dog3);
    
        Random random1 = new Random();
        
        int rand = 0;

            rand = random1.nextInt(10) + 1;
        
    
   
  for (Dog dog : objects) {
    boolean isBarking = random1.nextBoolean();
    boolean isDigging = random1.nextBoolean();
    boolean isGrowling = random1.nextBoolean();
    handleBehaviors(dog, isBarking, isDigging, isGrowling);
}; //this calls the argument for the handleBehaviors method
   
    }//end of main method
    
  public static void handleBehaviors(Dog dog, boolean isBarking, boolean isDigging, boolean isGrowling) {//this prints the dog's individual names and what they are doing
    if (isBarking) {
        System.out.println(dog.name + " is barking!");
    }
    if (isDigging) {
        System.out.println(dog.name + " is digging holes in the yard!");
    }
    if (isGrowling) {
        System.out.println(dog.name + " is growling!");
    }
}//end of handleBehaviors
    
    
    
    
    
    
    
    
    
};    
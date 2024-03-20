import java.util.Random; // this imports the the Random class that lets me use it
import java.util.List; // this imports the the List class that lets me use it
import java.util.ArrayList; // this imports the the ArrayList class that lets me use it

public class Dog {
  
    public void bark() { // this is the Bark behavior for the dogs

    };

    public void dig() { // this is the Dig behavior for the dogs

    };

    public void growl() { // this is the Growl behavior for the dogs

    };

String name; // current name of the dog
    
    int birthYear; // year the dog was born
    
    String breed; // the breed of the dog
    
    String stateOfMind; // how the dog is feeling
     
     public Dog(String name, int birthYear, String breed, String stateOfMind) {//this calls the attributes in each dog object
     
     this.name = name;
     
     this.birthYear = birthYear;
    
    this.breed = breed;
    
    this.stateOfMind = stateOfMind;
 
     }; // end of dog
    
    public static void main(String args[]) { // this is the main method
    
        List<Dog> objects = new ArrayList<>(); // this initializes the dog array
    
 Dog dog1 = new Dog("Spot", 2022, "French Bulldog", "calm"); // this is the first dog.

    Dog dog2 = new Dog("Charlie", 2018, "Golden retriever", "calm"); // this is the second dog.

    Dog dog3 = new Dog("Beau", 2020, "Poodle", "calm"); // (Beau is pronounced Bow, like a bow tie, don't ask me why)

 GermanShepherd myDog = new GermanShepherd("Rex", 2018, "German Shepherd", "Alert", 238); // this is one of the dogs that expand the original class
    
    JackRussellTerrier myPuppy = new JackRussellTerrier("Toby", 2024, "Jack Russell Terrier", "Playful", 4); // this is another one of the dogs that expand the original class
    
    myDog.protect(); // calls the unique method
    
    myPuppy.canPlay(); // calls another unique method

    objects.add(dog1); // this adds the dog1 object
    
    objects.add(dog2); // this adds the dog2 object
    
    objects.add(dog3); // this adds the dog3 object
    
    objects.add(myDog); // this adds the myDog object
    
    objects.add(myPuppy); // this adds the myPuppy object
    
        Random random1 = new Random(); // this whole thing (lines 65-69) is what randomizes the behaviors.
        
        int rand = 0;

            rand = random1.nextInt(10) + 1;
        
    
   
  for (Dog dog : objects) {
    boolean isBarking = random1.nextBoolean();
    boolean isDigging = random1.nextBoolean();
    boolean isGrowling = random1.nextBoolean();
    handleBehaviors(dog, isBarking, isDigging, isGrowling);
}; // this calls the argument for the handleBehaviors method
   
    } // end of main method
    
  public static void handleBehaviors(Dog dog, boolean isBarking, boolean isDigging, boolean isGrowling) { // this prints the dog's individual names and what they are doing
    if (isBarking) {
        System.out.println(dog.name + " is barking!");
    }
    if (isDigging) {
        System.out.println(dog.name + " is digging holes in the yard!");
    }
    if (isGrowling) {
        System.out.println(dog.name + " is growling!");
    }
  } // end of handleBehaviors
    
    
    
    
    
    
    
    
    
};    

class GermanShepherd extends Dog { // this is one of the expansion classes
    private int biteForce; // unique property

    public GermanShepherd(String name, int birthYear, String breed, String stateOfMind, int biteForce) {
        super(name, birthYear, breed, stateOfMind); // calls the superclass's constructor
        this.biteForce = biteForce; // initializes the unique property
    }

    public void protect() { // unique method
        System.out.println(this.name + " is protecting the house with a bite force of " + this.biteForce + "!");
    }

}


class JackRussellTerrier extends Dog { // another one of the expansion classes
    private int playHours; // unique property

    public JackRussellTerrier(String name, int birthyear, String breed, String stateOfMind, int playHours){
        super(name, birthyear, breed, stateOfMind); // calls the superclass's constructor
        this.playHours = playHours; // initializes the unique property
    }
    
    public void canPlay(){ // unique method
    System.out.println(this.name + " is rested and can play for " + this.playHours + " hours today!");
    }
}
import java.util.List;
import java.util.ArrayList;

public class Horse {
    
    int age;
   
    public static void main(String[] args) {
        
        List<Horse> objects = new ArrayList<>();
        
        Horse horse1 = new Horse("Shadow", 1999);
        horse1.age(2024); // Replace 2024 with the current year
    
    Horse horse2=new Horse("Shooter",2006);
    horse2.age(2024); // Replace 2024 with the current year

    Horse horse3=new Horse("Lightning",2015);
    horse3.age(2024); // Replace 2024 with the current year

    objects.add(horse1);
    
    objects.add(horse2);
    
    objects.add(horse3);
    
    System.out.println(horse1.getName() + " is " + horse1.getAge() + " years old.");
    
    System.out.println(horse2.getName() + " is " + horse2.getAge() + " years old.");
    
    System.out.println(horse3.getName() + " is " + horse3.getAge() + " years old.");
   }
    
    String name;// current name of the horse
    
    int birthYear;//year the horse was born
   
    String[] names; //array of old names of the horse
    
    int numberofNames=0; //how many old names are there.
   
    public Horse(String horseName, int year) { //horse constructor needs its name and birth year.
       this.name = horseName; //assigns the name of the horse to the horseName which was sent in the constructor.
        this.birthYear = year; //assigns the year to the birthYear that was sent in the constructor;
        this.names = new String[10]; // Initialize the 'names' array
    };    
        public String getName() { return this.name; }
         public int getAge() { return this.age; }
    
        public void calculateAge(int currentYear) {
         this.age = currentYear - birthYear;
 };
    
   public void age(int currentYear) {
    calculateAge(currentYear);
};

    
    
    public void changeName (String newName){//change the name but save the old name
      
        if (numberofNames == names.length) {
   
    String[] newNames = new String[names.length * 2];
   
    System.arraycopy(names, 0, newNames, 0, names.length);
    names = newNames;
};
    names[numberofNames] = name;
    numberofNames++;
    name = newName;
        
       
    };
    public String toString (){
        return name;
    };    
    
  
  
}
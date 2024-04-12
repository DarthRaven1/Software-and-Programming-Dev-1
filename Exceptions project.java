




// An Exceptions program created by Asher Lilly 
// For Software Dev 1 2024
public class Exceptions {
    
    public static void main(String[] args)
    {
        int ar[]={1, 2, 3, 4, 5};// this is the array that I will have an error in
        
        try{
            for (int i=0; i<= ar.length; i++)// this is the for loop inside the try block that makes the error
                System.out.print(ar[i]+" ");
            }
        catch (Exception e) {
            System.out.print("\nException caught (out of bounds)");// this prints that the program caught the error and the type of error
            }    
                
        try{
            for (int i = 0; i<= ar.length; i++){
    int result = 10 / ar[i]; // This line performs the division
    }
            }            
        catch (Exception f) {
            System.out.print("\nException caught (cannot divide by zero)");// this prints that the program caught the error and the type of error
        }
        
    }
}

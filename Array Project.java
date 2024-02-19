import java.util.Scanner;
public class firstpro{

public static void main(String[] args)
{
System.out.println("enter n: ");
Scanner input = new Scanner(System.in);
int n = input.nextInt();
int i=1;
int j=2;

System.out.println("ODD ");
while(i<=n) 
{ System.out.println(i); 
i=i+2;
}

System.out.println("EVEN ");
while(j<=n) 
{ 
    System.out.println(j); 
j=j+2;
}

 int count, sum;
        sum = 0;
        for (count = 1;count <= 100; count++) {
            sum = sum + count;
        }
        System.out.println("The Result is");
        
        System.out.println(sum);


}
}
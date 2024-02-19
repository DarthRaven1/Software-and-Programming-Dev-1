//Name: Asher Lilly, Email: Asher.Lilly@malad.us

//for CTE software development 1

//instructor Mr Gross

public class JavaTestClass {
    public static void main(String [] arguments) {
    int arr[] = {1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};
    int length = arr.length;
    System.out.print("Unsorted array : ");
    System.out.print("1 3 4 5 1 23 57 126 4 543 345 23 12 45 67 97             ");
    for(int i=0;i<length;i++) {
    for(int j=1;j<length-i;j++) {
        if(arr[j-1] > arr[j]) {
    int temp = arr[j];
    arr[j] = arr[j-1];
    arr[j-1] = temp;
    }
    }
    }
    System.out.print("Sorted array : ");
    for(int i=0;i<length;i++)
    System.out.print(arr[i] + " ");
    }
    }
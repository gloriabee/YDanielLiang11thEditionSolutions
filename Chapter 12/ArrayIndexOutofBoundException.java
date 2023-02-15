import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutofBoundException {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Random random=new Random();

        for(int i=0;i<arr.length;i++){
            arr[i]= random.nextInt(100)+1;
        }

        System.out.println(Arrays.toString(arr));

        Scanner sc=new Scanner(System.in);
        
        System.out.print("Please enter index of array(0-99): ");
        int index=sc.nextInt();
        try {
            System.out.println("The value at index is "+arr[index]);
            System.out.println("End nicely.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("You refer to index that does not exist.");
        }

    
        System.out.println("Continuing processing");
        

        
    }
}

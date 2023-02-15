import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionSum {
    public static void main(String[] args) {
        Scanner  input=new Scanner(System.in);
        boolean continueInput= true;

        do{
            try{
                System.out.print("Enter an integer: ");
                int num1=input.nextInt();
                int num2=input.nextInt();

                System.out.println("The number entered is "+ (num1+num2));

                continueInput=false;
            }
            catch(InputMismatchException ex){
                System.out.println("Try again. ("+ "incorrect input: an integer is required)");
                input.nextLine();
            }
        }while(continueInput);
    }
}

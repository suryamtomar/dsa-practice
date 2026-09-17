import java.util.Scanner;

public class takingInputOutput {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter the second number:");
        int secondNumber = sc.nextInt();
        int totalNumber = firstNumber + secondNumber;
        System.out.println("  total number are:"+totalNumber);
        sc.close();
    }

}

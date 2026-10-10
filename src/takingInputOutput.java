import java.util.Scanner;

public class takingInputOutput {
//   public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the first num:");
//        int firstNumber = sc.nextInt();
//        System.out.println("Please enter the second number:");
//        int secondNumber = sc.nextInt();
//        int totalNumber = firstNumber + secondNumber;
//        System.out.println("  total number are:"+totalNumber);
//        sc.close();
//    }
//public static void main(String[] args) {
//    Scanner sc =new Scanner(System.in);
//    int n=sc.nextInt();
//    for(int i=1;i<=n;i++){
//        System.out.println(i);
//    }
//}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value 1: ");
    int value1= sc.nextInt();
    System.out.print("Enter value 2: ");
    int value2= sc.nextInt();
    int Value=value1*value2;
    System.out.println("value is: "+Value);

}


}



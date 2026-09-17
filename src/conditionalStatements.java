import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {
        //1.If-Else Statement
        //        int age=17;
        //        if(age<=18){
        //            System.out.println("You are not eligible to vote");
        //        }else{
        //            System.out.println("You are eligible to vote");
        //        }

        //2. If-Else-If Ladder
//        int accuracy =81;
//        if(accuracy>=90){
//            System.out.println(
//                    "Excellent"
//            );
//        }else if(accuracy>=80){
//            System.out.println(
//                    "Very Good"
//            );
//        }else if(accuracy>=60){
//            System.out.println(
//                    "Good"
//            );
//        }
//        else if(accuracy>=50){
//            System.out.println(
//                    "Need Improvement"
//            );
//        }
//        else if(accuracy==32){
//            System.out.println(
//                    "Pass"
//            );
//        }
//        else{
//            System.out.println(
//                    "Failed"
//            );
//        }
        //3.Nested If-else Statement
//        boolean hasSubscription=true;
//        int solvedProblems=220;
//        if (hasSubscription){
//            if (solvedProblems>200){
//                System.out.println("unlock advanced sheet");
//            }else {
//                System.out.println("lock advanced sheet");
//            }
//            ;
//        }else{
//            System.out.println("upgrade to premium");
//        }
        //4.Ternary operator
       // The ternary operator in Java is a shorthand way of writing a simple if-else statement.
        //basic syntax=>
        // variable = (condition) ? value_if_true : value_if_false;
//        int age  =13;
//        String bunty =(age>18) ? "eligible " : "not eligible";
//        System.out.println(bunty+" to vote");

      //5.Switch statement
        System.out.println("Enter the value for day : ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");


        }


    }
}

public class loops {
    public static void main(String[] args) {

//        1.For loops
//        Use the for loop when you know exactly how many times you want to run the code.
//        ....SYNTAX.......
//        for (initialization; condition; update) {
//            // code to be executed
//        }
//        ..................
//        Example 1:
//        for (int i=1;i<=5;i++){
//            System.out.println("print value : "+i);
//        }
//        Example 2:
//        for (int i=1;i<=10;i+=2){
//            System.out.println(i);
//        }
//
//
//       2.Nested loops
//       Example 1:
//        for (int i=1; i<=4; i++){
//            for (int j=1; j<=4; j++){
//                System.out.println("*");
//            }
//            System.out.println();
//        }
//        Example 2:
//        for (int i=1;i<=3;i++){
//            for (int j=1;j<=3;j++){
//                System.out.println("i ="+i+",j="+j);
//            }
//        }
//        Example 3:with break:-
//        for (int i=1;i<=10;i++){
//           if(i==5){
//               break;
//           }
//            System.out.println(i);
//        }
//        Example 4:with continue:-
//        for (int i=1;i<=10;i++){
//            if(i==5){
//                continue;
//            }
//            System.out.println(i);
//        }
//        2.While loops
//        Use the while loop when you want to repeat code as long as a condition is true,
//         but you do not know the exact number of repetitions beforehand
//        ...SYNTAX.....
//        while (condition) {
//        code to be executed
//               }
//        ...............
//        Example 1:
//        int i=1;
//        while(i<=5){
//            System.out.println(i);i++;
//        }
//        Example 2:Nested while loop:-
//        int i=1;
//        while(i<=2){
//            int j=1;
//            while(j<=3){
//                System.out.println("i="+i+",j="+j);
//                j++;
//            }
//            i++;
//        }
//        3.Do While loop:
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}

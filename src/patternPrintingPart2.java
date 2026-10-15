public class patternPrintingPart2 {
    public static void main(String[] args) {
        //Pattern-1:Hollow Rectangular Pattern:-
//        int n=5;
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=6;col++){
//                 if(row==1 ||row==n){
//                     System.out.print("*");
//                 }else{
//                     if(col==1){
//                         System.out.print("*");
//                     }else if(col==6){
//                         System.out.print("*");
//                     }else {
//                         System.out.print(" ");
//                     }
//                 }
//            }
//            System.out.println();
//        }
        //Pattern-2:Staircase Shape Pattern:-
//        int n=5;
//        for(int row=1;row<=n;row++){
//
//                if (row == 1) {
//                    System.out.println("* ");
//                } else {
//                    if (row == 2) {
//                        System.out.println("* * ");
//                    } else if (row == 3) {
//                        System.out.println("*   * ");
//                    } else if (row == 4) {
//                        System.out.println("*     * ");
//                    } else {
//                        System.out.println("* * * * *");
//                    }
//                }
//            }
//        }
        //Pattern-2:Another Approach To Solve Staircase Shape Pattern:-
//        int n = 10;
//        for (int row = 1; row <= n; row++) {
//            if(row==1||row==2||row==n){
//                for(int col = 1; col <= row; col++){
//                    System.out.print("* ");
//                }
//            }else{
////                first star
//                System.out.print("* ");
////                middle star
//            for(int col = 1; col <= row-2; col++){
//                System.out.print("  ");
//            }
//            //            last star
//            System.out.print("* ");
//            }
////           Move to next row
//            System.out.println();
//
//        }
        //Pattern-3:Butterfly-Style Star Shape Pattern:-
//             int n =5;
//           for(int row=1;row<=n;row++) {
//               //part 1:
//               for (int col = 1; col <= row; col++) {
//                   System.out.print("* ");
//               }
//               //part 2:
//               for (int col = 1; col <= 2 * (n - row); col++) {
//                   System.out.print("  ");
//               }
//               //part 3:
//               for (int col = 1; col <= row; col++) {
//                   System.out.print("* ");
//
//               }
//               System.out.println();
//           }
//        for(int row=1;row<=n;row++){
//               //part 4:
//               for(int col=1;col<=n-row+1;col++){
//                   System.out.print("* ");
//               }
//               //part 5:
//               for (int col = 1; col <=2*(row-1); col++) {
//                   System.out.print("  ");
//               }
//               //part 6:
//            for (int col = 1; col <= n-row+1; col++) {
//                System.out.print("* ");
//            }
//               System.out.println();
//           }
        //Pattern-4: Solid Right-Angle Triangle Pattern But With Numbers:-
//               int n =5;
//               for(int row=1;row<=n;row++){
//                   for(int col=1;col<=row;col++){
//                       System.out.print(col);
//                   }
//                   System.out.println();
//               }
        //Pattern-5: Solid Right-Angle Triangle Pattern But With counting up to 10 :-
                int n=5;
                int count=1;
                for(int row=1;row<=n;row++){
                for(int col=1;col<=row;col++){
                    System.out.print(count +" ");
                    count++;
                }
                System.out.println();
                }














    }
    }


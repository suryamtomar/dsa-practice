public class patternPrintingPart1 {
    public static void main(String[] args) {
        //PATTERN 1.Solid Square Pattern
//        int n=4;
//        for (int row=1;row<=n;row++){
//            for (int coloumn=1;coloumn<=n;coloumn++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //PATTERN 2.Solid Rectangular Pattern
//        int n=3;
//        for (int row=1;row<=n;row++) {
//            for (int coloumn = 1; coloumn <= 5; coloumn++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //PATTERN 3.Solid Right-Angle Triangle Pattern
//        int n=5;
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //PATTERN 4.Solid Rhombus Pattern
//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print(" ");}
//                for (int col = 1; col <= n; col++) {
//                    System.out.print("* ");
//                }
//
//                System.out.println();
//            }
        //PATTERN 5.Inverted Right Angle Triangle Pattern
//          int n=6;
//          for(int row=1;row<=n;row++){
//              for(int col=1;col<=n-row;col++){
//                  System.out.print("* ");
//              }
//              System.out.println();
//          }
        //PATTERN 6.Solid Pyramid Pattern
//             int n=5;
//             for (int row = 1; row <= n; row++) {
//                 //space column
//                 for (int col = 1; col <= n-row; col++) {
//                     System.out.print(" ");
//                 }
//
//                 for (int col = 1; col <=2*row-1 ; col=col+2) {
//                     System.out.print("* ");
//
//                 }
//                 System.out.println("");
//                 }
        //PATTERN 6.Solid Pyramid Pattern
        int n=5;
             for (int row = 1; row <= n; row++) {
                 //space column
                 for (int col = 1; col <=row-1+2; col++) {
                     System.out.print("  ");
                 }
                 for (int col = 1; col <=2*n-2*row+1; col++) {
                     System.out.print("* ");
                 }
                 System.out.println();
                 }








        }
    }

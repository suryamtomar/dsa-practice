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
        int n = 10;
        for (int row = 1; row <= n; row++) {
            if(row==1||row==2||row==n){
                for(int col = 1; col <= row; col++){
                    System.out.print("* ");
                }
            }else{
//                first star
                System.out.print("* ");
//                middle star
            for(int col = 1; col <= row-2; col++){
                System.out.print("  ");
            }
            //            last star
            System.out.print("* ");
            }
//           Move to next row
            System.out.println();

        }
      }
    }


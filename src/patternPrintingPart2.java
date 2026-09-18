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
        int n=5;
        for(int row=1;row<=n;row++){

                if (row == 1) {
                    System.out.println("* ");
                } else {
                    if (row == 2) {
                        System.out.println("* * ");
                    } else if (row == 3) {
                        System.out.println("*   * ");
                    } else if (row == 4) {
                        System.out.println("*     * ");
                    } else {
                        System.out.println("* * * * *");
                    }
                }
            }
        }












    }


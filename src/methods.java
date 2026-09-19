public class methods {

        //Basic Syntax:to write methods in java:-
//              retunType methodName(parameters){
//                  method body
//                   }
//         1st example:for printing the table of 2;
//           void print2Table(){
//               for(int i=1;i<=10;i++){
//                   int ans=2*i;
//                   System.out.println(" ->"+ans);
//
//               }
//
//           }
//             public static void main(String[] args) {
//               methods obj=new methods();
//                 System.out.println("Hello World");
//                obj.print2Table();
//                 System.out.println("Hello ");
//             }
    //           2nd example:for printing the sum of 2;
                    void sumOf2Int(int x,int y){
                        System.out.println(
                                " sum - "+( x+ y )
                        );
                    }

                    public static void main(String[] args) {
                         methods obj =new methods();
                         obj.sumOf2Int(10,23);
                    }






      }

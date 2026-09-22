import java.util.Scanner;

public class array {
    public static void main(String[] args) {
//   declaration;
//        int  arr [];
//        allocation
//        arr = new int [10];
//        initialization
//        int[] brr = {100, 209, 390, 567, 678};
//        int n=brr.length;
//     using for loop
        //        for(int i=0;i<=n-1;i++){
//            System.out.println(brr[i]);
//        }
//     using for-each loop
//
//        #Taking input in Array:-
//        int[]arr=new int[5];
//        Scanner sc=new Scanner(System.in);
//        int n=arr.length;
//        for(int i=0;i<n;i++)
//        {
//            System.out.println("enter the element no."+i);
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("your array contains:");
//        for(int val:arr){
//            System.out.println(val);
//        }
//
               //#practice:-
//
//        int[]arr={10,34,54,3223,243};
//        int n=arr.length;
//        for(int i=0;i<=n-1;i++){
//            System.out.println(arr[i]);
//        }
//        for(int val:arr){
//            System.out.println(val+" ");
//        }
        //#practice Problem 1:-

//            int[]arr={10,20,30,40,50,60,70,80,90,100};
//
//            int sum=0;
//        for (int value : arr) {
//            sum = sum + value;
//        }
//            System.out.println(sum);

        //#practice Problem 2:-

//        int[]arr={1,2,3,4,5,6,7,8,9,10};
//
//        int mul=1;
//        for (int value : arr) {
//            mul = mul * value;
//        }
//        System.out.println(mul);

        //#practice Problem 3:Find max value in array:-
//         int [] arr={1,2,3,4,5,6,6,7,8,9,11};
//         int n=arr.length;
//         int maxValue=arr[0];
////         compare max value ko arr k hr 1 element k sath :-
//         for(int i=0;i<n;i++){
//           if ( arr[i]>maxValue){
//               maxValue=arr[i];
//           }
//
//         }
//        System.out.println(maxValue);
//
        //#practice Problem 5:Find min and max value in array:-
//        int[] arr={30,40,50,60,68,38,3345,23,-34};
//        int minValue=arr[0];
//        int maxValue=arr[0];
//        for(int value:arr){
//            if(value<minValue){
//                minValue=value;
//            }else{
//                if(value>maxValue){
//                    maxValue=value;
//                }
//            }
//        }
//        System.out.println(minValue);
//        System.out.println(maxValue);

                 //2D ARRAY :-

//          #Example 1-


//           int [][] arr={
//                             {1,2},
//                             {1,2,3},
//                             {1,2,3,4},
//                             {1,2,3,4,5},
//                             {1,2,3,4},
//                             {1,2,3},
//                             {1,2}
//                         };
////            int rowLength=arr.length;
//
//
//             for(int rowIndex=0;rowIndex<arr.length;rowIndex++){
////                 jese he main koi new row main aaya
////                 same point pr mene us row ka collLength find out kr lia
////                 current row -> arr[rowIndex]
////                 jisme kitne columns ->arr[rowIndex].length
//                 int colLength=arr[rowIndex].length;
//                 for(int columnIndex=0;columnIndex<=colLength-1;columnIndex++){
//                     System.out.print(arr[rowIndex][columnIndex]+" ");
//                 }
//               System.out.println();
//             }
//          #Example 2-
//        int[][] arr={
//                     {1,2},
//                     {3,4},
//                     {5,6},
//                     {7,8}
//                     };
//        int rowLength=arr.length;
//        int  colLength=arr[0].length;
//        for(int rowIndex=0;rowIndex<=rowLength-1;rowIndex++){
//            for(int colIndex=0;colIndex<=colLength-1;colIndex++){
//                System.out.print(arr[rowIndex][colIndex]+" ");
//            }
//            System.out.println();
//        }
             //Or
//        for(int rowIndex=0;rowIndex<=arr.length-1;rowIndex++){
//            for(int colIndex=0;colIndex<=arr[rowIndex].length-1;colIndex++){
//                System.out.print(arr[rowIndex][colIndex]+" ");
//            }
//            System.out.println();
//        }

//        Example 3:Taking input in 2D Array:-
//        int[][] arr=new int[3][4];
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<=arr.length-1;i++){
//            for(int j=0;j<=arr[i].length-1;j++){
//                System.out.println("Value provided for row= "+i+" and column= "+j);
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        for(int rowIndex=0;rowIndex<=arr.length-1;rowIndex++){
//            for(int colIndex=0;colIndex<=arr[rowIndex].length-1;colIndex++){
//                System.out.print(arr[rowIndex][colIndex]+" ");
//            }
//            System.out.println();
//        }

        //#practice Problem in 2D Array:-
        int[][] arr={{1,2,3},{4,5,6}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }

        }
        System.out.println(sum);





    }
}

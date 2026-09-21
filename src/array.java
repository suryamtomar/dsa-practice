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

            int[]arr={10,20,30,40,50,60,70,80,90,100};
            int n=arr.length;
            int sum=0;
        for (int value : arr) {
            sum = sum + value;
        }
            System.out.println(sum);




    }
}

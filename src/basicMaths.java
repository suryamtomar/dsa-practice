public class basicMaths {


//    # Print digit as it is for example--53127
//public static void printDigits(int num) {
////    agr mera num =0 ha to main ruk jau ga
////    agr mera num !=0 ha to main processing krta rahuga
//    while(num!=0){
//        int digit = num%10;
//        System.out.println(digit);
////        last digit remove
//        num=num/10;
//    }
//}
//    public static void main(String[] args) {
//    int num =53127;
//    printDigits(num);

//    print count digit of a number
public static int  countDigits(int num) {
    int count = 0;
    while(num!=0){
        int digit = num%10;
        count++;
        num=num/10;
    }
    return count;
}
    public static void main(String[] args) {
    int num =53127;
    int ans =countDigits(num);
    System.out.println(ans);


    }
}

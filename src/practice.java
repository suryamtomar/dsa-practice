import java.util.Scanner;

public class practice {
//    we are practicing or learning return types in java :-
// Common return types
////    Return type    Meaning	                Example
//    void	         Returns nothing	        void printDigits(int n)
//    int	         Returns an integer	int     add(int a, int b)
//    double	     Returns decimal number	    double average(int a, int b)
//    float          Returns decimal number	    float calculate()
//    char	         Returns one character	    char getGrade()
//    boolean	     Returns true or false	    boolean isPrime(int n)

// Example 1 — void
//    public static void printDigit(int num) {
//        System.out.println(num);
//    }
//
//    public static void main(String[] args) {
//        printDigit(10);
//    }


// Example 2 — int
//public static int add(int a,int b) {
//    return a + b ;
//}
//    public static void main(String[] args) {
//     int result = add(10,1);
//        System.out.println(result);
//    }

// Example 3 — boolean
//public static boolean isEven(int n) {
//    return (n % 2 == 0);
//}
//    public static void main(String[] args) {
//        System.out.println(isEven(70));
//    }


// Example 4 — String
public static String greet(String name) {
    return "Hello, " + name + "!";
}
    public static void main(String[] args) {
    String message =greet("Suryam");
     System.out.println(message);
    }


}

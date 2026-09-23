//import java.util.Scanner;

public class string {
    public static void main(String[] args) {
//        String firstName="SURYAM";
//        String lastName=new String("TOMAR");
////        Basic operation in string:-
//        System.out.println(firstName+" "+lastName);
////        It compares both First and Last name:-
//        System.out.println(firstName.compareTo(lastName));
////        It is used for printing the length of string:-
//        System.out.println(firstName.length());
////        It is use for printing the single character of any  string:-
//        System.out.println(firstName.charAt(2));

//        Taking input in string:-
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String str = sc.nextLine();
//        System.out.println("value: "+str);

//        Converting the String in character array:-
        String name="SURYAM";
        char[] charArray = name.toCharArray();
        for (char ch : charArray) {
            System.out.println("Name to character: " + ch);
        }


    }

}




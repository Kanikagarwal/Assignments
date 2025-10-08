import java.util.Arrays;
import java.util.Scanner;

/**
 * @Filename - Main.java
 * @Description - Entry point of the application
 * @Author - Kanika Agarwal
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        MyString a = new MyString(s);

        while(true) {
            System.out.println("Select the operation you want to perform");
            String[] arr = {"append()", "countWords()", "replace()", "isPalindrome()", "splice()", "split()", "maxRepeat()", "sort()", "shift()", "reverse()"};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(i + 1 + ". " + arr[i]);
            }
            int n = sc.nextInt();
            sc.nextLine();
            if(n == 0){
                System.out.println("Exiting program...");
                break;
            }
            switch (n) {
                case 1:
                    System.out.println("Enter string you want to append");
                    String t = sc.nextLine();
                    System.out.println("Result:-");
                    System.out.println(a.append(t));
                    break;
                case 2:
                    System.out.println("Result:-");
                    System.out.println(a.countWords());
                    break;
                case 3:
                    System.out.println("Enter the character you want to replace");
                    char q = sc.nextLine().charAt(0);
                    System.out.println("Enter the character you want to add");
                    char b = sc.nextLine().charAt(0);
                    System.out.println("Result:-");
                    System.out.println(a.replace(q, b));
                    break;
                case 4:
                    System.out.println("Result:-");
                    System.out.println(a.isPalindrome());
                    break;
                case 5:
                    System.out.println("Result:-");
                    System.out.println("Enter starting index");

                    int start = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter length");
                    int len = sc.nextInt();
                    System.out.println(a.splice(start, len));
                    break;
                case 6:
                    System.out.println("Result:-");
                    System.out.println(Arrays.toString(a.split()));
                    break;
                case 7:
                    System.out.println("Result:-");
                    System.out.println(a.maxRepeat());
                    break;
                case 8:
                    System.out.println("Result:-");
                    System.out.println(a.sort());
                    break;
                case 9:
                    System.out.println("Enter number of characters you want to shift");
                    int m = sc.nextInt();
                    System.out.println("Result:-");
                    System.out.println(a.shift(m));
                    break;
                case 10:
                    System.out.println("Result:-");
                    System.out.println(a.reverse());
                    break;
            }
        }
    }
}

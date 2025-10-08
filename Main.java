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
        String string = sc.nextLine();
        MyString mystring = new MyString(string);

        while(true) {
            System.out.println("Select the operation you want to perform");
            String[] array = {"append()", "countWords()", "replace()", "isPalindrome()", "splice()", "split()", "maxRepeat()", "sort()", "shift()", "reverse()"};
            for (int i = 0; i < array.length; i++) {
                System.out.println(i + 1 + ". " + array[i]);
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
                    String appendString = sc.nextLine();
                    System.out.println("Result:-");
                    System.out.println(mystring.append(appendString));
                    break;
                case 2:
                    System.out.println("Result:-");
                    System.out.println(mystring.countWords());
                    break;
                case 3:
                    System.out.println("Enter the character you want to replace");
                    char toReplace = sc.nextLine().charAt(0);
                    System.out.println("Enter the character you want to add");
                    char replaceBy = sc.nextLine().charAt(0);
                    System.out.println("Result:-");
                    System.out.println(mystring.replace(toReplace, replaceBy));
                    break;
                case 4:
                    System.out.println("Result:-");
                    System.out.println(mystring.isPalindrome());
                    break;
                case 5:
                    System.out.println("Result:-");
                    System.out.println("Enter starting index");

                    int start = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter length");
                    int length = sc.nextInt();
                    System.out.println(mystring.splice(start, length));
                    break;
                case 6:
                    System.out.println("Result:-");
                    System.out.println(Arrays.toString(mystring.getSplit()));
                    break;
                case 7:
                    System.out.println("Result:-");
                    System.out.println(mystring.getMaxRepeat());
                    break;
                case 8:
                    System.out.println("Result:-");
                    System.out.println(mystring.sortString());
                    break;
                case 9:
                    System.out.println("Enter number of characters you want to shift");
                    int index = sc.nextInt();
                    System.out.println("Result:-");
                    System.out.println(mystring.getShift(index));
                    break;
                case 10:
                    System.out.println("Result:-");
                    System.out.println(mystring.getReverse());
                    break;
            }
        }
    }
}

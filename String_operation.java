/**
 * @filename - MyString.java
 * @description - This will perform most of the string operations
 * @author - Kanika Agarwal
 */

import java.util.*;

public class String_operation { // MyString
    static class StringOp{
        String s;

        StringOp(String str) {
            this.s = str;
        }
        //        1. Append
        String append(String t){
            return new StringBuilder(s).append(t).toString();
        }

        //        2.Count Words
        int countWords(){
            if(s.length()==0)return 0;
            boolean word = false;
            int count=0;
            for(int i=0;i<s.length();i++){
                word=(s.charAt(i)!=' ');
                if(word && (i==0 || s.charAt(i-1)==' '))count++;
            }
            return count;
        }

        //        3. Replace
        String replace(char a,char b){
            char[] arr = s.toCharArray();
            for(int i=0;i<s.length();i++){
                if(arr[i]==a){
                    arr[i]=b;
                }
            }
            return new String(arr);
        }

        //        4. IsPalindrome
        boolean isPalindrome(){
            int i=0;
            int j=s.length()-1;
            while(i<j){
                if(s.charAt(i)!=s.charAt(j))return false;
                i++;
                j--;
            }
            return true;
        }

        //        5.Splice
        String splice(int start,int length){
            if(start<0 || start>s.length() || length<=0)return s;
            int end=Math.min(start+length,s.length());
            return s.substring(0,start)+s.substring(end);
        }

        //        6. Split
        String[] split(){
            int n = countWords();
            String[] arr = new String[n];
            int i=0;
            int index=0;
            while(i<s.length()){
                while (i<s.length() && s.charAt(i)==' ')i++;
                if(i>=s.length())break;
                int j=i;
                while(j<s.length() && s.charAt(j)!=' ')j++;
                arr[index++]=s.substring(i,j);
                i=j+1;
            }

            return arr;
        }

        //        7.maxRepeat
        char maxRepeat(){
            if(s.length() == 0) return '\0';
            int arr[] = new int[256];
            int max=0;
            char character=s.charAt(0);
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                arr[c]++;
                if(arr[c]>max){
                    max=arr[c];
                    character=c;
                }
            }
            return character;
        }

        //       8. Sort
        String sort(){
            char a[] = s.toCharArray();
            Arrays.sort(a);
            return new String(a);
        }

        //        9.Shift
        String shift(int n){
            if (s.length() == 0) return s;
//            Left shift
            n=n%s.length();
            String s1=s.substring(n);
            String s2=s.substring(0,n);
            return s1+s2;
        }

        //        10.Reverse
        String reverse(){
            char[] a = s.toCharArray();
            int i=0;
            int j=a.length-1;
            while(i<j){
                swap(a,i,j);
                i++;
                j--;
            }
            return new String(a);
        }

        void swap(char[] arr,int i,int j){
            char a = arr[i];
            arr[i]=arr[j];
            arr[j]=a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        StringOp a = new StringOp(s);

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

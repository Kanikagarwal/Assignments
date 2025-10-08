import java.util.Arrays;

/**
 * @Filename - MyString.java
 * @Description - This will perform most of the string operations
 * @Author - Kanika Agarwal
 */

public class MyString {
    private String value = "MyString";

    MyString(String value){
        this.value = value;
    }

    public String append(String value){
        this.value += value;
        return this.value;
    }

    int countWords(){
        if(value.length()==0)return 0;
        boolean word = false;
        int count=0;
        for(int i=0;i<value.length();i++){
            word=(value.charAt(i)!=' ');
            if(word && (i==0 || value.charAt(i-1)==' '))count++;
        }
        return count;
    }

    String replace(char a,char b){
        char[] arr = value.toCharArray();
        for(int i=0;i<value.length();i++){
            if(arr[i]==a){
                arr[i]=b;
            }
        }
        this.value=new String(arr);
        return this.value;
    }

    boolean isPalindrome(){
        int i=0;
        int j=value.length()-1;
        while(i<j){
            if(value.charAt(i)!=value.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }

    String[] split(){
        int n = countWords();
        String[] arr = new String[n];
        int i=0;
        int index=0;
        while(i<value.length()){
            while (i<value.length() && value.charAt(i)==' ')i++;
            if(i>=value.length())break;
            int j=i;
            while(j<value.length() && value.charAt(j)!=' ')j++;
            arr[index++]=value.substring(i,j);
            i=j+1;
        }

        return arr;
    }

    String splice(int start,int length){
        if(start<0 || start>value.length() || length<=0)return value;
        int end=Math.min(start+length,value.length());
        this.value=value.substring(0,start)+value.substring(end);
        return this.value;
    }

    char maxRepeat(){
        if(value.length() == 0) return '\0';
        int arr[] = new int[256];
        int max=0;
        char character=value.charAt(0);
        for(int i=0;i<value.length();i++){
            char c = value.charAt(i);
            arr[c]++;
            if(arr[c]>max){
                max=arr[c];
                character=c;
            }
        }
        return character;
    }

    String sort(){
        char a[] = value.toCharArray();
        Arrays.sort(a);
        return this.value = new String(a);
    }

    //        9.Shift
    String shift(int n){
        if (value.length() == 0) return value;
//            Left shift
        n=n%value.length();
        String s1=value.substring(n);
        String s2=value.substring(0,n);
        return this.value = s1+s2;
    }

    public String reverse(){
        String value = this.value;
        this.value = "";
        for (int i = value.length() - 1; i >= 0; i--){
            this.value += value.charAt(i);
        }
        return this.value;
    }

    @Override
    public String toString() {
        return value;
    }
}

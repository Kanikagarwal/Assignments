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
        if(value.length() == 0)return 0;
        boolean word = false;
        int count = 0;
        for(int i = 0; i < value.length(); i++){
            word=(value.charAt(i) != ' ');
            if(word && (i == 0 || value.charAt(i-1) == ' '))count++;
        }
        return count;
    }

    String replace(char toReplace,char replaceBy){
        char[] array = value.toCharArray();
        for(int i = 0; i < value.length(); i++){
            if(array[i] == toReplace){
                array[i] = replaceBy;
            }
        }
        this.value = new String(array);
        return this.value;
    }

    boolean isPalindrome(){
        int i = 0;
        int j = value.length()-1;
        while(i < j){
            if(value.charAt(i) != value.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }

    String[] getSplit(){
        int n = countWords();
        String[] array = new String[n];
        int i = 0;
        int index = 0;
        while(i < value.length()){
            while(i < value.length() && value.charAt(i) == ' ')i++;
            if(i >= value.length())break;
            int j=i;
            while(j < value.length() && value.charAt(j) != ' ')j++;
            array[index++] = value.substring(i,j);
            i = j+1;
        }

        return array;
    }

    String splice(int start,int length){
        if(start < 0 || start > value.length() || length <= 0)return value;
        int end = start+length;
        if(end > value.length())end = value.length();
        this.value = value.substring(0,start) + value.substring(end);
        return this.value;
    }

    char getMaxRepeat(){
        if(value.length() == 0) return '\0';
        int array[] = new int[256];
        int maxCount = 0;
        char maxCharacter = value.charAt(0);
        for(int i = 0;i < value.length(); i++){
            char character = value.charAt(i);
            array[character]++;
            if(array[character] > maxCount){
                maxCount =  array[character];
                maxCharacter = character;
            }
        }
        return maxCharacter;
    }

    String sortString() {
        char array[] = value.toCharArray();
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        this.value = new String(array);
        return this.value;
    }

    //        9.Shift
    String getShift(int index){
        if (value.length() == 0) return value;
//            Left shift
        index = index % value.length();
        String string1 = value.substring(index);
        String string2 = value.substring(0,index);
        return this.value = string1 + string2;
    }

    public String getReverse(){
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

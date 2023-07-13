package Recursion;

public class StringReverseUsingPointers {
    public static void main(String[] args) {
        String string = "COMPUTER";  // RETUPMOC
        int i = 0;
        int j = string.length()-1;
        String reversedSting = reverseString(string.toCharArray(),i,j);
        System.out.println(reversedSting);
    }

    private static String reverseString(char[] charArr, int i, int j) {
        // Base case
        if(i>=j){
            return new String(charArr);
        }
        // swap chars
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;

        //recursive relation
        return reverseString(charArr,++i,--j);
    }
}

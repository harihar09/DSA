package Recursion;

public class StringReverseUsingSB {
    public static void main(String[] args) {
        String string = "java";
        StringBuilder sb = new StringBuilder("");
        int index = 0;
        String reversedString = getReversedString(string.toCharArray(),sb,index);
        System.out.println(reversedString.length());
    }

    private static String getReversedString(char[] charArr, StringBuilder sb, int index) {
        // base condition
        if(index == charArr.length){
            return new String(sb);
        }
        // recursive relation - head recursion
        getReversedString(charArr,sb,++index);
        // processing
        return new String(sb = sb.append(charArr[--index]));
    }
}

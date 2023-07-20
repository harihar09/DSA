package Recursion;

public class StringSubsequences {
    public static void main(String[] args) {
        String string = "ab";
        String ans ="";
        getStringSubsequences(string, 0,ans);
      }

    private static void getStringSubsequences(String string, int index,String ans) {
        // Base condition
        System.out.println("at line number 12");
        if (index == string.length()) {
            System.out.println(ans);
            return;
        }
        // include
        System.out.println("at line number 18");
        getStringSubsequences(string,index+1,ans+string.charAt(index));
        // exclude
        System.out.println("at line number 21");
        getStringSubsequences(string,index+1,ans);
        System.out.println("at line number 23");
    }
}

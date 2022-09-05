package Java7.String;

public class IsVowels {
    public static boolean isVowel(char ch){
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(ch)!=-1?true:false;
    }
    public static void main(String[] args) {

    }
}

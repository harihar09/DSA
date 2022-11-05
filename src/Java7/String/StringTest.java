package Java7.String;

public class StringTest {



    public static void main(String[] args) {
        String str = "abc";
        String ans = null;
        ans = getAns(str);
        System.out.println(ans);
    }

    private static String getAns(String str) {
   String test = "teststr";
   String returnValue=null;
        if (str!=null && !str.isEmpty()){
            returnValue = test + String.format(test,str);
        }else
            returnValue = test;
        return  returnValue;
    }

}

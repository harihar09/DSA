package CP.LeetCode.TwoPointer;

public class MergeStringsAlternately_1768 {

  /*  You are given two strings word1 and word2. Merge the strings by adding
    letters in alternating order, starting with word1. If a string is longer
    than the other, append the additional letters onto the end of the merged string.

    Input: word1 = "abc", word2 = "pqr"
    Output: "apbqcr"*/
  public static void main(String[] args) {
      String word1 = "abcd";
      String word2 = "xyz";
      int i =0,j=0;
      char [] chars1 = word1.toCharArray();
      char [] chars2 = word2.toCharArray();
      StringBuffer sb = new StringBuffer();
      while(i < chars1.length || j< chars2.length){
          if(i<chars1.length)
              sb.append(chars1[i++]);
          if(j<chars2.length)
              sb.append(chars2[j++]);
      }
      System.out.println("Merged string :: "+new String(sb));
  }
}

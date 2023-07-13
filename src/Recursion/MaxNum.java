package Recursion;

public class MaxNum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,2,21,1};
        int ans = getMax(arr,0);
        System.out.println("max is " +ans);
    }

    private static int getMax(int[] arr, int index) {
        // Base condition
        if(index>=arr.length-1){
            return Integer.MIN_VALUE;
        }
        int ans = arr[index];
        int recAns = getMax(arr,++index);
        int finalAns = Math.max(ans,recAns);
        return finalAns;
    }
}

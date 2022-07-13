package CP.CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class Reversal_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for test cases");
        int T = sc.nextInt();
        while(T-- >0){
            System.out.println("Enter n");
            int n = sc.nextInt();
            System.out.println("Enter k");
            int k = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter "+n+" numbers");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            if(isSorted(arr)){
                System.out.println("yes");
            }else{
                 if(sbAryWthLesSum(arr,k)){
                     System.out.println("yes");
                 }else{
                     System.out.println("no");
                 }
            }
        }
    }
    public static boolean isSorted(int[] arr){
        boolean flag = true;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i+1]-arr[i])<0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static boolean sbAryWthLesSum(int[] arr,int k){
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0,count=0;
                for(int k2=i;k2<=j;k2++){
                    System.out.print(arr[k2]+" ");
                    sum+=arr[k2];
                    count++;
                }
                if(sum<=k && count>1){
                    int p=0;
                    for(int x=i;x<(j+1)/2;x++){
                        int temp = arr[x];
                        arr[x] = arr[j-p];
                        arr[j-p]=temp;
                        p++;
                    }
                    System.out.println("less sum "+ Arrays.toString(arr));
                    if(isSorted(arr)){
                        flag=true;
                        System.out.println("sorted");
                        break;
                    }else{
                        int q=0;
                        for(int x=i;x<(j+1)/2;x++){
                            int temp = arr[x];
                            arr[x] = arr[j-q];
                            arr[j-q]=temp;
                            q++;
                        }
                    }
                }
                if(flag){
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return flag;
    }
}

package CP.CodeChef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for test cases");
        int T = sc.nextInt();
        long count;
        while(T-- >0){
            count=0;
            System.out.println("Enter n");
            int n =sc.nextInt();
            int[] arr = new int[n];
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                list.add(sc.nextInt());
            }
            System.out.println(list);
             count = list.stream().filter(num->num>1000).count();
            System.out.println(count);

        }
    }
}

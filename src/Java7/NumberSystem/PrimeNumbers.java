package Java7.NumberSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        List<Integer> primeNumbers = new ArrayList<>();
        List<Integer> compositeNumbers =new ArrayList<>();
        boolean flag;
        int count=0;
        for(int i=2;i<=n;i++) {
            flag=true;
            for (int j=2;j<i;j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
               // System.out.print(i + " ");
            //    count++;
                primeNumbers.add(i);
            }else {
               // System.out.print("composite numbers " + i + " ");
                compositeNumbers.add(i);
            }
        }
        System.out.println("primes "+primeNumbers);
        System.out.println("composites "+compositeNumbers);
    }
}

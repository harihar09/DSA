package Java7.NumberSystem;

import java.util.Scanner;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        double num = sc.nextDouble();
        double count=0.0,odd=1;
        while(num>=0){
            count++;
            odd+=2;
            num = num-odd;
        }
        System.out.println(count);

    }
}

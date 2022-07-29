package CP.CodeChef;

import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter T");
        int T = sc.nextInt();
        while(T-- >0){
            System.out.println("Enter x and y");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = (x>y)?y:x;
            System.out.println(n);
        }
    }
}

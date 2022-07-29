package CP.CodeChef;

import java.util.Scanner;

public class HungryChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter y");
        int y = sc.nextInt();;
        System.out.println("Enter n");
        int n = sc.nextInt();;
        System.out.println("Enter r");
        int r = sc.nextInt();
        int total =0;
        int rem=0;
        int premium = 0;
        int normal =0;
        if(x>r&&y>r){
            System.out.println("-1");
        }
        else{
                premium = r/y;                           //   4 8 10 50
                total = premium;                         //  premium = 5 normal = 2
                if(total >= n){
                    System.out.println("0 "+n);
                }
                while(total<=n){
                premium = (r-y)/y;
                if(premium <= 0){
                    System.out.println(n+" 0");
                    break;
                }
                normal = (rem+y)/x;
                total = premium+normal;
                if(total >= n){
                    System.out.println(normal+" "+premium);
                    break;
                }
                r =r-y;
                rem=rem+y;

            }
        }

    }
}

package Java7.Array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column value");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[row][column];   // 2DArray declaration, type[][] arrName = new type[row][column];

        System.out.println("Enter "+row*column+" values");
        for(int i=0;i<row;i++){  // for rows
            for(int j=0;j<column;j++){ // for columns
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Two D Array");
        for(int i=0;i<row;i++){  // for rows
            for(int j=0;j<column;j++){ // for columns
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

package Algo.Stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Stack<Integer> stack = new Stack<>();
        int i=0;
        // push into stack -
        while(i<arr.length){
            stack.push(arr[i++]);
        }
        i=0;
        // pop each number from stack and push into array
        while(!stack.isEmpty()){
            arr[i++] = stack.pop();
        }
        System.out.println("reversed array "+Arrays.toString(arr));
    }
}

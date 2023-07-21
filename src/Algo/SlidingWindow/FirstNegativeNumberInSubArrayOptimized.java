package Algo.SlidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeNumberInSubArrayOptimized {
    public static void main(String[] args) {
        int [] arr = {-1,-2,-3,4,5};
        int i =0,j=0,k=2;
        Queue<Integer> queue = new ArrayDeque<>();
        while(j<arr.length){
            // do calculations
            if(arr[j]<0){
                queue.add(arr[j]);
            }
            if(j-i+1<k){ // less than window size
                j++;
            }else if((j-i+1)==k){ // equal to window size
                // here in this part, focus on two task. first get the answer and second is remove ths
                // negative number from queue if it' outside the window
                if(queue.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(queue.peek());
                    // remove front from list if its outside window size
                    if(arr[i]== queue.peek()){
                        queue.remove(queue.peek());
                    }
                }
                i++;
                j++;
            }
        }
        }
}

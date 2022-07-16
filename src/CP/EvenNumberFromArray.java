package CP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFromArray {
    public static void main(String[] args) {
        int [] arr = {3,5,7,2,4,9,9,13}; //{6,8}
        int [] arr2 = new int[arr.length];
        int count=0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr2[count++]=arr[i];
                System.out.println("count");
                list.add(arr[i]);
            }
        }
        int arr3[] = new int[count];
        for(int i=0;i<count;i++){
            arr3[i] =arr2[i];
        }

        System.out.println(Arrays.toString(arr3));
        System.out.println("list "+list);



    }
}

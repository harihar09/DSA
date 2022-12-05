package Algo.Searching;

public class FloorIndex {
    public static void main(String[] args) {
        int[] array = {1,3,4,6};
        int target = 9;
        System.out.println(floorIndex(array,target));
    }

    private static int floorIndex(int[] array, int target){
        int start = 0, end = array.length-1, mid = 0;

        // find the floor index from given array
        while(start<=end){
            mid = start +(end-start)/2;
            if(target == array[mid]){
                return  mid;
            }else if(target > array[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return  end;
    }
}

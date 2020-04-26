import javax.management.StandardEmitterMBean;
import java.util.Arrays;

public class Quicksort {


    public int quicksorter(int[] arr, int start, int end){

        int pivotVal = arr[end];
        int pivotStart = (start-1);

        for (int i = start; i < end; i++){
            if (arr[i] < pivotVal){
                pivotStart++;
                int temp = arr[pivotStart];
                arr[pivotStart] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[pivotStart +1];
        arr[pivotStart + 1] = pivotVal;
        arr[end] = temp;

        System.out.println(Arrays.toString(arr));

        System.out.println("this is the index of the old pivot" + (start +1));

        return pivotStart+1;
    }



    void recursionSort(int arr[], int start, int end) {

        if (start < end) {
            int pivotStart = quicksorter(arr, start, end);

            recursionSort(arr, start, pivotStart-1);
            recursionSort(arr, pivotStart+1, end);
        }
    }



}

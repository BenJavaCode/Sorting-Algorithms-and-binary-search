import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = { 8, 13, 47, 19, 81 ,1, 6, 70, 56, 52, 1, 9, 19 ,44, 16, 2 }; //skal være sorteret
        int[] arr1 = {1,9,1,5,8,4,0,2};
        //BubbleSort bubbleSort = new BubbleSort();
        //bubbleSort.bubblesort(arr);

        Quicksort quicksort = new Quicksort();
        int arr2[] = {1,9,1,5,8,4,0,2};
        int high = arr2.length;
        int low = 0;

        quicksort.recursionSort(arr2, low, high -1);


    }

    public void binarysearch(){
        int arr[] = { 2, 5, 7, 9, 13 ,65, 66, 71 }; //skal være sorteret
        int s = 13;

        int start = 0;
        int end = arr.length -1;
        int mid = 0;

        while (start <= end) { // tidskompleksitet O(log(N))
            mid = (start + end) /2; //halvering
            System.out.println("it");

            if (arr[mid] > s){
                end = mid -1;
            }
            else if (arr[mid] == s){
                System.out.println("found");
                break;
            }
            else start = mid + 1;
        }

    }

}

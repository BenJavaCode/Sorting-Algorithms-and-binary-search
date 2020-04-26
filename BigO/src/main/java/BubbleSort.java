import java.util.Arrays;

public class BubbleSort {
    public int[] bubblesort(int[] arr){
    //sammenlign de to første elementer
        //hvis tallet til højre er mindre så byt
        //ellers gå videre til næste pos
        //fortsæt indtil der ikke kan foretages nogle byt
        boolean byt = true;
        int count = 0;
        while (byt){//hvor mange gange?(worst case)? N,  fordi det sidste index rykkes 1/N pr gang
            byt = false;
            for (int i = 0; i <arr.length -1; i++){ //hvor mange gange? N-i = i < arr.length -1, så hvis N == 16(arr.length == 16) er N = 15(16-1)
                if (arr[i] > arr[i+1]){ // hvis true så byt..og sæt byt = true for denne iteration
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    byt = true;
                }
                count++; //hvor mange gange i worst case? N*N-1,(hvis N = 8 så whileloop * foreloop = 63, N*N-1 = 63)

                System.out.println("gentagelse nmr "+ count + Arrays.toString(arr));
            }

        }

        return arr; //hvilken faktor er N vokset med når arr går fra 8-16? 16/8 = 2 fordi N = arr.length

        //bublesort O(N*N)
        //hvis N vokser med 2 hvor meget vil bubblesort så vokse med? 2*2 = 4
        //hvilket vil sige at 8 = 42 så 16 = 42*4 CIRKA
    }
}

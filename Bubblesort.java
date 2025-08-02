import java.util.Arrays;
public class Bubblesort{
    public static void main(String[]args){
        int arr[] = {1, 7, -32, 89};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int arr[]){
        boolean swapped;
        //runs n-1 times
        for(int i= 0; i <arr.length; i++){
            swapped = false;
            //for each step max item will come at the last respective index
            for(int j= 1; j <arr.length-i; j++){
                //swap
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if u didn't swap for any particular value of i, it means the arr is sorted hence stop this program
            if(!swapped){ //!false= true
                break;
            }
        }
    }
}
package linearSearch;

public class LinearSearch {


    public int linearSearch(int[]arr, int data) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==data) {
                return arr[i];
            }
        }
        return -1;

    }
}

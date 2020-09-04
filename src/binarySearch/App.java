package binarySearch;

public class App {

    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(binarySearch(arr,1));
        //System.out.println(binarySearch(new int[]{1,2,4,7,9,12},12));


    }

    private static int binarySearch(int[] arr, int x) {
        int p=0;
        int r=arr.length-1;


        while (p<=r){
            int q=(p+r)/2;
           // System.out.println("q value: "+ q);
            if(x<arr[q]){
                r=q-1;
            }else if(x> arr[q]){
                p=q+1;
            }else {
                return q;
            }
        }
        return -1;
    }
}

package algo.binarySearch;

public class App {

    public static void main(String[] args) {
//        int []arr={6,2,3,4,5};
//        Arrays. sort(arr);
//        System.out.println(binarySearch(arr,6));
        //System.out.println(binarySearch(new int[]{1,2,4,7,9,12},12));

    int []a= new int[]{1, 2, 3, 4, 5, 7, 8, 12};
    recursiveBinarySearch(a,0,8,9);


    }
    public static int recursiveBinarySearch(int []a , int p , int r, int x ) {
        System.out.println("[ " + p + "..." + r + " ]");
        if (p > r) {
            System.out.println("Not Found " + x);
            return -1;
        } else {
            int q = (p + r) / 2;
            if (a[q] == x) {
                System.out.println("Found " + x + " at index :" + a[q]);
                return q;
            } else if (a[q] > x) {
              return   recursiveBinarySearch(a, p, q - 1, x);
            } else {
               return recursiveBinarySearch(a, q + 1, r, x);
            }
        }

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

package algo.mergesort;

public class App {
    public static void main(String[] args) {
    /*
    Merge sort: its running time is o(n log n)
    Merge sort divides the problem into half based on mid point.
     */
        int[]inputArray={9,7,3,1,6,3,2,6,8,9,2,3,0};
        MergeSort sorter=new MergeSort();
        sorter.sort(inputArray);
        for(int i=0; i<inputArray.length;i++){
            System.out.print(inputArray[i]);
        }
    }
}

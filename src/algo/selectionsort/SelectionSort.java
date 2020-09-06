package algo.selectionsort;

public class SelectionSort {
    public static void main(String[] args) {
        //Inserion sort its running time is O(n^2)
        int[] myArray={19,83,13,87,12,99};
        System.out.println("unsorted array");
        for(int i =0; i<myArray.length;i++){
            System.out.print(" "+myArray[i]);
        }


        System.out.println("\n Sorted array \n_______________");
        int[]sortedArray= selectionsSort(myArray);
        for(int i =0; i<myArray.length;i++){
            System.out.print(" "+myArray[i]);
            System.out.print(" "+sortedArray[i]);
        }

    }
    public static int[] selectionsSort(int[]a){
        for(int i=0; i<a.length;i++){
            int minimum=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]< a[minimum]){
                    minimum=j;
                }
            }
            int temp=a[i];
            a[i]=a[minimum];
            a[minimum]=temp;
        }
        return a;
    }
}

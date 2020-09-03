package linearSearch;

public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[]= {1,2,3,4,5,6,7};
        int data=5;
        int data1=1;
        int data2=0;
        int data3=8;
        LinearSearch ls=new LinearSearch();
        System.out.println(ls.linearSearch(arr, data));
        System.out.println(ls.linearSearch(arr, data1));
        System.out.println(ls.linearSearch(arr, data2));
        System.out.println(ls.linearSearch(arr, data3));

    }
}

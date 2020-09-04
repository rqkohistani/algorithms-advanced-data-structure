package algo.recurssion;

import org.w3c.dom.ls.LSOutput;

public class App {

    public static void main(String[] args) {
       // reduceByOne(3);
        int[]array={4,48,4,34,76,9,3};//no need to sort the array here.
        System.out.println(recursiveLinearSearch(array,1,4));
    }











    private static void reduceByOne(int n) {

        if (n >= 0) {//base case to stop the recursion
            reduceByOne(n-1);
            System.out.println("value of n: "+n);
        }
        //System.out.println("Completed Call: "+n);
    /*
    when the condition is satisfied
    the condition above goes down
    when last condition satisfied which 0 and
    1 was waiting for condition it called to be satisfied.
    then method one satisfied then method below will do its job
    until the last method which was the first method call the other methods
    which was itself.
    Recursion is the process of repeating items in a self-similar way.
    In programming languages, if a program allows you to call a function
     inside the same function, then it is called a recursive call of the function.
     */
    }
    public static int recursiveLinearSearch(int[] a,int index, int x){
        if(index> a.length-1){//if evaluates to true, x was not found in the array
            System.out.println("Not Found: "+x);
            return -1;
        } else if (a[index] == x) {
            System.out.print("Found: "+x+" : at index: ");
            return index;
        }else {
            System.out.println("index at : "+ index);//current position of the index
            return recursiveLinearSearch(a,index+1,x);
        }
    }

}

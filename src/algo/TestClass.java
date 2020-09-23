package algo;

public class TestClass {
    public static void main(String[] args) {
        int x=2;
        int y=3;
        int n=10;





        int[]myArr={1,2,3};//3
        int i2 =4;



        int[]newArr=new int[myArr.length*2];
        System.out.println(newArr.length);

        for(int i=0;i<myArr.length; i++){
//            System.out.println(myArr[i]);
            newArr[i]=myArr[i];

//            myArr=newArr;

//            newArr[3]=4;
//            newArr[4]=5;
        }
        myArr=newArr;
        myArr[4]=1000;

        for (int a :
                myArr) {
            System.out.println(a);
        }

//
//        for (int a:
//             myArr) {
//            System.out.println(a);
//
//        }
//
//        System.out.println("__________________________\n");
//        int[]newArr=new int[myArr.length*2];
//        System.out.println(myArr.length+"\n");
//        for(int i=0;i<myArr.length; i++){
//            newArr[i]=myArr[i];
//
//
//        }
//        System.out.println(newArr.length-myArr.length);
//        System.out.println("\"aaa\"+");
//        for(int i =newArr.length-myArr.length;i<newArr.length;i++){
//            newArr[i]=i*5;
//
//        }
//
//        for (int b:
//             newArr) {
//            System.out.println(b);
//        }

//        System.out.println(sum(2));

//        System.out.println(f(4));
    }
//    public static long pow( long x, int n )
//    {
//        if( n == 0 )
//            return 1;
//        if( n == 1 )
//            return x;
//        if( isEven( n ) )
//            return pow( x * x, n / 2 );
//        else
//            return pow( x * x, n / 2 ) * x;
//    }
//    public static void printOut( int n )
//    {
//        if( n >= 10 )
//            printOut( n / 10 );
//        printDigit( n % 10 );
//    }
    public static int f( int x )
    {

        if( x == 0 )
            return 0;
        else

            return 2 * f( x - 1 ) + x * x;
    }


    public static int sum( int n )
    {
        int partialSum;
        partialSum = 0;
        for( int i = 1; i <= n; i++ )
            partialSum += i * i * i;
        return partialSum;
    }
}

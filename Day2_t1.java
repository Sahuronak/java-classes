public class Day2_t1{
    // methods and function in java
    public static void main(String[] args) {
        int a=20;
        int b=34;
        // method calling in java
    //1. user define:
        //>>>no argument pass no return value
        fun1();
        //>>>no arguments pass but return a value
        func();
        //>>>passing by arguments and do return value
        int maximum=max(a,b);
        System.out.println(maximum);
        // arguments pass not return value
        fun2(44,88);


    //2. pre-define calling in java
        int maxi=Math.max(70, 56);//here is a pre-define method of maths class
        System.out.println(maxi);      
    }
    public static int max(int x, int y){
        if(x<y)
        return x;
        else
        return y;
    }
    public static int func(){
        System.out.println("here is sum of two number");
        int a=20;
        int b=30;
        System.out.println(a+b);
        return a+b;
    }
    public static void fun1(){
        System.out.println("hello world");
    }
    public static void fun2(int x, int y){
        if(x==y){
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }
    }
    
}

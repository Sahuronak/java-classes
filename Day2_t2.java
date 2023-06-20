public class Day2_t2 {
    //method overloading
    public static void main(String[] args) {
        //>>>with changing number of parameter
       System.out.println(mini_no(33,44)); 
       System.out.println(mini_no(20,90,40)); 
        //>>with changing datatype
       System.out.println(sumTwo(50.55f,32.44f)); 
       System.out.println(twoStringsum("null  ","hello nhi bolne ka ab se")); 


    }
    public static int mini_no(int x, int y){
        if(x<y)
        return x;
        else
        return y;
    }
     public static int mini_no(int x, int y, int z){
        if(x<y&&y<z)
        return x;
        else if(y<x)
        return y;
        else
        return z;
    }
    public static float sumTwo(float a, float b){
        return a+b;
    }
    public static String twoStringsum(String a, String b){
        String c=a+b;
        return c;
    }    
}

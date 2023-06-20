// Typecasting in java

public class day1_t2 {
    public static void main(String[] args) {
        //type of typecasting:
        //1. widening or automatic typecasting[byte>short>long>double]
        float a= 15;
        int b=10;
        System.out.println(a+b);
        //2. Narrowing or Explicit type casting[double> float>long>int>short>byte]
        byte c=15;
        long d= 15;
        int e=(int)(c+d);
        System.out.println(e);
        

    }
}

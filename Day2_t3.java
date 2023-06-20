public class Day2_t3 {
    // operators in java

    public static void main(String[] args) {
        // operators-
        //arithmetic 
        int a=3;
        int b=2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println((float)(a%b));
        //unary
        System.out.println(a--);
        System.out.println(b!=2);
        // assignment 
        System.out.println(a+=3);
        System.out.println(a-=2);
        System.out.println(b*=2);
        System.out.println(b/=4);
        System.out.println((float)(a%=6));
        // relational
        if(a==b){
            System.out.println(a);
        }
        else if(a<=b){
            System.out.println(a++);
        }        
        else if(a>=b){
            System.out.println(a--);
        }
        else if(a<b){
            System.out.println(a+2);
        }
        else if(a>b){
            System.out.println(a-2);
        }
        else if(a!=b){
            System.out.println(a*2);
        }
        else{
            System.out.println(b);
        }
        //Logical
        if(a>b && b==a){
            System.out.println(a);
        }
        else if(a<b||b==a){
            System.out.println(b+a);
        }
        else if(a!=b){
            System.out.println(" not equal");
        }
        else{
            System.out.println("out of loop");
        }
        //Bitwise
        
        //Ternary        
    }
}

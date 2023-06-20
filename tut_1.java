// variable in java
public class tut_1{
    public static void main(String[] args) {
        int x=10;// using variable intialization and declaration
        System.out.println(x);
        // datatype in variable
        int a=10;
        byte b =2;
        long c=309432090;
        short d= 78;
        boolean e = true;
        char f='f';
        float g= 829073f;
        double h = 24.989;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        //type of variable
        // 1. local variable
        // 2.instance variable
        // 3.static variable
        System.out.println("local variable: a variable that define inside a block method bode or constructor called local variable."); 
        tut_1 obj= new tut_1();
        obj.add();
        System.out.println("Instance variable: A variable that is declared inside the class but outside of method body or constructor is known as instance variable");
        Student ob=new Student();
        ob.name="ram";
        ob.roll_no=10;
        System.out.println(ob.name);
        System.out.println(ob.roll_no);
        System.out.println("Static variable: A variable that declare as a static called static variable.");
        Student.collage="Babulal Tarabai Institute of Research and technology";
        System.out.println(Student.collage);
        // scope of variable
        // 1. Local variable scope : A variable that is defined inside a block method / body or constructor is known as local varicle 
        //cannot not be accessed outside the variable.
        //2. Member/class variable scope: A variable that is declared inside the class but outside the body ,block or constructor is known as member class level variable can be directly accessed anywhere in the class.





    }
     public void add(){
        int a=10;
        int b=20;
       int c= a+b;
       System.out.println(c);
     }
    
}
class Student{
    String name;//these are instance variable
    int roll_no;// declare inside the class but outside the method body etc.
    public static String collage;// static variable

}

public class Day2_t4 {
    //access MOdifier in java
    public static void main(String[] args) {
        // there are 4 modifier in java
        //default
        //public>> accessed from anywhere
        Day2_t1 obj = new Day2_t1();
        System.out.println(obj.max(92472, 34343));
        //private>> only same class
        ClassA objA=new ClassA();
        // objA.display();>>>>trying to through error due to private
        // protected>>>same package or subclass of different package
         objA.display2();
        
    }
}
class ClassA{
    private void display(){
        System.out.println("hello");
    }
    protected void display2(){
        System.out.println("hello world");
    }
}

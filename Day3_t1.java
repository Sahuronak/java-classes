public class Day3_t1 {
    // constructor and its type , classes and objects
    public static void main(String[] args) {
          //creating object using new keyword
       Day3_t1 o = new Day3_t1();
       //invoking method using the object
       o.show();
       
       //object  of Dog class
            // create the doberman object
            Dog Doberman= new Dog();
            Doberman.name="Doberman";
            Doberman.color="Brown";
            Doberman.length=3;
            Doberman.weight=33;
            Doberman.eyecolor="black";
            Doberman.Bark();
            Doberman.eat();
        //constructor
        // we are creating the object of the car class
        //>>default constructor
        car c= new car();
        //>> parameterized constructor is used to initialize the object 
        //creating object
        Student s1=new Student(12, "shacksham");
        Student s2 = new Student(14, "deepak");
        // displaying values of the object
        s1.display1();
        s2.display1();
        //java copy constructor
        CopyConstructorExample c1=new CopyConstructorExample(10,15);
        //following involve a copy constructor call
        CopyConstructorExample c2= new CopyConstructorExample(c1);

        //note that following doesnt involve copy constructor call as 
        // non-primitive variables are just references.
        CopyConstructorExample c3=c2;
        System.out.println(c2.Display());// display of c2 call here
 
    }

    
    void show(){
        System.out.println("welcome in coding");
    }
} 


class Dog{
    //properties of Dog
    String name;
    String color;
    double weight;
    double length;
    String eyecolor;
    // method and function that dog perform
    public void Bark(){
        System.out.println(this.name+"bow-bow");
    }
    public void eat(){
        System.out.println(this.name+" is eating");
    }
}
class car{
    car(){
        System.out.println("car is created");
    }
}
class Student{
    int id ;
    String name;
    Student(int stdid, String stdname){
        id =stdid;
        name=stdname;
    }
    void display1(){
        System.out.println(id+" "+name);
    }

}
class CopyConstructorExample{
      private double x,y;
        //A normal parameterized constructor
        public  CopyConstructorExample(double one, double two){
            x = one;
            y= two;
        }
        //copy constructor
        CopyConstructorExample(CopyConstructorExample c){
            System.out.println("copy constructor called");
            x = c.x;
            y= c.y;
        }
        public String Display() {
            return "("+x+"+"+y+"i)";
}
}

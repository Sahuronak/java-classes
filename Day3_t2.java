import javax.xml.transform.Source;

public class Day3_t2 {
    //oops
    public static void main(String[] args) {
        //>> concept of oops-----package, access modifier, class, object  constructor
//Encapsulation>>binding data and the method operation on that data in a single unit also a class
    System.out.println("this is Abstraction ");
        EncapTest encap=new EncapTest();
        encap.setname("james");
        encap.setAge(20);
        encap.setIdnum("1234mr.");
        System.out.println("Name: "+ encap.getName()+", Age: "+encap.getAge());

 //Inheritance >>one object aquires all the properties and behaviour of a parent object .provide a way to create a new class from an existing class.
    System.out.println("this is Inheritance ");
    //is-A relationship----relation between the object
    //has -type relation ---not relation between object
    // type of inheritance
    System.out.println("this is single Inheritance");
        Dogsingle d= new Dogsingle();
        d.bark();
        d.walk();
    System.out.println("this is Multilevel");
        Puppy p= new Puppy();
        p.weep();
        p.bark();
        p.walk();
    System.out.println("this is a hierarchical ");
        Cats c= new Cats();
        c.sound();

// Polymorphism>>  refers to the same object exhibiting different forms and behaviors 
        System.out.println("1. this is compile -time polymorphism");//>> static polymorphism and acheive by method overloading(same name and different argument)
        Multiply m= new Multiply();
        m.Multi(3, 4);
        m.multi(343, 2, 0);
        m.multi(22, 11);
        System.out.println("2. This is run- time polymorphism");//>>Dynamic method dispatch and function call to overridden method is resolved at runtime(writting same function in the child class and parent class )
        cars v= new cars();
        v.run();
        v.name();
        vehicle ve= new vehicle();
        ve.run();


//Abstraction >>showing only essential part of an object to user and hiding inner details to reduce complexity and the user inly know what an object does instead how?
        System.out.println("This is eg of abstraction");
        int min = Math.min(12,34);
        double sqr= Math.pow(2,3);
        System.out.println("the minimum of 12 and 34 is:"+ min+" the power for 2 raise to 3 is:"+sqr);
     
        
    }

}
//Encapsulation
class EncapTest{
    private String name;
    private String idNum;
    private int age;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getIdnum(){
        return idNum;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    public void setname(String newName){
        name=newName;
    }
    public void setIdnum(String newId){
        idNum=newId;

    }
}
//Inheritance
class InheritAnimalSingle{
    void walk(){
        System.out.println("Animals walking");
    }
}
class Dogsingle extends InheritAnimalSingle{
    void bark(){
        System.out.println("dog is barking");
    }

}
class Puppy extends Dogsingle{
    void weep(){
        System.out.println("Baby dog is crying");
    }
}

class Cats extends InheritAnimalSingle{
    void sound(){
        System.out.println("I produce sound like: meow meow");
    }
}
//Polymorphism
//compile time
class Multiply{
    public int Multi(int onenum, int twonum){
        System.out.println(onenum*twonum);
        return onenum*twonum;
    }
    public int multi(int onenum,int twonum, int threenum){
        System.out.println(onenum*twonum*threenum);
        return onenum*twonum*threenum;
    }
    public double multi(double onenum,double twonum){
        System.out.println(onenum*twonum);
        return onenum*twonum;
    }
}
//>>run-time
class  vehicle{
    void run(){
        System.out.println("its running vehicle");
    }
}
class cars{
    void name(){
        System.out.println(" mine Mercedes");
    }
    void run(){
        System.out.println(" mercedes run at high speed");
    }
}

 

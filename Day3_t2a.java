 //Abstraction
  // abstract Data type>>>the user only get to know the essential functionality of those data type.
  //>>declare in abstract keyword, abstract and non abstract method,cannot be instantiated,can have final method, can have constructors and method also

public abstract class Day3_t2a{
    private String name;
    private String address;
    private int number;
    
public Day3_t2a(String name, String address, int number){
    System.out.println("Constructing an Employee");
    this.name=name;
    this.address = address;
    this.number =number;

}
public double computepay(){
    System.out.println("inside compute pay of employees");
    return 0.0;
}
public void mailcheck(){
    System.out.println("mailing a check to"+ this.name+" "+ this.address);
}
public String toString(){
    return name+" "+address+" "+ number;
}
public String getName(){
    return name;
}
public String getAddress(){
    return address;
}
public void setAddress(String newAddress){
    address = newAddress;
}
public int getNumber(){
    return number;
}
}

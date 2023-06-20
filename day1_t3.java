public class day1_t3 {
 // overflow and underflow in java
 public static void main(String[] args) {
    //overflow:value out of the the range of given datatype is called a overflow.
    int c=2147483647;//>> here increment by can lead to out of range
    System.out.println(c);
    //underflow: value under the range of given datatype is called a underflow.
    int d=-2147483648;//>> here decrement by can lead to under the range
    System.out.println(d);
 }
}

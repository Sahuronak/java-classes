public class day1_t4 {
    //conditional statement
    public static void main(String[] args) {
        // three categories
        int age=10;
        // 1. selection->> if, if-else, nested-if, if-else-is ladder,switch state
        if(age<10){
            System.out.println("kids are allowed");
        }
        else{
            System.out.println("tumhare baap ka ghr nhi hai");
        }
        switch(age){
            case 10:System.out.println("under age");
            break;
            case 20:System.out.println("middle");
            
            case 30:System.out.println("over age");
        }

        //2. iteration->> while, do-while, for loop
        int b=0;
        while(b<10){
            System.out.println("hello");
            continue;
        }
        do{
            System.out.println("world");
            b++;
        } while(b<20);
        for(int i=20; i<=100;i++){
            System.out.println(i);
        }
        //3. jump statement:>>break,labelled,continue, continue statement with nested loop, continue  statements with nested loop 
        //return statements
        
    }
}

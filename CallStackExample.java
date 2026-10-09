// import java.util.*;
public class CallStackExample {
     
    public static void D(){
        System.out.println("D method");
    }

    public static void C(int a, int b){
        int c = a + b;
        System.out.println("C method  a + b =  " + c);
    }

    public static void B(int a){
        // int b = 20;
        int b = (int) (Math.random() * 100);
         C(a, b);
        System.out.println("B method");
       
    }
    public static void A(){
        int a = 10;
        
        B(a);
        System.out.println("A method");
    }


    public static void main(String[] args){
        A();
        D();
    }
}

import java.util.Scanner;
class A{
    private A(){
        System.out.println("Constructor A");
    }
    //method
    static void show(){
        new A();
    }
}
public class Constructaccess {
    public static void main(String[] args) {
        A.show();
    }
}


class A{
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}
public class updow {
    public static void main (String args[])
    {
        A obj = (A) new B();  // up casting
        obj.show1();

        B obj1 = (B) obj; //down casting 
        obj1.show2();
    }
    
}

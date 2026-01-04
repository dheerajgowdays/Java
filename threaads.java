
class A extends Thread {
    public void run(){
        for(int i=0;i<=100;i++)
        {
            System.out.println("hi");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public  class threaads{
    public static void main(String args[])
    {
        A obj = new A();
        B obj1 = new B();
        obj.run();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        obj1.run();
    }
}
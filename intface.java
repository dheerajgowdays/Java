interface computer{
    void code();
}
class laptop implements computer{
    public void code()
    {
        System.out.println("code,compile,run");
    }
}
class Desktop implements computer{
    public void code(){
        System.out.println("code,compile,run: Faster");
    }
}

class DevApp
{
    public void code(computer obj){
        obj.code();
    }
}

public class intface {
    public static void main(String args[])
    {
    computer lap = new laptop();
    computer desk = new Desktop();

    DevApp dheeraj = new DevApp();
    dheeraj.code(lap);
    dheeraj.code(desk);
    }
}

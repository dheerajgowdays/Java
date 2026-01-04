
class humans{
    private String name;
    private int age;

    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int a)
    {
        age =  a;
    }
    public int getAge()
    {
        return age;
    }
}
public class enc {
    public static void main (String args[])
    {
        humans obj = new humans();
        obj.setAge(20);
        obj.setName("Dheeraj");
        System.out.println(obj.getName()+":"+obj.getAge());
    }
    
}

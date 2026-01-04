

class Mobile{
    String brand;
    int price;
    static String name;

    public static void show(Mobile obj){
        System.out.println(obj.brand+":"+obj.price+":"+ name);
    }
}
public class staticm {
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "apple";
        obj1.price = 1500;
        Mobile.name = "Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Oneplus";
        obj2.price = 150;

        Mobile.show(obj1);
    }
    
}

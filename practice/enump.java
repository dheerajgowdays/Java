


enum laptop{
    Macbook(2000),XPS(2500),Surface(),Thinkpad(1800);

    private int price;

    private laptop(){
        price = 500;
    }

    private laptop(int price)
    {
        this.price = price;
    }

    public int getprice()
    {
        return price;
    }

    public void setprice(int price)
    {
        this.price = price;
    }
}
public class enump {
    public static void main(String args[])
    {
        for (laptop lap : laptop.values())
        {
            System.out.println(lap+":"+ lap.getprice());
        }
    }
}

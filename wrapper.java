public class wrapper {
    public static void main(String args[])
    {
        int num=3;

        //Integer num1 = new Integer(num);
        Integer num1 = num;

        //int num2 = num1.intValue();
        int num2 = num1;

        String str = "13";
        int num3 = Integer.parseInt(str);
        System.out.println(num2 + (num3*2));
    }
    
}

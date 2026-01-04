
public class excepthand {
    public static void main (String args[])
    {
        int i=0;
        int j=0;

        try{
            j=20/i;
            if (j==0){
                throw new ArithmeticException ("zero should not be answer");
            }
        }
        catch (ArithmeticException e){
            j=20/1;
            System.out.println("thats the default output " + e);
        }
        catch (Exception  e){
            System.out.println("Something went wrong " + e);
        }
        System.out.println(j);
    }
    
}


class multi{
    public static void main (String args[])
    {
        supermulti obj = new supermulti();
        int r1=obj.add(3,4);
        int r2=obj.sub(5,3);
        int r3=obj.multi(7, 8);
        int r4=obj.div(9, 3);
        int r5=obj.pow(r2, r4);
        int r6=obj.sqrt(9);

        System.out.println("3 + 4 = "+r1);
        System.out.println("5 - 3 = "+r2);
        System.out.println("7 * 8 = "+r3);
        System.out.println("9 / 3 = "+r4);
        System.out.println(r2+" ^ "+r4+" = "+r5);
        System.out.println("sqrt 9 = "+r6);
    }
}
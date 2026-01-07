
class Students{
    int usn;
    String name;
    double marks;
}
public class stuarray {
    public static void main(String args[])
    {
        Students s1 = new Students();
        s1.usn = 001;
        s1.name = "Dheeraj";
        s1.marks = 88;

        Students s2 = new Students();
        s2.usn = 002;
        s2.name = "Charan";
        s2.marks = 99;

        Students s3 = new Students();
        s3.usn = 003;
        s3.name = "Bharath";
        s3.marks = 100;

        Students stu[] = new Students[3];
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;

        for(int i=0;i<stu.length;i++)
        {
            System.out.println(stu[i].name +" :" + stu[i].marks);
        }
    }
}

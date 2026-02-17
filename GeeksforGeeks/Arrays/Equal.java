import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        int array1[] = new int[size];
        int array2[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array1:");
            array1[i] = s.nextInt();
        }
        System.out.println();
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array2:");
            array2[i] = s.nextInt();
        }
        boolean checker = false;
        for(int j=0;j<size;j++){
            if(array1[j]!=array2[j]){
                checker = true;
                break;
            }
        }
        if(!checker){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
        s.close();
    }
}

import java.util.Scanner;
public class BruteSorting {
    static void sorting(int array[]){
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] == 0)
                cnt0++;
            else if(array[i] == 1)
                cnt1++;
            else
                cnt2++;
        }
        for(int i=0;i<cnt0;i++)
            array[i] = 0;
        for(int i=cnt0;i<(cnt0+cnt1);i++)
            array[i] =1;
        for(int i=(cnt0+cnt1);i<array.length;i++)
            array[i] = 2;
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            array[i] = s.nextInt();
        }
        sorting(array);
        s.close();
    }
}

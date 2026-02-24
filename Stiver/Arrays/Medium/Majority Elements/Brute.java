import java.util.Scanner;

public class Brute {
    static int Majority(int array[]){
        for(int i=0;i<array.length;i++){
            int cnt = 0;
            for(int j=0;j<array.length;j++){
                if(array[i] == array[j]){
                    cnt++;
                }
            }
            if(cnt >(array.length/2))
                return array[i];
        }
        return -1;
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
        System.out.println(Majority(array));
        s.close();
    }    
}

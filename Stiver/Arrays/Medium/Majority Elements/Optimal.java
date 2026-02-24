import java.util.Scanner;
public class Optimal {
    static int Majority(int array[]){
        int cnt =0;
        int el =array[0];
        for(int i=0;i<array.length;i++){
            if(cnt == 0){
                cnt = 1;
                el = array[i];
            }
            else if(array[i] == el){
                cnt ++;
            }
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int j=0;j<array.length;j++){
            if(array[j] == el)
                cnt1++;
        }
        if(cnt1>(array.length/2))
            return el;
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

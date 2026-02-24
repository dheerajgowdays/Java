import java.util.Scanner;

public class OptimalSorting{
    static void sorting(int array[]){
        int mid=0 , high=array.length-1,low=0;
        for(int i=0;i<array.length;i++){
            if (array[mid] == 0){
                int temp = array[mid];
                array[mid] = array[low];
                array[low] = temp;
                mid++;low++;
            }
            else if(array[mid] == 1)
                mid++;
            else{
                int temp = array[high];
                array[high] = array[mid];
                array[mid] = temp;
                high--;
            }
        }
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
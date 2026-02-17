import java.util.Scanner;

public class Dublicate {

    public static void Searching(int array[], int size) {

        int array2[] = new int[size];
        int x = 0;

        for (int i = 0; i < size; i++) {

            boolean isDuplicate = false;
            for (int j = 0; j < x; j++) {
                if (array[i] == array2[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                array2[x++] = array[i];
            }
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < x; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element: ");
            array[i] = sc.nextInt();
        }

        Searching(array, size);
        sc.close();
    }
}

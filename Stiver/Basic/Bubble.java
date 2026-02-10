import java.util.Scanner;

public class Bubble {
    public static int[] sorting(int a[],int n){
        for(int i=n-1;i>=1;i--){
            int didswap = 0;
            for(int j=0;j<=i-1;j++){
                if(a[j]>a[j+1]){
                    int  temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    didswap = 1;
                }
            }
            if(didswap == 0 )
                break;
    }
    return a;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a size of an Array:");
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
        System.out.print("Enter elements:");
        a[i]=sc.nextInt();
    }
    sorting(a, n);
    for(int i=0;i<n;i++){
        System.out.println(a[i]);
    }
    sc.close();
}
}

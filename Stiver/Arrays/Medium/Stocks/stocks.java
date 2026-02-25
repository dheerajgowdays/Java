import java.util.Scanner;
public class stocks {
    static int profit(int prices[]){
        int profit=0 ,maxi = prices[0];
        for(int i=1;i<prices.length;i++){
                int cost = prices[i] - maxi;
                profit = Math.max(profit,cost);
                maxi = Math.min(maxi, prices[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = s.nextInt();
        int prices[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of an array: ");
            prices[i] = s.nextInt();
        } 
        System.out.println(profit(prices));
        s.close();
    }    
}

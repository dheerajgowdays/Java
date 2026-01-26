//Armstrong Numbers

import java.util.Scanner;
import java.util.*;
class ArmstrongNumber{
    public  ArrayList<Integer> check(Integer A,Integer B){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=A;i<=B;i++){
            String x = Integer.toString(i);
            int result =0;
            for(int z=0;z<x.length();z++){
                result += Math.pow(x.charAt(z)-'0',x.length());
            }
            if(result == i){
                list.add(i);
            }
        }
        return list;
    }
}
public class problem18 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number A: ");
        int a = s.nextInt();
        System.out.print("Enter a Number B: ");
        int b = s.nextInt();
        ArmstrongNumber obj = new ArmstrongNumber();
        ArrayList <Integer> li = new ArrayList<Integer>();
        li = obj.check(a,b);
        if(li.size() == 0){
            System.out.println("There are No Armstrong Number between "+a+" And "+b+".");
        }
        else{
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i)+",");
        }
        System.out.println("these are the Armstrong Number between "+a+" And "+b+".");
        }
        s.close();
    }
}

import java.io.*;
import java.util.Scanner;
public class recursion{
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        //prompt user to enter integer
        System.out.println("enter an integer: ");
        int n=sc.nextInt();
        //call method to print decreasing integers from n
        printdecreasing(n);
    }
    //make function to decrease n to 1
    public static void printdecreasing(int n){
        //base case: if n is less than or equal to 0 return
        if(n<=0){
            return;
        }
        System.out.println(n);
        printdecreasing(n-1);

    }
}
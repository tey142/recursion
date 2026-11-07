// ACTIVITY 1
// // import java.io.*;
// // import java.util.Scanner;
// // public class recursion{
// //     public static void main(String[] args) throws Exception{
// //         Scanner sc=new Scanner(System.in);
// //         //prompt user to enter integer
// //         System.out.println("enter an integer: ");
// //         int n=sc.nextInt();
// //         //call method to print decreasing integers from n
// //         printdecreasing(n);
// //     }
// //     //make function to decrease n to 1
// //     public static void printdecreasing(int n){
// //         //base case: if n is less than or equal to 0 return
// //         if(n<=0){
// //             return;
// //         }
// //         System.out.println(n);
// //         printdecreasing(n-1);

// //     }
// // }

// ACTIVITY 2
// import java.util.Scanner;
// public class recursion{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter an integer to find the factorial of: ");
//         int n=sc.nextInt();
//         System.out.println("factorial of "+n+" is: "+factorial(n));
//     }
//     public static int factorial(int n){
//         if(n<=1){
//             return 1;
//         }
//         return (n)*factorial(n-1);
        
//     }
// }

//HOMEWORK
import java.util.Scanner;
public class recursion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer: ");
        int n=sc.nextInt();
        System.out.println("output: ");
        pzz(n);
    }
    public static void pzz(int n){
        if(n<=0){
            return;
        }
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
    }
}
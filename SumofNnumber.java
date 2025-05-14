import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a=sc.nextInt();
        int sum=0;
        for(int i=0;i<=a;i++){
           sum+=i;
        }
          System.out.print("Sum of the Number : "+sum);   
    }
}
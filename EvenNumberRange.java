import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = sc.nextInt();
        if(a==1||a==0){
            System.out.print("No Even Number Exist In this range");
        }
        System.out.print("Even numbers are : ");
        for(int i=2;i<=a;i++){
            if(i%2==0){
              System.out.print(i+" ");
            }
        }
    }
}
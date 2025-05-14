import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        if(a>b){
            System.out.print("Maximun Number : "+ a);
        }
        else{
             System.out.print("Maximun Number : "+ b);
        }
    }
}
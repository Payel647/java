import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        int c=sc.nextInt();
        if (a>b){
            if(a>c){
                System.out.print("Maximum Number "+a);
            }
            else{
               System.out.print("Maximum Number "+c); 
            }
        }
        else{
            if(b>c){
                System.out.print("Maximum Number "+b);
            }
            else{
                System.out.print("Maximum Number "+c);
            }
        }
    }
}
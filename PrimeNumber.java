import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        boolean prime=false;
        int a=sc.nextInt();
        for(int i=2;i<a;i++){
            if(a%i==0){
               System.out.print("Not a Prime Number");
               prime=true;
               break;
            }
        }
        if(!prime){
          System.out.print("Prime Number");   
        }
    }
}
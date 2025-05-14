import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle : ");
        int P=sc.nextInt();
        System.out.print("Enter Interest rate : ");
        int R=sc.nextInt();
        System.out.print("Enter time : ");
        int T=sc.nextInt();
        int SI=P*R*T/100;
        System.out.println("Simple Interest : "+ SI);
        System.out.println("Final amount : "+ (P+SI));
    }
}
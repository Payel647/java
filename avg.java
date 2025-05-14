import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of subject : ");
        int a = sc.nextInt();
        int avg=0;
        for(int i=0;i<a;i++){
             System.out.print("Enter Marks of the subject : ");
             int marks = sc.nextInt();
             avg+=marks;
        }
        System.out.print("Average of subject : "+ avg/a);
    }
}
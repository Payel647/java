import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radious : ");
        float r = sc.nextInt();
        float area = 3.141f*r*r;
        System.out.print("Area of the circle : "+ area);   
    }
}
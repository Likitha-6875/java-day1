import java.util.Scanner;
public class Sample1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int a=sc.nextInt();
        System.out.println("Enter b value:");
        double b=sc.nextDouble();
        System.out.println("Enter c value:");
        float c=sc.nextFloat();
        System.out.println("Enter d value:");
        String d=sc.next();
        String e=sc.nextLine();
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("d:"+d);
    }
}

import java.util.Scanner;
public class loop {
    public static void main(String[] args){
        System.out.println("Annual Exam Final Marks");
        Scanner sc=new Scanner(System.in);
        System.out.println("ENGLISH");
        int a=sc.nextInt();
        System.out.println("BENGALI");
        int b=sc.nextInt();
        System.out.println("PHYSICS");
        int c=sc.nextInt();
        System.out.println("CHEMISTRY");
        int d=sc.nextInt();
        System.out.println("BIOLOGY");
        int e=sc.nextInt();
        System.out.println("MATH");
        int f=sc.nextInt();
        int Average=(a+b+c+d+e+f)/6;
        System.out.println("The percentage you got in Exam is");
        System.out.println(Average);
    }
}

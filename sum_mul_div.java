import java.util.Scanner;

public class sum_mul_div {
    public static void main(String[] args){

        //1 st take input

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //int sum=a+b+c;
        //int mul=a*b*c;
        //int div=a/b/c;
        //int div2=(a+b*c)/3;
        //System.out.println("the sum of these numbers is");
        //System.out.println(sum);
        //System.out.println("the mul of these number is");
        //System.out.println(mul);
        //System.out.println("the div of these number is");
        //System.out.println(div);
        //System.out.println("the div of these number is");
        //System.out.println(div2);

        //2nd give number

        //int a=7;
        //int b=5;
        //int c=9;
        int sum=a+b+c;
        int mul=a*b*c;
        double div=a/b/c;
        float div2=(a+b*c)/3;
        System.out.println("the sum of these numbers is");
        System.out.println(sum);
        System.out.println("the mul of these number is");
        System.out.println(mul);
        System.out.println("the div of these number is");
        System.out.println(div);
        System.out.println("the div2 of these number is");
        System.out.println(div2);
    }  
}

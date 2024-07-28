import java.util.Random;
import java.util.Scanner;

public class Rock_paper_Sisscors {
    public static void main(String[] args) {
       System.out.println("Start the Match");
       Scanner sc=new Scanner(System.in); 
       System.out.println("Choose Any One:-");
       System.out.println("0 stone,  1 paper,  2 sisscors");
       int input=sc.nextInt();
       System.out.println("you choose" + input);
       Random random=new Random();
       int computerinput=random.nextInt(3);
       System.out.println("computer coose:-"+computerinput);
       if (input==computerinput) {
        System.out.println("Match Draw");
       }
       else if (input==0 && computerinput==2 || input==2 && computerinput==1 || input==1 && computerinput==0) {
        System.out.println("You Win The Match");
       }
       else {
        System.out.println("You Loose The Match\nComputer Win The Match");
       }
    }
        
}
      
    


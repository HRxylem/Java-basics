import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("Hello Mr/Mrs How are you"); 
        Scanner sc=new Scanner (System.in);
        System.out.println("Please Enter your Name");
        String Name=sc.nextLine();
        System.out.println("Please Enter your proffession");
        String proffession=sc.nextLine();
        System.out.println("Please Enter your City / Village / Town");
        String City=sc.nextLine();
        
        System.out.println("Please Mr/Mrs:- Enter Your Age Below");
        int age=sc.nextInt();
        if(age<60 && age!=0 && age>=20){
            System.out.println("you are an employable person\nand you are a man at work");
        }
        else if(age>=60 && age<99){
            System.out.println("you are a man who is not at work\n        or\nyou are a reteired person");
        }
        else if(age==100){
            System.out.println("you are not human, you are immortal");
        }
        else if(age==0) {
            System.out.println("Nothing to say its increadible \nyou are not even born");
        }
        else{
            System.out.println("you are not in that age to work\n         or\nyou are not able to work");
        }
        System.out.println("Thank you Mr/Mrs Here your state");

    }
}

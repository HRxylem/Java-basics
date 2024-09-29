class Employee{
    int salary=5000;
    String name;
    public int getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

}
class cellphone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
    public void callFriend(){
        System.out.println("calling hrishi.....");
    }
}
class square{
    int side=3;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class creating_class_Employee {
    public static void main(String[] args){
        Employee hrishi=new Employee();
        hrishi.setName("Hrishi");
        //hrishi.salary=50000;
        //hrishi.name=" Hrishi";
        System.out.println("My salary is" +hrishi.getSalary());
        System.out.println("My name is" +hrishi.getName());

        //2nd problem
        cellphone samsung=new cellphone();
        samsung.ring();
        samsung.vibrate();
        samsung.callFriend();

        //3rd problem
        square sq=new square();
        //sq.side=3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
     }

}

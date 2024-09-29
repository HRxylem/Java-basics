class Employee{
    //these are attributes
    int id;
    int salary;
    String name;
    public void Details () {
        System.out.println("My id is"+id);
        System.out.println("My Name is"+name);
    }
    public int getSalary(){
             System.out.println("my salary is"+salary);
             return salary;
    }
    
}
public class custom_class {
    public static void main(String[] args) {
       Employee hrishi=new Employee();
       //setting attributes
       hrishi.id= 97;
       hrishi.name=" Hrishi";
       hrishi.salary=50;
       //printing the attributes
       hrishi.Details();
       hrishi.getSalary();
       /*System.out.println(hrishi.id);
       System.out.println(hrishi.name);*/
    }
}

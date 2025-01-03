package schoolmanagementsystem;

public class AdminStaff extends Person{
    private String department;
    private String role;
    public AdminStaff(int id,String name,int age,String address,String department,String role){
        super(id,name,age,address);
        this.department = department;
        this.role = role;
    }
    public void assignTask(String task) {
        System.out.println(getName() + " from " + department + " department is assigned task: " + task);
    }
    
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Department: "+department+", Role: "+role);
    }

}

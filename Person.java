package schoolmanagementsystem;

public class Person{
       private int id;
       private String name;
       private int age;
       private String address;
       private int leaveBalance;

       public Person(int id,String name,int age,String address){
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
        this.leaveBalance=10;
       }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public int getLeaveBalance(){
        return leaveBalance;
    }
    public void setLeaveBalance(int leaveBalance) {
        this.leaveBalance=leaveBalance;
    }
    public boolean applyLeave(int days){
        if(leaveBalance>=days){
            leaveBalance-=days;
            System.out.println(name+" has taken "+days+" days of leave. Remaining balance: "+leaveBalance);
            return true;
        }else{
            System.out.println(name+" does not have enough leave balance.");
            return false;
        }
    }
       public void displayDetails(){
        System.out.println("ID: "+id+", Name: "+name+", Age: "+age+", Address: "+address);
       }
}
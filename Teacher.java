package schoolmanagementsystem;

public class Teacher extends Person {
    private String subject;
    private double salary;
    private String timetable;
    public Teacher(int id,String name,int age,String address,String subject, double salary) {
        super(id,name,age,address);
        this.subject = subject;
        this.salary = salary;
        this.timetable="Not Assigned";

    }
    public void assignTimetable(String timetable){
        this.timetable=timetable;
        System.out.println(getName()+" has been assigned the timetable: "+timetable);
    }


    @Override
    public void displayDetails(){
       super.displayDetails();
       System.out.println("Subject: " + subject+", Salary: " + salary+",TimeTable: "+timetable);
    }
}

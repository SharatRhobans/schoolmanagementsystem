package schoolmanagementsystem;

public class Student extends Person {
    private String grade;
    private String studentID;
    public Student(int id,String name,int age,String address,String grade,String studentID){
        super(id,name,age,address);
        this.grade=grade;
        this.studentID=studentID;
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade=grade;
    }
    public void calculateGrade(int marks){
        if(marks>=90){
            grade="A";
        }else if(marks>=75){
            grade="B";
        } else if(marks>=50){
            grade="C";
        }else{
            grade="F";
        }
        System.out.println(getName()+"'s grade is updated to: "+grade);
    }
    @Override
    public void displayDetails(){
         super.displayDetails();
         System.out.println("Grade: "+grade+", Student Id: "+studentID);
    }
   
}

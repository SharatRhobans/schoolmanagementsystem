package schoolmanagementsystem;

import java.util.ArrayList;

public class SchoolManagementSystem {
    public static void main(String[] args) {
    //     ArrayList<Person> people=new ArrayList<Person>();
    //     people.add(new Student(1,"Ravi",16,"123 street","10th Grade","S101"));
    //     people.add(new Student(2, "Jane Smith", 17, "456 Street", "11th Grade", "S102"));

    //     // Add Teachers
    //     people.add(new Teacher(3, "Mr. Wilson", 35, "789 Street", "Mathematics", 50000));
    //     people.add(new Teacher(4, "Ms. Taylor", 29, "321 Street", "English", 48000));

    //     // Add Admin Staff
    //     people.add(new AdminStaff(5, "Anna Johnson", 40, "654 Street", "Finance", "Accountant"));
    //     people.add(new AdminStaff(6, "Paul Brown", 45, "987 Street", "HR", "HR Manager"));

    //     System.out.println("School management System:");
    //     for(Person person:people){
    //         person.displayDetails();
    //         System.out.println("-------------------------------------------------");
    //     }
    // }

    // =======================

    // Create a list to store all people in the school
    ArrayList<Person> people = new ArrayList<>();

    // Add Students
    Student student1 = new Student(1, "sharath", 16, "123 Street", "10th Grade", "S101");
    Student student2 = new Student(2, "Rhoban", 17, "456 Street", "11th Grade", "S102");
    people.add(student1);
    people.add(student2);

    // Add Teachers
    Teacher teacher1 = new Teacher(3, "Mrs.Ramya", 35, "789 Street", "Mathematics", 50000);
    Teacher teacher2 = new Teacher(4, "Mrs.Srija", 29, "321 Street", "English", 48000);
    people.add(teacher1);
    people.add(teacher2);

    // Add Admin Staff
    AdminStaff admin1 = new AdminStaff(5, "mariselvam", 40, "654 Street", "Finance", "Accountant");
    AdminStaff admin2 = new AdminStaff(6, "senthil", 45, "987 Street", "HR", "HR Manager");
    people.add(admin1);
    people.add(admin2);

    // Perform actions
    System.out.println("School Management System:");

    student1.calculateGrade(85);
    teacher1.assignTimetable("Mon-Wed: 9 AM to 12 PM");
    admin1.assignTask("Prepare monthly financial report");

    for (Person person : people) {
        person.displayDetails();
        System.out.println("--------------------------------------------------");
    }

    // Manage leaves
    student1.applyLeave(2);
    teacher1.applyLeave(5);
    admin2.applyLeave(12); // Should fail due to insufficient balance
    }
}

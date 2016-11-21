
/**
 * Write a description of class StudentList here.
 * 
 * @Laurel Woods 
 * @10/28
 */
import java.util.ArrayList;
import java.util.Scanner;
public class StudentList
{
    private ArrayList <Student> students = new ArrayList();

    public StudentList()
    {

    }

    public void addStu(){
        System.out.println("\n" +"*Adding new student*");
        Scanner scr = new Scanner(System.in);
        int id = 0;
        double gpa = 0.0;
        String name = "";
        System.out.println("\n" +"Enter student name:");
        name = scr.nextLine();
        System.out.println("\n" +"Enter student ID number:");
        id = scr.nextInt();
        System.out.println("\n" +"Enter student GPA:");
        gpa = scr.nextDouble();
        String clearBuffer = scr. nextLine();
        students.add(new Student(id, gpa, name));
    }

    public void printList(){
        int control = -1;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i) != null){
                System.out.println("Name: " + students.get(i).getStuName());
                System.out.println("ID Number: " + students.get(i).getStuID());
                System.out.println("GPA: " + students.get(i).getStuGPA());
                control++;
            }
        }
        if(control < 0 || students.size() == 0)
            System.out.println("\n" + "No students in list.");
    }

    public void deleteStudent(){
        Scanner scr = new Scanner(System.in);
        System.out.println("\n" + "Enter the name or the ID number of the student you would like to delete");

        int control = 0;
        if(scr.hasNextInt()){
            int num = scr.nextInt();
            for (int i = 0; i < students.size(); i++) {
                if(students.get(i) != null){
                    if(students.get(i).getStuID() == num){
                        students.set(i, null);
                        control = 1;
                        System.out.println("\n" + "Student deleted from system.");
                    }
                }
            }
        } else if(scr.hasNextLine()){
            String stu = scr.nextLine();
            for (int i = 0; i < students.size(); i++) {
                if(students.get(i) != null){
                    if(students.get(i).getStuName().equals(stu)){
                        students.set(i, null);
                        control = 1;
                        System.out.println("\n" + "Student deleted from system.");
                    }
                }
            }
        }
        if (control == 0)
            System.out.println("Student not found.");

    }

    public void parseUserInput(String str, Student stud){
        if(str.indexOf(",") > 0){
            stud.setLast(str.substring(0, str.indexOf(",")));

        }
    }
}
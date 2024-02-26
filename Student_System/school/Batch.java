package school;
import java.util.*;
public class Batch{
    private String name;
    private ArrayList<Student> students;
    Batch(String name){
        this.name=name;
        this.students=new ArrayList<>();
    }
    public  String getDetails(){
        return String.format("Batch Name: %s\nNumber of Students: %d\n",this.name,this.students.size());
    }
    public String getName(){
        return this.name;
    }
    public void showStudents(){
        Iterator<Student> iter=students.iterator();
        while(iter.hasNext()){
            Student stud=iter.next();
            System.out.println(stud.getDetails());
            System.out.println();
        }
    }
    public void changeName(String name){
        this.name=name;
        System.out.println("Batch Name Changed ");
    }
    public void addStudent(String name,String rollNo){
        Student stud=new Student(name,rollNo);
        students.add(stud);
        System.out.println("Student Added");
    }
    public void removeStudent(String rollNo){
        Iterator<Student> iter=students.iterator();
        while(iter.hasNext()){
            Student stud=iter.next();
            if(stud.getRollNo().equals(rollNo)){
                iter.remove();
                System.out.println("Student removed");
                return;
            }
        }
        System.out.println("Student Not Found");
    } 
    

}
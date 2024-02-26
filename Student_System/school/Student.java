package school;

public class Student{
    private String name;
    private String rollNo;
    Student(String name,String rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public String getName(){
        return this.name;
    }
    public String getRollNo(){
        return this.rollNo;
    }
    public String getDetails(){
        return String.format("Student Name: %s \nRoll NO.: %s\n",this.name,this.rollNo);
    }
    public void setName(String name){
        this.name=name;
        System.out.println("Name changed to "+this.name);
    }
    public void setRollNo(String rollNo){
        this.rollNo=rollNo;
        System.out.println("Roll NO. changed to "+this.rollNo);
    }

}
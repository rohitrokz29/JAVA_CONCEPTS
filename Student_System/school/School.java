package school;
import java.util.*;

public class School{
    private ArrayList<Batch> batches ;
    private String name;
    private String password;
    public School(String name,String password){
        this.name=name;
        this.password=password;
        this.batches=new ArrayList<>();
    }
    public void addBatch(String name,String password){
        if(!this.password.equals(password)){
            System.out.println("Wrong Password");
            return;
        }
        Batch batch=new Batch(name);
        batches.add(batch);
        System.out.println("Batch Added");
    }
    public void removeBatch(String batch,String password){
        if(!this.password.equals(password)){
            System.out.println("Wrong Password");            
            return;
        }
        Iterator<Batch> iter=batches.iterator();
            while(iter.hasNext()){
                Batch b=iter.next();
                if(b.getName().equals(batch)){
                    iter.remove();
                    System.out.println("Batch Removed");
                    return;
                }
            }
            System.out.println("Batch Not Found");
    }
    public void getBatches(){
        Iterator<Batch> iter=batches.iterator();
        while(iter.hasNext()){
            Batch batch=iter.next();
            System.out.println(batch.getDetails());
            System.out.println();
        }
    }
    public void addStudent(String name, String rollNo, String batch){
        Iterator<Batch> iter=batches.iterator();
        while(iter.hasNext()){
            Batch curr=iter.next();
            if(curr.getName().equals(batch)){
                curr.addStudent(name,rollNo);
                return;
            }
        }
        System.out.println("Batch NOt Found");
    }
    public void removeStudent(String rollNo,String batch){
        Iterator<Batch> iter=batches.iterator();
        while(iter.hasNext()){
            Batch b=iter.next();
            if(b.getName().equals(batch)){
                b.removeStudent(rollNo);
                return;
            }
        }
        System.out.println("Batch Not Found");
    }
    public void getStudents(String batch){
        Iterator<Batch> iter=batches.iterator();
        while(iter.hasNext()){
            Batch b=iter.next();
            if(b.getName().equals(batch)){
                System.out.println(batch+"\n");
                b.showStudents();
                return;
            }   
        }
    }
}
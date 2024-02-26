import java.io.*;
import school.*;
public class Main{
    public static void main(String[] args){
        School iitp=new School("IIT Patna","iitPatna@514");
        iitp.addBatch("CBE","iitp");
        iitp.addBatch("CBE","iitPatna@514");
        iitp.addBatch("MNC","iitPatna@514");
        iitp.getBatches();
        iitp.addStudent("Mangu","21mc32","MNC");
        iitp.addStudent("Pritam","21cb22","CBE");
        iitp.addStudent("John","21cb44","CBE");
        iitp.getStudents("CBE");
        iitp.getStudents("MNC");
        iitp.removeStudent("21cb22","CBE");
        iitp.getStudents("CBE");
        iitp.getStudents("MNC");     
        iitp.removeBatch("MNC","iitp");
        iitp.removeBatch("MNC","iitPatna@514");
        iitp.getBatches();
    }
}
import java.util.*;

class Employee{
 int Empid, Salary;
 String Name,Address;
 Employee(int Empid,int Salary,String Name,String Address){
  this.Empid=Empid;
  this.Salary=Salary;
  this.Name=Name;
  this.Address=Address;
 }
 Employee(){
 }
}

class Teacher extends Employee{
 String Department,Subjuct;
 Teacher(int Empid,int Salary,String Name,String Address,String Department,String Subjuct){
 super(Empid,Salary,Name,Address);
 this.Department=Department;
 this.Subjuct=Subjuct;
}
 Teacher(){
 super();
 }
 
 void displayTeacher(Teacher[] teachers){
  String format= "%-10s %-20s %-20s %-10s %-20s %-20s";
  System.out.format(format,"Empid","Salary","Name","Address","Department","Subjuct");
  System.out.println();
  System.out.format(format,"_______","_________","__________","_________","________","______");
  System.out.println();
  for(Teacher t: teachers){
   System.out.format(format,t.Empid,t.Salary,t.Name,t.Address,t.Department,t.Subjuct);
   System.out.println();
  }
 }
}

class Employees{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
  System.out.println("Enter no. of Employees");
  int size=sc.nextInt();
  Teacher[] teachers=new Teacher[size];
   for(int i=0;i<size;i++){
    System.out.println("Enter Empid");
    int Empid=sc.nextInt();
    System.out.println("Enter Name");
    String Name=sc.next();
    System.out.println("Enter Sallery");
    int Sallery=sc.nextInt();
    System.out.println("Enter Address");
    String Address=sc.next();
    System.out.println("Enter Department");
    String Department=sc.next();
    System.out.println("Enter Subjuct");
    String Subjuct=sc.next();
    System.out.println("");
    
    teachers[i]=new Teacher(Empid,Sallery,Name,Address,Department,Subjuct);
    }
    Teacher t1=new Teacher();
    t1.displayTeacher(teachers);
   
  }
 }
    
  

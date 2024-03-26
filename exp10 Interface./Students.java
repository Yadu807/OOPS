interface Student{
 int score=25;
 void display();
 
}

interface Sports{
 int score=44;
 void displaysports();
 
}

class Result implements Student,Sports{
 public void display(){
  System.out.println("Student Score ="+Student.score);
 }
 
 public void displaysports(){
  System.out.println("Student sports Score ="+Sports.score);
 }
}
 
class Students{
 public static void main(String[] args){
  Result r=new Result();
  r.display();
  r.displaysports();
 }
} 
 

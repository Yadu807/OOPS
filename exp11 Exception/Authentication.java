import java.util.*;

class InvalidUserExpet extends Exception {
 public InvalidUserExpet(String msg){
  super(msg);
 }
}

class Authentication {
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the User name");
  String user=sc.next();
  System.out.println("Enter the Password");
  String pass=sc.next();
  try{
   if(user.length()<8)
    throw new InvalidUserExpet("User name must contain more than 8 letters");
   else if(!pass.equals("Yadu"))
    throw new InvalidUserExpet("Password is Incorrect");
   else
    System.out.println("Login Succefully");
  }
  catch(InvalidUserExpet e){
   e.printStackTrace();
  }
 }
}
  

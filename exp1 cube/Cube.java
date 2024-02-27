import java.util.Scanner;

 class Cube{
 public static void main(String[]args){
  Scanner s = new Scanner(System.in);
  System.out.println("Enter limit");

  int a=s.nextInt();
  for(int i=1;i<=a;i++){
  System.out.println(i+"\t:"+i*i*i);  
  }
}}

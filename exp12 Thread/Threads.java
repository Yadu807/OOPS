import java.util.*;

class Multiplication extends Thread {
 public void run(){
  try{
   for(int i=0;i<=10;i++){
    System.out.printf("\n5 x "+i+"="+5*i ); 
    Thread.sleep(500);
   }
  }
  catch(InterruptedException e){
   System.out.println("Multiplication is iNTERUPTED");
  }
 }
}

class Prime extends Thread {
 int limit,count,flag,i,j;
 public Prime(int limit){
  this.limit=limit;
 }
 public void run() {
  try{
   int j=2;
   while(count < limit){
    flag=1;
    for(i=2;i<=(j-1);i++){
     if (j%i==0){
      flag=0;
      break;
     } }
     if (flag==1){
      System.out.println("\nPrime no :"+j);
      count ++;
     }
     j++;
     Thread.sleep(500);
    }
   }
   catch(InterruptedException e){
    System.out.println("Primr Thread is iNTERUPTED");
   }
  }
 }
  

class Threads {
 public static void main(String[] args){
  Multiplication mul=new Multiplication();
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter no of prime numbers");
  int l=sc.nextInt();
  Prime p=new Prime(l);
  mul.start();
  p.start();
 }
}   
       
   
 
 

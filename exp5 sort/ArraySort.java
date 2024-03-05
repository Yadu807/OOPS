import java.util.Scanner;
import java.util.Arrays;
class ArraySort{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the no of string");
  int n=sc.nextInt();
  String[] arr=new String[n];
  System.out.println("enter the string");
  for(int i=0;i<n;i++){
   arr[i]=sc.next();
  }
  System.out.println("Enter the option");
  int opt=sc.nextInt();
  System.out.println("\n1.In-Build method\n2.User-build method");
  switch(opt){
   case 1: Arrays.sort(arr);
          break;
   case 2 : 
    String temp;
    for(int i=0;i<n-1;i++){
     for(int j=i+1;j<n;j++){
      if(arr[i].compareTo(arr[j])>0){
       temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
      }
     }
    }
   
    }
    System.out.println("Sorted array is");
    for(int i=0;i<n;i++){
     System.out.println(arr[i]+" ");
    
   }
  }
 }

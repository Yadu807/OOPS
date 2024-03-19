import java.util.*;

class ArraySearch
         {
         
          public static void main(String[] args)
            {
              System.out.println("Enter the size of the array : ");
              Scanner sc=new Scanner(System.in);
              int size=sc.nextInt();
              int result=-1;
              int[] arr=new int[size];
              System.out.println("Enter the elements of the array : ");
              for(int i=0;i<size;i++)
                {
                  arr[i]=sc.nextInt();
                 }
               System.out.println("Enter the elements to search : ");
               int se=sc.nextInt();
               ArraySearch as=new ArraySearch();
               System.out.println("Enter the options : ");
               System.out.println("\n1.Linear Search\n2.Simple binary search\n3.Binary Search\n4.Recursive Binary Search");
               int opt=sc.nextInt();
               switch(opt)
                {
                 case 1: System.out.println("Linear Search");
                 	 result=as.LinearSearch(se,arr);
                 	 break;
                 case 2: System.out.println("Simple Binary Search");
                 	 Arrays.sort(arr);
                         result=as.SimBinary(se,arr);
                         break;
                 case 3: System.out.println("Array.binarySearch()");
                 	 Arrays.sort(arr);
                         int index=Arrays.binarySearch(arr,se);
                         try{
                          result=arr[index];
                         }
                         catch(Exception e){
                          result=-1;
                         }
                         break;
                 case 4: Arrays.sort(arr);
                         result=as.RecursiveBS(arr,0,size-1,se);
                         break;                      
                 }
                 if(result>-1)
                   {
                    System.out.println("Found....");
                    }
                  else{
                    System.out.println("Not found...");
                    }
                 
                 }
                 
                 //linear search
                 int LinearSearch(int n,int arr[])
                   {
                    for(int i=0;i<arr.length;i++)
                      {
                       if(arr[i]==n)
                         {
                          return 1;
                          }
                         
                          }
                          return -1;
                          }
                          
                  //Simple binary search
                  
                  int SimBinary(int n,int arr[])
                   {
                   
                    int first=0,mid,last=arr.length-1;
                    mid=(first+last)/2;
                    while(first<=last)
                     {
                      if(arr[mid]<n)
                        {
                          first=mid+1;
                         }
                       else if(arr[mid]>n)
                          {
                           last=mid-1;
                           }
                       else{
                           return mid;
                           }
                           mid=(first+last)/2;
                           }
                           return -1;
                           }
                           
                           
                           
                    //Recursive binary Search
                    
                    int RecursiveBS(int [] arr,int first,int last,int x) {
                     if(first<=last && first<=arr.length-1){
                      int mid=first+(last-first)/2;
                      if (arr[mid]<x){
                       return RecursiveBS(arr,mid+1,last,x);
                      }
                      if(arr[mid]>x){
                       return RecursiveBS(arr,first,mid-1,x);
                      }
                      return mid;
                     }
                     return -1;
                    }
                   }
                             

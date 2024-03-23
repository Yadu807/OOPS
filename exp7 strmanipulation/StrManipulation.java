import java.util.*;

class StrManipulation{
 public static void main(String[] args){
  char ch[]={'w','e','l','c','o','m','e'};
  String newstr=new String(ch);
  System.out.println("The String from char[] using New operator :"+ newstr);
  byte asci[]={66,44,33,22,99};
  newstr =new String(asci);
  System.out.println("The String from byte[] using New operator :"+ newstr);
  String s1="Good";
  String s2="Morning";
  String s4="GOOD";
  String s3=s1.concat(s2);
  System.out.println("String length of Good :"+s1.length());
  System.out.println("String Good convert to Upprcase : "+s1.toUpperCase());    
  System.out.println("String Good convert to Lowercase : "+s1.toLowerCase());     
  System.out.println("Concatination of s1 and s2 : "+s1.concat(s2));
  System.out.println("Concatination using + operator"+s1+s2);
  System.out.println("Character at 3rd position of s1 : "+s1.charAt(3));
  System.out.println("Character at 4rd position of s2 : "+s2.charAt(4));
  char[] c= new char[10];
  s3.getChars(1,4,c,0);
  System.out.println("get characters from a string using getChars : "+new String(c));
  System.out.println("Using equals : "+s1.equals(s4));
  System.out.println("Using equals ignore case : "+s1.equalsIgnoreCase(s4));
  System.out.println("Using Starts with : "+s1.startsWith("G"));
  System.out.println("Using Compares to :"+s1.compareTo(s4));
  System.out.println("Using Compares to ignore case : "+s1.compareToIgnoreCase(s4));
  String s5="Have a nice day";
  System.out.println("index of nice in string "+s5+" : "+s5.indexOf("nice"));
  System.out.println("Substring of string "+s5+" : "+s5.substring(7));
  System.out.println("Replace nice with good in string "+s5+" :"+s5.replace("nice",s1));
  float f=3.14f;
  System.out.println("Usining value of :"+String.valueOf(f));
  
  
  } 
}
    

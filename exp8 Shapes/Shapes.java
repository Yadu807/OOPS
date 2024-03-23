class Shapes{
 //squre
 int area(int l){
  return l*l;
 }
 
 //rectangle
 int area(int l,int b){
  return l*b;
 }
 
 //cuboid
 int area(int l,int b,int h){
  return ((2*l*h)+(2*l*h)+(2*h*h));
 }
 
 public static void main(String[] args){
  int ar;
  Shapes a=new Shapes();
  ar=a.area(5);
  System.out.println("area of Square "+ar);
  ar=a.area(5,4);
  System.out.println("area of Rectangle "+ar);
  ar=a.area(5,6,5);
  System.out.println("area of Cuboid" +ar);
 }
}
  
  

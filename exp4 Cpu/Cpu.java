class Cpu{
 int price=70000;
 class Processor{
  int core=8;
  String manufacturer= "intel";
  void display(){
   System.out.println("Core="+core);
   System.out.println("Manufacturer="+manufacturer);
  }
 }
 void display(){
  System.out.println("Price="+price);
  Processor p=new Processor();
  p.display();
 }
 static class Ram{
  int memory= 8;
  String manufacturer= "ghh";
  void display(){
   System.out.println("Memory="+memory);
   System.out.println("Manufacturer="+manufacturer);
  }
 }
}
class Cpus{
 public static void main(String[] args){
  Cpu c1=new Cpu();
  c1.display();
  Cpu.Ram c2=new Cpu.Ram();
  c2.display();
 }
}   

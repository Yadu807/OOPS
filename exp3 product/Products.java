import java.util.Scanner;
class Product{
int pCode,price;
String pName;
Product(int pCode, String pName, int price){
this.pCode = pCode;
this.pName = pName;
this.price = price;
}
}

class Products{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Product Code: ");
int pCode = sc.nextInt();
System.out.print("Enter Product Name: ");
String pName = sc.next();
System.out.print("Enter Product Price: ");
int price = sc.nextInt();
Product[] ps = new Product[3];
ps[0] = new Product(pCode,pName,price);
ps[1] = new Product(134,"Notebook",10);
ps[2] = new Product(143,"Card Board",13);
int minPrice = ps[0].price;
System.out.println("=================");
System.out.println("Code\tProduct Name\tPrice");
System.out.println("----\t-----------\t-----");

for(Product p: ps ){
System.out.println(p.pCode + "\t" + p.pName+"\t" + p.price);
if(minPrice > p.price){
minPrice = p.price;
}
}

System.out.println("=================");
System.out.println("******************");
System.out.println("LOWEST COST PRODUCT");
System.out.println("---------------------");
System.out.println("Code\tProduct Name\tPrice");
System.out.println("----\t-------------\t-----");

for(Product p: ps ){
if(minPrice == p.price){
System.out.println(p.pCode + "\t" + p.pName+"\t" + p.price);
}
}
System.out.println("******************");
}
}
	


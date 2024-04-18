class Publisher{
              
               String pubName;
               Publisher(String pubName){
                          this.pubName=pubName;
                          
                              }
                              
                              
               void display(){
                   	     System.out.println("Publisher\t"+pubName);
                   			
                   		}}
                   		

class Book extends Publisher{

		String title;
		String author;
		Book(String pubName,String title,String author)
		   {
		      super(pubName);
		      this.title=title;
		      this.author=author;
		      }
		 
		 void display(){
		        super.display();
		        System.out.println("Title\t :"+title);
		        System.out.println("Author\t ;"+author);
		        }
		        }
		      
class Literature extends Book{

                       String type;
                       Literature(String pubName,String title,String author,String type)
                       {
                       super(pubName,title,author);
                       this.type=type;
                       }
                       void display()
                       {
                       super.display();
                       System.out.println("Type :\t"+type);
                       }
                       }
  
class Fiction extends Book{
			
			String genre;
			Fiction(String pubName,String title,String author,String genre)
			{
			super(pubName,title,author);
			this.genre=genre;
			}
			void display()
			{
			super.display();
			System.out.println("Genre :\t"+genre);
			}
			}
			
			
			
class Books1{

             public static void main(String[] args)
             {
             Literature[] l=new Literature[2];
             Fiction[] f=new Fiction[2];
             
             
             l[0]=new Literature("Harper Collins","The Alchemist","Paulo Coelho","Drama");
             l[1]=new Literature("D C Books","Aarachar","K R Meera","Novel");
             f[0]=new Fiction("Cassel","Macbeth","William Shakespeare","Tragedy");
             
             f[1]=new Fiction("Penguin Books","The Legend of Khasak","O V Vijayan","Magical");
             
             System.out.println("Literature:\t");
             for(int i=0;i<l.length;i++)
               {
               System.out.println("#"+(i+1));
               l[i].display();
               }
                       
	       
	       System.out.println("Fiction:\t");
             for(int i=0;i<f.length;i++)
               {
               System.out.println("#"+(i+1));
               f[i].display();
               }     
	}}	        


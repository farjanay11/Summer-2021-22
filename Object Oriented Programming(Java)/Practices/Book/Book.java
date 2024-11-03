public class Book{
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy;
	
	public Book(){
		System.out.println("Empty Constructor");
	}
	public Book(String bookName,String bookAuthor,String bookId,String bookType,int bookCopy){
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookId=bookId;
		this.bookType=bookType;
		this.bookCopy=bookCopy;
		System.out.println("Parameterized Constructor");
	}
	public void setbookName(String bookName){this.bookName=bookName;}
	public void setbookAuthor(String bookAuthor){this.bookAuthor=bookAuthor;}
	public void setbookId(String bookId){this.bookId=bookId;}
	public void setbookType(String bookType){this.bookType=bookType;}
	public void setbookCopy(int bookCopy){this.bookCopy=bookCopy;}
	public String getbookName(){return this.bookName;}
	public String getbookAuthor(){return this.bookAuthor;}
	public String getbookId(){return this.bookId;}
	public String getbookType(){return this.bookType;}
	public int getbookCopy(){return this.bookCopy;}
	
	public void showBookinfo(){
		System.out.println("Book Name: "+this.getbookName());
		System.out.println("Book Author: "+this.getbookAuthor());
		System.out.println("Book Id: "+this.getbookId());
		System.out.println("Book Type: "+this.getbookType());
		System.out.println("Book Copy: "+this.getbookCopy());
	}
	
	public static void main (String [] args){
		Book b= new Book();
		b.setbookName("A Time To Kill");
		b.setbookAuthor("John Grisham");
		b.setbookId("00101376583");
		b.setbookType("Novel");
		b.setbookCopy(5000);
		b.showBookinfo();
		Book b1= new Book("A time to kill","John Grisham","4567889","Novel",5000);
		b1.showBookinfo();
	}
}
		
		
	
	
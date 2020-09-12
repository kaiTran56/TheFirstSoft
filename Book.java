public class Book{
	private String name ;
	private String author;
	private double price;
	public Book(String name , String author, double price ){
		this.name = name ;
		this.author = author;
		this.price = price;
	}
	public String getName(){
		return this.name;
	}
	public String getAuthor(){
		return this.author;
	}
	public double getPrice(){
		return this.price;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public void setPrice(double pricce){
		this.price = price;
	}
	public String toString(){
		return this.name+ " : " + this.author + " : " + this.price;
	}
}
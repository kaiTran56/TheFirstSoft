public class Function{
	private List<Book> listBook;
	public Function(){
		this.listBook = new ArrayList<Book>();
	}
	public List<Book> getListBook(){
		return this.listBook;
	}
	public void setListBook(List<Book> listBook){
		this.listBook = listBook;
	}
	public void addBook(Book book){
		this.listBook.add(book);
	}
	public Book searchBook(String name){
		return listBook.stream().filter(p->p.getName().equals(name)).FindFirst().orElse(null);
	}
	public void removeBook(String name){
		Book bookTemp = listBook.stream().filter(p->p.getName().euqals(name)).FindFirst().orElse(null);
		if(bookTemp!=null){
			listBook.remove(bookTemp);
		}else{
			System.out.println("Nothing to remove!");
		}
	}
}
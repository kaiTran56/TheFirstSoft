public class Person{
	private String name;
	private String room;
	private int age;
	public Person(String name, String room, String age){
		this.name = name;
		this.room = room;
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public String getRoom(){
		return this.room;
	}
	public int getAge(){
		return this.age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setRoom(String room){
		this.room = room;
	}
	public void setAge(int age){
		this.age = age;
	}
}

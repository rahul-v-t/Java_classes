class Person {
	//Instance virables(data or state)
	String name;
	int age;
	
	//Classes contains
	
	//1.Data
	//2.Subroutines(methods)
	void speak() {
		System.out.println("My Name is " + name + ". And I am " + age + " years old.");
	}
	 	
}
public class Classes {

	public static void main(String[] args) {
		
		//Create a Person object using Person class
		Person person1 = new Person();
		person1.name = "Govind";
		person1.age = 34;
		person1.speak();
		//Creates 2nd Person Object
		
		Person person2 = new Person();
		person2.name = "Arun";
		person2.age = 32;
		person2.speak();
		
		
		System.out.println(person2.name);
		System.out.println(person1.age);

	}

}

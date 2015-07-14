public class HelloWorld {
	public static void main (String[] args){
		//System.out.println("Hello World!");
		Person p = new Person();
		Person q = new Person();
		
		System.out.println(p.getName() + " is " + p.getAge() + " years old and " + p.getHeight() + " cm tall.");
		p.setName("Jim");
		System.out.println(p.getName());
		p.setAge(45);
		System.out.println(p.getAge());
		p.increaseAge();
		System.out.println(p.getAge());
		q.setName("Bob");
		System.out.println(q.getName());
		p.setHeight(184);
		System.out.println(p.getHeight());
		System.out.println(p.changeHeight(10));
		System.out.println(p.changeHeight(-5));
		System.out.println(p.getName() + " is " + p.getAge() + " years old and " + p.getHeight() + " cm tall.");
		System.out.println(q.getName() + " is " + q.getAge() + " years old and " + q.getHeight() + " cm tall.");
	}
}

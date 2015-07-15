
public class Boxer {

	private boolean BoxingDay(Integer day, Boolean foo){
		System.out.println("fnArgle");
		Short num = 360;
		if (foo){
			System.out.println(++num);
		} else {
			System.out.println(--num);
		}
		return !foo;
	}
	
	public static void main(String[] args) {
		// Simple class to demonstrate boxing/unboxing
		Boxer boxing = new Boxer();
		boxing.BoxingDay(52, false);
	}
}

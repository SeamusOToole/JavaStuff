
public class LabelDemoApp {

	public static void main(String[] args) {
		// simple app to demonstrate loops with labels
		
		System.out.println("Label Demo App");
		
		outer:
			for (int i=0; i<5; ++i){
				for (int j=0; j<5; ++j){
					System.out.println("Hello from inner loop!");
					continue outer;
				}
				System.out.println("Hello from outer loop!");
			}
		System.out.println("goodbye");

	}

}


public class StringBuilderApp {

	public static void main(String[] args) {
		// Simple App for demoing StringBuilder
		StringBuilder sb = new StringBuilder("This will get messy");
		System.out.println(sb);
		for(int i=0; i<10; ++i){
			sb.insert(i*2+1, i);
			System.out.println(sb);
		}

	}

}

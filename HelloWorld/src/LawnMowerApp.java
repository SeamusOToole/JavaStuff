
public class LawnMowerApp {

	public static void main(String[] args) {
		LawnMower lawnMower = new LawnMower();
		System.out.println(lawnMower.isEngineOn());
		lawnMower.turnEngineOn();
		System.out.println(lawnMower.isEngineOn());
		lawnMower.setColour("Red");
		System.out.println("colour is " + lawnMower.getColour());
		System.out.println("new colour is " + lawnMower.setColour("Blue"));
		

	}

}


public class HelicopterApp {

	public static void main(String[] args) {
		System.out.println("test");
		Helicopter helicopter = new Helicopter();
		helicopter.setMaxAltitude(1000.0);
		helicopter.setCurrentAltitude(100.0);
		
		System.out.println(helicopter.getCurrentAltitudeInMeters());
		System.out.println(helicopter.getCurrentAltitudeInFeet());
		
	}

}

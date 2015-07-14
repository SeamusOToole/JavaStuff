
public class Helicopter {
	//states
	private double currentAltitude;
	private double maxAltitude;
	private String purpose; 
	private int crewSize;
	private int maxPassangers;
	private int currentPassangers;		
	
	//behaviours
	
	// getter and setter for max altitude
	void setMaxAltitude(double maxAltitude){
		this.maxAltitude = maxAltitude;
	}
	
	double getMaxAltitude(){
		return this.maxAltitude;
	}
	
	// getter and setter for current altitude
	
	/**
	 * @deprecated
	 * @return
	 */
	double getCurrentAltitude(){
		return this.currentAltitude;
	}
	
	double getCurrentAltitudeInFeet(){
		return this.currentAltitude;
	}
	
	double getCurrentAltitudeInMeters(){
		return this.getCurrentAltitudeInFeet() / 3.3;
	}
	
	boolean setCurrentAltitude(double newAltitude){
		if (newAltitude > this.maxAltitude){
			System.out.println("New altitude " + newAltitude 
					+ " exceeds maximum Altitude " + this.maxAltitude);
			System.out.format("new altitude %.0f is greater than max altitude %.0f", 
					newAltitude, this.maxAltitude);
			return false;
		}
		this.currentAltitude = newAltitude;
		return true;
		
	}
	

}


public class LawnMower {
	//State
	private boolean engineOn = false; 
	private enum EngineType {NONE, PETROL, DIESEL, ELECTRIC, HYBRID};
	private String colour = "undefined";
	EngineType engineType;
	
	//Behavior
	boolean isEngineOn(){
		return engineOn;
	}
	
	void turnEngineOn(){
		this.engineOn = true;
	}
	
	void turnEngineOff(){
		this.engineOn = false;
	}
	
	String setColour(String newColour){
		this.colour = newColour;
		return this.colour;
	}

	String getColour(){
		return this.colour;
	}
}

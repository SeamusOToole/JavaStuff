public class Person {
	int age = 1;
	String name = "unnamed";
	char gender = 'm';
	int height = 50;
	Boolean isAlive = true;

	
	int getHeight(){
		return height;
	}

	void setHeight(int newHeight){
		height = newHeight;
	}
	
	int changeHeight(int growAmount){
		height = height + growAmount;
		return height;
	}
	
	String getName(){
		return name;
	}

	void setName(String newName){
		name = newName;
	}

	void setAge (int newAge){
		age = newAge;
	}

	int getAge(){
		return age;
	}

	void increaseAge (){
		age=age+1;
	}
	
	char getGender(){
		return gender;
	}
	
	void setGender (char newGender){
		gender = newGender;
	}

}

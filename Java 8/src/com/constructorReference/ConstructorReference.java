package com.constructorReference;

@FunctionalInterface
interface UserInterface{
	User setUserName(String name, int id);
}

class User{
	String name;
	int id;
	
	public User(String name,int id) {
		this.name = name;
		this.id = id;
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
		
		// Using Normal Lambda Expression:
		UserInterface userInterface = (name,id) -> new User(name,id);
		User user = userInterface.setUserName("Thinesh",5);
		System.out.println(user.name+" "+user.id);
		
		//Using Constructor Reference:
		UserInterface userInterface2 = User::new;
		User user2 = userInterface2.setUserName("Narayanamasy",8);
		System.out.println(user2.name+" "+user2.id);
	}
	
	
}

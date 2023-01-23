package unit_1;

enum Color{
	WHITE, CREAM, FAWN, CINNAMON, CHOCLATE, RED, LILAC, BLUE, BLACK, LAVENDER
}

public class Cat {
	String name;
	Double age;
	Color color;
	String type;
	static int numberofCats;
	
	public Cat( ){}
    public Cat(String name){
	  this.name = name;
  }
    Cat(String name, Double age, Color color, String type){
	  this.name = name;
	  this.age = age;
	  this.color = color;
	  this.type = type;
  }
    Cat(String name, String breed){
	  this.name = name;
	  System.out.println(breed);
  }
    
    public static int getNumberofCats() {
		return numberofCats;
    	
    }
 String eat() {
	 return "Favorite food";
 }
 boolean play(String toy) {
	 return false;
 }
  
}

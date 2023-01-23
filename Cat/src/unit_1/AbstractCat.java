package unit_1;

public class AbstractCat {
	private String name;
	private double age;
	private Color color;
	private String type;
	static int numberOfCats;
	
	public AbstractCat(String name, double age, Color color, String type) {
		this.name =name;
		this.age =age;
		this.color = color;
		this.type = type;
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getAge() {
		return age;
	}



	public void setAge(double age) {
		this.age = age;
	}



	public Color getColor() {
		return color;
	}



	public void setColor(Color color) {
		this.color = color;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}

	public static int getNumberOfCats() {
		return numberOfCats;
		
	}
	
	public static void setNumberOfCats(int numberOfCats) {
		AbstractCat.numberOfCats = numberOfCats;
	}
	


	String eat() {
		return "Favorite food";
	}
	
	boolean play(String toy) {
		return false;
	}
	@Override
	public String toString() {
		return "AbstractCat [name=" + name + ", age=" + age + getName() + ", getAge()=" + getAge() + ", eat()=" + eat() + ", getClass()=" + getClass() + super.toString() +"]";
	}
	
}

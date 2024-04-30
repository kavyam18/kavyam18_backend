package day2;

public class GrandFather {

	
	int num=1;
	public void havingFood(String food) {
		System.out.println("having");
	}
	public void havingFood(String food, String time) {
		System.out.println("having" + food + "at" + time);
	}
	public void house() {
		System.out.println("house method");
	}
	public static void main(String[] args) {
	
       GrandFather gf = new GrandFather();
       gf.havingFood("pallav", "night");
	}

}

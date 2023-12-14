package week1.day1;

public class Bike extends Car {
public static void main(String[] args) {
	Car c=new Car();
	c.applyBreak();
	c.soundHorn();
	Bike b=new Bike();
	b.applyBreak();
	b.soundHorn();
}
}

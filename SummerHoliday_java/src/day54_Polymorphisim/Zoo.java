package day54_Polymorphisim;

public abstract class Zoo implements Alive {
	abstract public void move();
}
class Tiger extends Zoo{
	@Override
	public void move() {
		System.out.println("run");
	}
	public void grau() {
		System.out.println("Grau");
	}
}
class Cat extends Tiger{
	public void move() {
		System.out.println("move fast");
	}
}
class Falcon extends Zoo{
	@Override
	public void move(){
		System.out.println("fly");
	}public void see() {
		System.out.println("very sharp!");
	}
}
class Oktopus extends Zoo{
	@Override
	public void move() {
		System.out.println("sweem");
	}
	public void vacuum() {
		System.out.println("holds tight");
	}
}

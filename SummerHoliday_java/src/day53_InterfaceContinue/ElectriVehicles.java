package day53_InterfaceContinue;

abstract class A implements GasVehicles{
	abstract public void met();
	}

public interface ElectriVehicles extends A{

	public void charge();// abstract has been given by default 
	
	
	void selfdriving();// public has been given by default
	
	
	
}

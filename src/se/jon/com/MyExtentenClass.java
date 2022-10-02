package se.jon.com;

abstract public class MyExtentenClass implements MyInterface {
	private double area;
	//private double r;
	
	

	@Override
	public double myArea(double r) {
		// TODO Auto-generated method stub
		area = (3.14*3.14)*r;
		return area;
	}
	
	public void printMe(){
		System.out.println(" Area "+ area);
		
	}
	
}

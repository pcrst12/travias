package javabook.ch5;

public class CellPhone extends Product {
	String carrier;
	
	public CellPhone(String pname, int price, String Carrier) {
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
	}
	
	@Override
	public void printExtra() {
		System.out.println("Ελ½Ε»η: " + carrier);
	}
}

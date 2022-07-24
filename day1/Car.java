package week1.day1;

public class Car {
	public void applyBreak() {
    	System.out.println("BREAK");
    	
    }
    public void applyAccelarate() {
    	System.out.println("ACCLERATE");
    }
    public void applyGear() {
    	System.out.println("CHANGE GEAR");
    }
    public void switchOnAc() {
    	System.out.println("COOLING");
    	
    }

	public static void main(String[] args) {
		Car audi=new Car();
		audi.applyBreak();
		audi.applyAccelarate();
		audi.applyGear();
		audi.switchOnAc();
		// TODO Auto-generated method stub

	}

}

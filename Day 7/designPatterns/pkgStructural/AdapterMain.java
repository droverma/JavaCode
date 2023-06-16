package pkgDay.designPatterns.pkgStructural;

class Laptop{
	public void powerOn(int power) {
		System.out.println("Laptop is getting electricity of power: " + power);
	}
}
class Electricity{
	public int voltage() {
		return 100;
	}
}
class Adapter{
	Laptop l;
	Electricity e;
	Adapter(){}
	Adapter(Laptop l,Electricity e){ this.l=l;this.e=e;}
	public void switchOnLap() {
		l.powerOn(e.voltage());
	}
}

public class AdapterMain {

	public static void main(String[] args) {
		Adapter a=new Adapter(new Laptop(), new Electricity());
		a.switchOnLap();

	}

}


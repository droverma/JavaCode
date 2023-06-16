package pkgDay.designPatterns.pkgStructural;

interface Land{
	public void getType();
}
class Assam implements Land{
	public void getType(){
		System.out.println("Assam: Major Greenary area");
	}
}
class WB implements Land{
	public void getType(){
		System.out.println("WB: Major Agricultural area");
	}
}
class TrainBridge{
	public void route(Land src, Land dest) {
		src.getType();
		System.out.println(" is connected to ");
		dest.getType();
	}
}


public class BridgeMain {

	public static void main(String[] args) {
		TrainBridge b=new TrainBridge();
		b.route(new Assam(), new WB());
		

	}

}

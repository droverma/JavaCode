package pkgDay.designPatterns.pkgStructural;

class Original{
	public int sum(int x, int y) {
		System.out.println("Big algo 2 sec to run it..");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {	}
		return x+y;
	}
}
class Proxy{
	private Original o;
	public Proxy() {
		o=new Original();
	}
	public int sum(int x, int y) {
		return o.sum(x, y);
	}
}

public class ProxyMain {

	public static void main(String[] args) {
		Proxy p=new Proxy();
		System.out.println(p.sum(5, 6));

	}

}

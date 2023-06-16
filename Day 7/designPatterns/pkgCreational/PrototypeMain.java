package pkgDay6.designPatterns.pkgCreational;

class Original{
	public int op(int x, int y) {
		return 0;
	}
}
class Add extends Original{
	public int op(int x, int y) {
		return x+y;
	}
}
class Sub extends Original{
	public int op(int x, int y) {
		return x-y;
	}
}

class PrototypeOriginal{
	int sum(int x, int y, Original o) {
		return o.op(x, y);
	}
	int sub(int x, int y, Original o) {
		return o.op(x, y);
	}
	
}
public class PrototypeMain {

	public static void main(String[] args) {
		PrototypeOriginal p1=new PrototypeOriginal();
		System.out.println(p1.sum(4, 5, new Add()));

	}

}


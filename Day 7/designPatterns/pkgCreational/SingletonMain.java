package pkgDay6.designPatterns.pkgCreational;

class Singleton{
	private static Singleton singleObj;
	public String msg;
	private Singleton() {}
	public static Singleton getObj() {
		if(singleObj == null)
			singleObj = new Singleton();
		return singleObj;
	}
}

public class SingletonMain {
	public static void main(String[] args) {
		Singleton s1=Singleton.getObj();
		s1.msg ="hello";
		System.out.println(s1.msg); //hello
		Singleton s2=Singleton.getObj();
		s2.msg ="World";
		System.out.println(s1.msg); //World
		System.out.println("S1==S2? "+ (s1==s2));

	}

}

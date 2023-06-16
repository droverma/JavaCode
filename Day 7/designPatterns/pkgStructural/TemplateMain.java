package pkgDay.designPatterns.pkgStructural;

class DataType<T>{
	T obj;
	DataType(){
//		obj=(T)new Object();
	}
	DataType(T o){obj=o;}
	public void display() {
		System.out.println("The Object : "+ obj + " is of type: " + obj.getClass().getName());
	}
}
class EmpA{
	int empId;
	String eName;
	public EmpA(int empId, String eName) {
		super();
		this.empId = empId;
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "EmpA [empId=" + empId + ", eName=" + eName + "]";
	}
	
}

public class TemplateMain {

	public static void main(String[] args) {
		DataType<Integer> d1=new DataType<>(100);
		d1.display();
		DataType<EmpA> d2=new DataType<>(new EmpA(101,"Abc"));
		d2.display();
		
	}

}

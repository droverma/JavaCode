package pkgDay6.designPatterns.pkgCreational;

public class Builder {
	public static void main(String[] args) {
		HouseBuilder iglooBuilder = new IglooHouseBuilder();
		CivilEngineerBuilder engineer = new CivilEngineerBuilder(iglooBuilder);
		engineer.constructHouse();
		House house = engineer.getHouse();
		System.out.println("Case 1: Builder constructed: " + house);
		HouseBuilder tipiHouseBuilder = new TipiHouseBuilder();
		engineer = new CivilEngineerBuilder(tipiHouseBuilder);
		engineer.constructHouse();
		house = engineer.getHouse();
		System.out.println("Case 2: Builder constructed: " + house);

	}
}

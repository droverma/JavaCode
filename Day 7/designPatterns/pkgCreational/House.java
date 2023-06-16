package pkgDay6.designPatterns.pkgCreational;

public class House  implements HousePlan {
	private String basement;
	private String structure;
	private String roof;
	private String interior;

	public void setBasement(String basement) {
		this.basement = basement;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	public String toString() {
		return "\nHouse [basement=" + basement + ", structure=" + structure + ", roof=" + roof + ", interior="
				+ interior + "]\n";
	}
}



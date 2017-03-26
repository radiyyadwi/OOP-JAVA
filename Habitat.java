public class Habitat extends Cell {
	protected final String habitat_type;

	public Habitat(String s) {
		super("Habitat");		
		habitat_type=s;
	}
	public String GetFacHabType() {
		return habitat_type;
	}
	public void Render() {
		if(habitat_type == "Water") {
			System.out.print ("w");
		} else
		if(habitat_type == "Land") {
			System.out.print ("l");
		} else
		if(habitat_type == "Air") {
			System.out.print ("a");
		}
	}
	public void Render(boolean oncage) {
		if(oncage) {
			if(habitat_type == "Water") {
				System.out.print ("W");
			} else
			if(habitat_type == "Land") {
				System.out.print ("L");
			} else
			if(habitat_type == "Air") {
				System.out.print ("A");
		} else {
			Render();
		}
		}
	}
	public void Enter() {
	}
}
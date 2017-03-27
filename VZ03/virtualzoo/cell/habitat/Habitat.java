//Nama : Radiyya Dwisaputra
//NIM : 13515023
package virtualzoo.cell.habitat;
import virtualzoo.cell.Cell;
/**
* Class yang menunjukkan habitat
* @author Radiyya Dwisaputra/13515023
* @version 1.0, March 2017
*/
public class Habitat extends Cell {
	protected final String habitat_type;
	/** Constructor
   *  @see java.lang.reflect.Constructor
   */
	public Habitat(String s) {
		super("Habitat");		
		habitat_type=s;
	}
	/**
	 * Menghasilkan type habitat
	 * @return type dari habitat
	 * @see Cell#GetFacHabType()
	 */
	public String GetFacHabType() {
		return habitat_type;
	}
	/**
	 * Mencetak symbol di map
	 * @see Cell#Render()
	 */
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
	/**
	 * Mencetak habitat pada Cage
	 * @param oncage ialah habitat terletak dalam Cage atau tidak
	 * @see Cell#Render(boolean)
	 */
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
	/**
   * Meletakkan pintu masuk di map
	 * @see Cell#Enter()
	 */
	public void Enter() {
	}
}
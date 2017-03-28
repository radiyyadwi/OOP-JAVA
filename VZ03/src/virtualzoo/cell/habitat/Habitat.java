//Nama : Radiyya Dwisaputra
//NIM : 13515023

package virtualzoo.cell.habitat;

import virtualzoo.cell.Cell;
/** Class yang menunjukkan habitat.
* @author Radiyya Dwisaputra/13515023
* @version 1.0, March 2017
*/

public class Habitat extends Cell {
  protected final String habitatType;
  /** Constructor.
   *  @see java.lang.reflect.Constructor
   */
  
  public Habitat(String namaHabitat) {
    super("Habitat");
    habitatType = namaHabitat;
  }
  /** Menghasilkan type habitat.
   * @return type dari habitat
   * @see Cell#getFacHabType()
   */

  public String getFacHabType() {
    return habitatType;
  }
  /** Mencetak symbol di map.
   * @see Cell#render()
   */
  
  public void render() {
    if (habitatType == "Water") {
      System.out.print("w");
    } else
      if (habitatType == "Land") {
        System.out.print("l");
      } else
        if (habitatType == "Air") {
          System.out.print("a");
        }
  }
  /** Mencetak habitat pada Cage.
   * @param oncage ialah habitat terletak dalam Cage atau tidak
   * @see Cell#render(boolean)
   */

  public void render(boolean oncage) {
    if (oncage) {
      if (habitatType == "Water") {
        System.out.print("W");
      } else
        if (habitatType == "Land") {
          System.out.print("L");
        } else
          if (habitatType == "Air") {
            System.out.print("A");
          } else {
            render();
          }
    }
  }
  /** Meletakkan pintu masuk di map.
   * @see Cell#enter()
   */

  public void enter() {}
}
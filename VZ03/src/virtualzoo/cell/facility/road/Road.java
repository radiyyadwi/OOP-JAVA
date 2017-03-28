// Nama File : Road.java
// N0 : Prama Halqavi (13515132)

package virtualzoo.cell.facility.road;

import virtualzoo.cell.facility.Facility;
/** Class yang menunjukkan road.
 * @author Prama Legawa Halqavi/13515132
 * @version 1.0, March 2017
 */

public class Road extends Facility {
  /** ctor Road.
    */
  public Road() {
    super("", "Road");
  }
  /** ctor dengan parameter nama restoran.
   * @param st ialah nama jalan
   */ 

  public Road(String st) {
    super("", st);
  }
  /**memasuki jalan.
   */
  
  public final void enter() {}
}
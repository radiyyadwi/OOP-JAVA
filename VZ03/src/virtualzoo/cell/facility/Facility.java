// Nama File : Road.java
// N0 : Prama Halqavi (13515132)

package virtualzoo.cell.facility;

import virtualzoo.cell.Cell;
/** Class yang menunjukkan fasilitas.
 * @author Prama Legawa Halqavi/13515132
 * @version 1.0, March 2017
 */

public abstract class Facility extends Cell {
  protected final String facilityName; //  nama fasilitas
  protected final String facilityType; //  nama fasilitas
  protected final int defSize = 10;
  protected static final String defName = "The Facility";
  protected final int defaultMaxPengunjung = 10;
  protected final String nilString = "Nil";
  /** ctor tanpa parameter.
   * nama dan tipe fasilitas diinisialisasi dengan defName
   */
  
  public Facility() {
    super("Facility");
    this.facilityName = defName;
    this.facilityType = defName;
  }
  /** ctor dengan parameter.
   * @param name nama fasilitas 
   * @param type tipe fasilitas 
   */

  public Facility(String name, String type) {
    super("Facility");
    this.facilityName = name;
    this.facilityType = type;
    cellType = "Facility";
  }
  /**mengakses type fasilitas.
   */

  public final String getFacHabType() {
    return facilityType;
  }
  /**mengakses nama fasilitas.
   */

  public final String getFacilityName() {
    return facilityName;
  }
  /**menggambarkan objek ke layar.
   */

  public void render(boolean oncage) {
    render();
  }
  /**menggambarkan objek ke layar.
   */

  public void render() {
    if (facilityType.equals("Park")) {
      System.out.print("P");
    } else 
      if (facilityType.equals("Restaurant")) {
        System.out.print("R");
      } else 
        if (facilityType.equals("Road")) {
          System.out.print(" ");
        } else 
          if (facilityType.equals("Entrance")) {
            System.out.print("E");
          } else 
            if (facilityType.equals("Exit")) {
              System.out.print("X");
            }
  }
}
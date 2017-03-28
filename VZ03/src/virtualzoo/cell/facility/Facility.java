package virtualzoo.cell.facility;

import virtualzoo.cell.Cell;
/**
 * Class yang menunjukkan fasilitas
 * @author Prama Legawa Halqavi/13515132
 * @version 1.0, March 2017
 */
public abstract class Facility extends Cell {
  protected final String facility_name; //  nama fasilitas
  protected final String facility_type; //  nama fasilitas
  protected static int DEFSIZE = 10;
  protected static String defname = "The Facility";
  protected static int default_max_pengunjung = 10;
  protected static String nil_string = "Nil";
  /**ctor tanpa parameter, 
   *nama dan tipe fasilitas diinisialisasi dengan defname
   */
  public Facility() {
    super("Facility");
    this.facility_name = defname;
    this.facility_type = defname;
  }
  /** ctor dengan parameter 
   * @param name nama fasilitas 
   * @param type tipe fasilitas 
   */
  public Facility(String name, String type) {
    super("Facility");
    this.facility_name = name;
    this.facility_type = type;
    cell_type = "Facility";
  }
  /**mengakses type fasilitas 
   */
  public final String GetFacHabType() {
    return facility_type;
  }
  /**mengakses nama fasilitas 
   */
  public final String GetFacilityName() {
    return facility_name;
  }
  /**menggambarkan objek ke layar 
   */
  public void Render(boolean oncage) {
    Render();
  }
  /**menggambarkan objek ke layar 
   */
  public void Render() {
    if (facility_type.equals("Park")) {
      System.out.print("P");
    }
    else if (facility_type.equals("Restaurant")) {
      System.out.print("R");
    }
    else if (facility_type.equals("Road")) {
      System.out.print(" ");
    }
    else if (facility_type.equals("Entrance")) {
      System.out.print("E");
    }
    else if (facility_type.equals("Exit")) {
      System.out.print("X");
    }
  }
}
// File : Facility.java
// Author : Prama Legawa Halqavi (13515132)

public abstract class Facility extends Cell {
  protected final String facility_name; //  nama fasilitas
  protected final String facility_type; //  nama fasilitas
  protected static int DEFSIZE = 10;
  protected static String defname = "The Facility";
  protected static int default_max_pengunjung = 10;
  protected static String nil_string = "Nil";
  /* * @brief ctor tanpa parameter. 
       * nama dan tipe fasilitas diinisialisasi dengan defname */
  public Facility() {
    super("Facility");
    this.facility_name = defname;
    this.facility_type = defname;
  }
  /* * @brief ctor dengan parameter 
     * @param name nama fasilitas 
     * @param type tipe fasilitas */
  public Facility(String name, String type) {
    super("Facility");
    this.facility_name = name;
    this.facility_type = type;
    cell_type = "Facility";
  }
  /* * @brief mengakses type fasilitas 
     */
  public String GetFacHabType() {
    return facility_type;
  }
 /* * @brief mengakses nama fasilitas */
  public String GetFacilityName() {
    return facility_name;
  }
 /* * @brief menggambarkan objek ke layar */
  public void Render(boolean oncage) {
    Render();
  }
  /* * @brief menggambarkan objek ke layar */
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
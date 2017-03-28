package virtualzoo.cell.facility.restaurant;
import java.util.Scanner;
import virtualzoo.cell.facility.Facility;
/**
 * Class yang menunjukkan restaurant
 * @author Prama Legawa Halqavi/13515132
 * @version 1.0, March 2017
 */
public class Restaurant extends Facility {
  private String[] menu; // * @brief array of menu
  private final int max_pengunjung; // * @brief nama restoran
  private int jumlah_pengunjung; // * @brief jumlah pengunjung
  private int n_menu;
  /**ctor tanpa parameter. 
   * nama fasilitas diinisialisasi dengan defname 
   */
  public Restaurant() {
    super(defname, "Restaurant");
    this.max_pengunjung = default_max_pengunjung;
    jumlah_pengunjung = 0;
    menu = new String [DEFSIZE];
    for (int i = 0; i < DEFSIZE; i++) {
      menu[i] = nil_string;
    }
    n_menu = 0;
  }
  /** ctor dengan parameter nama restoran 
    * @param nama restoran
    * @param maxpeng maximal jumlah pengunjung  
    */
  public Restaurant(String nama, int maxpeng)
  {
    super(nama, "Restaurant");
    this.max_pengunjung = maxpeng;
    jumlah_pengunjung = 0;
    menu = new String [DEFSIZE];
    for (int i = 0; i < DEFSIZE; i++) {
      menu[i] = nil_string;
    }
    n_menu = 0;
  }
  /** menambahkan jumlah pengunjung yang ada di restoran
     * @param x menambahkan pengunjung sejumlah x 
     */
  public void IncreaseJumlahPengunjung(int x) {
    jumlah_pengunjung += x;
  }
  /**mengurangi jumlah pengunjung yang ada di restoran
    * @param x mengurangi pengunjung sejumlah x 
    */
  public void DecreaseJumlahPengunjung(int x) {
    jumlah_pengunjung -= x;
  }
  /**menambahkan menu 
    * @param menu nama menu 
    */
  public void AddMenu(String _menu) {
    menu[n_menu] = _menu;
    n_menu++;
  }
  /**menghapus menu
    * @param menu nama menu 
    */
  public void DelMenu(String _menu) {
    int i = 0;
    boolean found = false;
    while (i < DEFSIZE && !found) {
      if (menu[i] == _menu) {
        found = true;
      }
      else {
        i++;
      }
    }
    if (found) {
      for (i = 0; i < DEFSIZE-1; i++) {
        menu[i] = menu[i + 1];
      }
      n_menu--;
    }
  }
  /**mengakses jumlah pengunjung 
    */
  public int GetJumlahPengunjung() {
    return jumlah_pengunjung;
  }
  /**memasuki taman 
    */
  public void Enter() {
    System.out.print("\n");
    System.out.print("Pilihan Menu: ");
    System.out.print("\n");
    for (int i = 0; i < n_menu; i++) {
      System.out.print(i + 1);
      System.out.print(".  ");
      System.out.print(menu[i]);
      System.out.print("\n");
    }
    int x;
    System.out.print("Masukkan pilihan anda: ");
    Scanner s = new Scanner(System.in);
    x = s.nextInt();
    while (x < 1 || x > n_menu) {
      System.out.print("Inputan salah, ulangi: ");
      x = s.nextInt();
    }
    System.out.print("Anda memesan ");
    System.out.print(menu[x - 1]);
    System.out.print(", rasanya lezat");
    System.out.print("\n");
    s.close();
  }
}



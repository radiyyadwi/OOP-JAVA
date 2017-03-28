// Nama File : Road.java
// N0 : Prama Halqavi (13515132)

package virtualzoo.cell.facility.restaurant;

import java.util.Scanner;
import virtualzoo.cell.facility.Facility;
/** Class yang menunjukkan restaurant.
 * @author Prama Legawa Halqavi/13515132
 * @version 1.0, March 2017
 */

public class Restaurant extends Facility {
  private String[] menu; // * @brief array of menu
  private final int maxPengunjung; // * @brief nama restoran
  private int jumlahPengunjung; // * @brief jumlah pengunjung
  private int jumlahMenu;
  /**ctor tanpa parameter. 
   * nama fasilitas diinisialisasi dengan defName 
   */
  
  public Restaurant() {
    super(defName, "Restaurant");
    this.maxPengunjung = defaultMaxPengunjung;
    jumlahPengunjung = 0;
    menu = new String [defSize];
    for (int i = 0; i < defSize; i++) {
      menu[i] = nilString;
    }
    jumlahMenu = 0;
  }
  /** ctor dengan parameter nama restoran.
    * @param nama restoran
    * @param maxpeng maximal jumlah pengunjung  
    */
  
  public Restaurant(String nama, int maxpeng) {
    super(nama, "Restaurant");
    this.maxPengunjung = maxpeng;
    jumlahPengunjung = 0;
    menu = new String [defSize];
    for (int i = 0; i < defSize; i++) {
      menu[i] = nilString;
    }
    jumlahMenu = 0;
  }
  /** menambahkan jumlah pengunjung yang ada di restoran.
    * @param x menambahkan pengunjung sejumlah x 
    */
  
  public void increaseJumlahPengunjung(int x) {
    jumlahPengunjung += x;
  }
  /**mengurangi jumlah pengunjung yang ada di restoran.
    * @param x mengurangi pengunjung sejumlah x 
    */
  
  public void decreaseJumlahPengunjung(int x) {
    jumlahPengunjung -= x;
  }
  /**menambahkan men.
    * @param pilihanMenu nama menu 
    */
  
  public void addMenu(String pilihanMenu) {
    menu[jumlahMenu] = pilihanMenu;
    jumlahMenu++;
  }
  /**menghapus menu.
    * @param pilihanMenu nama menu 
    */
  
  public void delMenu(String pilihanMenu) {
    int i = 0;
    boolean found = false;
    while (i < defSize && !found) {
      if (menu[i] == pilihanMenu) {
        found = true;
      } else {
        i++;
      }
    }
    if (found) {
      for (i = 0; i < defSize - 1; i++) {
        menu[i] = menu[i + 1];
      }
      jumlahMenu--;
    }
  }
  /**mengakses jumlah pengunjung. 
    */
  
  public int getJumlahPengunjung() {
    return jumlahPengunjung;
  }
  /**memasuki taman.
    */
  
  public void enter() {
    System.out.print("\n");
    System.out.print("Pilihan Menu: ");
    System.out.print("\n");
    for (int i = 0; i < jumlahMenu; i++) {
      System.out.print(i + 1);
      System.out.print(".  ");
      System.out.print(menu[i]);
      System.out.print("\n");
    }
    int x;
    System.out.print("Masukkan pilihan anda: ");
    Scanner s = new Scanner(System.in);
    x = s.nextInt();
    while (x < 1 || x > jumlahMenu) {
      System.out.print("Inputan salah, ulangi: ");
      x = s.nextInt();
    }
    System.out.print("Anda memesan ");
    System.out.print(menu[x - 1]);
    System.out.print(", rasanya lezat");
    System.out.print("\n");
  }
}
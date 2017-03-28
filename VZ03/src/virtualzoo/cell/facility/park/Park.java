// Nama File : Road.java
// N0 : Prama Halqavi (13515132)

package virtualzoo.cell.facility.park;

import java.util.Scanner;
import virtualzoo.cell.facility.Facility;
/**Class yang menunjukkan park.
 * @author Prama Legawa Halqavi/13515132
 * @version 1.0, March 2017
 */

public class Park extends Facility {
  private final int maxPengunjung; // * @brief jumlah maksimal pengunjung
  private String[] wahana; /* * @brief wahana yang ada di park, berupa array of std::string */
  private int jumlahPengunjung; // * @brief jumlah pengunjung
  private int jumlahWahana;
  /**ctor tanpa parameter. 
    * nama fasilitas diinisialisasi dengan defName 
    */

  public Park() {
    super(defName, "Park");
    this.maxPengunjung = defaultMaxPengunjung;
    jumlahPengunjung = 0;
    wahana = new String [defSize];
    for (int i = 0; i < defSize; i++) {
      wahana[i] = nilString;
    }
    jumlahWahana = 0;
  }
  /**ctor dengan parameter.
   * @param nama taman
   * @param maxpeng maximal jumlah pengunjung  
   */
  
  public Park(String nama, int maxpeng) {
    super(nama, "Park");
    this.maxPengunjung = maxpeng;
    jumlahPengunjung = 0;
    wahana = new String [defSize];
    for (int i = 0; i < defSize; i++) {
      wahana[i] = nilString;
    }
    jumlahWahana = 0;
  }
  /**mengakses jumlah pengunjung.
   */
  
  public int getJumlahPengunjung() {
    return jumlahPengunjung;
  }
  /** menambahkan jumlah pengunjung yang ada di taman.
    * @param x menambahkan pengunjung sejumlah x 
    */
  
  public void increaseJumlahPengunjung(int x) {
    jumlahPengunjung += x;
  }
  /**mengurangi jumlah pengunjung yang ada di taman.
   * @param x mengurangi pengunjung sejumlah x 
   */

  public void decreaseJumlahPengunjung(int x) {
    jumlahPengunjung -= x;
  }
  /** menambahkan nama wahana ke array wahana.
    * @param whn wahana yang ditambah
    */

  public void addWahana(String whn) {
    wahana[jumlahWahana] = whn;
    jumlahWahana++;
  }
  /** menghapus wahana yang ada dalam array wahana.
    * @param whn wahana yang di tambah
    */

  public void delWahana(String whn) {
    int i = 0;
    boolean found = false;
    while (i < defSize && !found) {
      if (wahana[i] == whn) {
        found = true;
      } else {
        i++;
      }
    }
    if (found) {
      for (i = 0; i < defSize - 1; i++) {
        wahana[i] = wahana[i + 1];
      } 
      jumlahWahana--;
    }
  }
  /**memasuki taman.
    */

  public void enter() {
    System.out.print("\n");
    System.out.print("Di Park ini terdapat wahana: ");
    System.out.print("\n");
    for (int i = 0; i < jumlahWahana; i++) {
      System.out.print(i + 1);
      System.out.print(".  ");
      System.out.print(wahana[i]);
      System.out.print("\n");
    }
    int x;
    System.out.print("Masukkan pilihan anda: ");
    Scanner s = new Scanner(System.in);
    x = s.nextInt();
    while (x < 1 || x > jumlahWahana) {
      System.out.print("Inputan salah, ulangi: ");
      x = s.nextInt();
    }
    System.out.print("Anda naik ");
    System.out.print(wahana[x - 1]);
    System.out.print(", sangat seru hingga anda ingin naik lagi!");
    System.out.print("\n");
  }
}
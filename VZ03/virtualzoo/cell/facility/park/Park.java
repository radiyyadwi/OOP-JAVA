package virtualzoo.cell.facility.park;
import java.util.Scanner;
import virtualzoo.cell.facility.Facility;

public class Park extends Facility {
  private final int max_pengunjung; // * @brief jumlah maksimal pengunjung
  private String[] wahana; /* * @brief wahana yang ada di park, 
	                           berupa array of std::string */
  private int jumlah_pengunjung; // * @brief jumlah pengunjung
  private int n_wahana;
   /* * @brief ctor tanpa parameter. 
       * nama fasilitas diinisialisasi dengan defname 
    */
  public Park() {
    super(defname, "Park");
    this.max_pengunjung = default_max_pengunjung;
    jumlah_pengunjung = 0;
    wahana = new String [DEFSIZE];
    for (int i = 0; i < DEFSIZE; i++) {
      wahana[i] = nil_string;
    }
    n_wahana = 0;
  }
     /* * @brief ctor dengan parameter
      * @param nama taman
      * @param maxpeng maximal jumlah pengunjung  */
  public Park(String nama, int maxpeng) {
    super(nama, "Park");
    this.max_pengunjung = maxpeng;
    jumlah_pengunjung = 0;
    wahana = new String [DEFSIZE];
    for (int i = 0; i < DEFSIZE; i++) {
      wahana[i] = nil_string;
    }
    n_wahana = 0;
  }
    /* * @brief mengakses jumlah pengunjung */
  public int GetJumlahPengunjung() {
    return jumlah_pengunjung;
  }
    /* * @brief menambahkan jumlah pengunjung yang ada di taman 
     * @param x menambahkan pengunjung sejumlah x */
  public void IncreaseJumlahPengunjung(int x) {
    jumlah_pengunjung += x;
  }
    /* * @brief mengurangi jumlah pengunjung yang ada di taman 
     * @param x mengurangi pengunjung sejumlah x */
  public void DecreaseJumlahPengunjung(int x) {
    jumlah_pengunjung -= x;
  }
  /* * @brief menambahkan nama wahana ke array wahana 
     * @param nama wahana */
  public void AddWahana(String whn) {
    wahana[n_wahana] = whn;
    n_wahana++;
  }
  /* * @brief menghapus wahana yang ada dalam array wahana
     * @param nama wahana */
  public void DelWahana(String whn) {
    int i = 0;
    boolean found = false;
    while (i < DEFSIZE && !found) {
      if (wahana[i] == whn) {
        found = true;
      }
      else {
        i++;
      }
    }
    if (found) {
      for (i = 0; i < DEFSIZE -1; i++) {
        wahana[i] = wahana[i + 1];
      } 
      n_wahana--;
    }
  }
  /* * @brief memasuki taman */
  public void Enter() {
    System.out.print("\n");
    System.out.print("Di Park ini terdapat wahana: ");
    System.out.print("\n");
    for (int i = 0; i < n_wahana; i++) {
      System.out.print(i + 1);
      System.out.print(".  ");
      System.out.print(wahana[i]);
      System.out.print("\n");
    }
    int x;
    System.out.print("Masukkan pilihan anda: ");
    Scanner s = new Scanner(System.in);
    x = s.nextInt();
    while (x < 1 || x > n_wahana) {
      System.out.print("Inputan salah, ulangi: ");
      x = s.nextInt();
    }
    System.out.print("Anda naik ");
    System.out.print(wahana[x - 1]);
    System.out.print(", sangat seru hingga anda ingin naik lagi!");
    System.out.print("\n");
  }
}
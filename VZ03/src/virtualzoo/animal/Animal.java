// Nama :  M. Ferdi Ghozali
// NIM : 13515014

package virtualzoo.animal;

import  virtualzoo.renderable.Renderable;
import virtualzoo.util.point.Point;
/** Class yang menjadi base class dari kelas turunan real animal.
 * @author FerdiGhozali/13515014
 * @version 1.0, March 2017
 */

public abstract class Animal implements Renderable {
  protected String[] enemyList;
  protected int jumlahEnemy = 0;
  protected final char symbolOnMap;
  protected Point position = new Point();
  protected double weight;
  protected double foodPerDay;
  protected final boolean tamed;
  protected String[] animalType = new String[3];
  protected String speciesName;
  /**Constructor object Animal.
   * @see java.lang.reflect.Constructor
   */

  public Animal() {
    for (int i = 0;i < 3;i++) {
      animalType[i] = new String();
    }
    symbolOnMap = '.';
    tamed = true;
    enemyList = new String [20];
    for (int i = 0; i < 20; i++) {
      enemyList[i] = " ";
    }
  }
  /**Constructor.
    * Mengisi atribut Animal sesuai parameter  
    * @param symbol simbol animal pada zoo
    * @param isTamed kondisi apakah animal liar atau jinak
    */

  public Animal(char symbol, boolean isTamed) {
    for (int i = 0;i < 3;i++) {
      animalType[i] = new String();
    }
    symbolOnMap = symbol;
    tamed = isTamed;
    enemyList = new String [20];
    for (int i = 0; i < 20; i++) {
      enemyList[i] = " ";
    }
  }

  /**Menghasilkan posisi animal.
   * @return Point posisi animal berada
   */
  public final Point getPosition() {
    return (position);
  }

  /**Memperoleh nama spesies dari animal.
   * @return String nama species dari hewan 
   */
  public final String getSpeciesName() {
    return speciesName;
  }
  /**Memperoleh jumlah makanan dari animal.
   * @return jumlah makanan dalam double
   */

  public final double getFoodNum() {
    return foodPerDay;
  }
  /**Mengubah posisi animal.
   * @param p posisi yang diinginkan
   */

  public final void setPosition(Point p) {
    position.setX(p.getX());
    position.setY(p.getY());
  }
  /**Interaksi animal kepada pengunjung.
   */

  public abstract void interact();
  
  public abstract void deskripsi();
  /** Mengembalikan apakah hewan jinak.
   * @return boolean true bila hewan jinak
   */

  public final boolean isTamed() {
    return tamed;
  }
  /**
   * Mengecek apakah animalname musuh dari animal.
   * @param animal nama animal yang akan di cek
   * @return boolean true bila musuh false bila tidak
  */

  public boolean isEnemy(String animal) {
    if (!tamed) {
      int i = 0;
      boolean found = false;
      while (i < jumlahEnemy && !found) {
        if (animal.equals(enemyList[i])) {
          found = true;
        }
        i++;
      }
      return found;
    } else {
      return false;
    }
  }
  /** Menambahkan animal enemy ke dalam enemy list.
   * @param animalName nama hewan yang akan ditambahkan sebagai enemy
   */

  public void addEnemy(String animalName) {
    if (jumlahEnemy < 19) {
      enemyList[jumlahEnemy] = animalName;
      jumlahEnemy++;
    }
  }
  /** Menambahkan tipe hewan.
   * @param  type tipe hewan antara "Land", "Water" atau "Flying"
  */

  public final void addAnimalType(String type) {
    if (!animalType[0].equals("Flying") && !animalType[0].equals("Land") 
          && !animalType[0].equals("Water")) {
      animalType[0] = type;
    } else {
      if (!animalType[1].equals("Flying") && !animalType[1].equals("Land") 
            && !animalType[1].equals("Water")) {
        animalType[1] = type;
      } else {
        if (!animalType[2].equals("Flying") && !animalType[2].equals("Land") 
              && !animalType[2].equals("Water")) {
          animalType[2] = type;
        }
      }
    }
  }

  /** Mengecek type yang dimiliki hewan. 
   * @param type type yang akan dicek
   * @return boolean yes bila type itu ada 
   */
  public final boolean isTypeThere(String type) {
    boolean found = false;
    boolean ubah = false;
    if (type.equals("Air")) {
      type = "Flying";
      ubah = true;
    }
    for (int i = 0;i < 3;i++) {
      if (animalType[i].equals(type)) {
        found = true;
      }
    }
    if (ubah) {
      type = "Air";
    }
    return found;
  }

  /** Mendapatkan type makanan hewan.
   * @return type makanan dari hewan
   */
  public abstract String getFoodType();
  /** Menuliskan symbol yang mewakili hewan.
   * @see Renderable#render()
   */

  @Override
  public final void render() {
    System.out.print(symbolOnMap);
  }
}
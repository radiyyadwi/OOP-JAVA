// Nama :  M. Ferdi Ghozali
// NIM : 13515014
package virtualzoo.animal;
import  virtualzoo.renderable.Renderable;
import virtualzoo.util.point.Point;
/** Class yang menjadi base class dari kelas turunan real animal
 * @author FerdiGhozali/13515014
 * @version 1.0, March 2017
 */
public abstract class Animal implements Renderable {
  protected String[] enemy_list;
  protected int n_enemy = 0;
  protected final char symbol_on_map;
  protected Point position = new Point();
  protected double weight;
  protected double food_per_day;
  protected final boolean tamed;
  protected String[] animal_type = new String[3];
  protected String species_name;
  /**
   * Constructor object Animal
   * @see java.lang.reflect.Constructor
   */
  public Animal() {
    for (int i = 0;i < 3;i++) {
      animal_type[i] = new String();
    }
	  symbol_on_map = '.';
	  tamed = true;
    enemy_list = new String [20];
    for (int i = 0; i < 20; i++) {
      enemy_list[i] = " ";
    }
  }
  /**Constructor
	  * Mengisi atribut Animal sesuai parameter  
	  * @param symbol_on_map simbol animal pada zoo
	  * @param is_tamed kondisi apakah animal liar atau jinak
	  */
  public Animal(char sym_on_map, boolean is_tamed) {
    for (int i = 0;i < 3;i++) {
      animal_type[i] = new String();
    }
	  symbol_on_map = sym_on_map;
	  tamed = is_tamed;
    enemy_list = new String [20];
    for (int i = 0; i < 20; i++) {
      enemy_list[i] = " ";
    }
  }
  /**
   * Menghasilkan posisi animal
   * @return Point posisi animal berada
   */
  public final Point GetPosition() {
    return (position);
  }
  /**
   * Memperoleh nama spesies dari animal
   * @return String nama species dari hewan 
   */
  public final String GetSpeciesName() {
    return species_name;
  }
  /**
   * Memperoleh jumlah makanan dari animal
   * @return jumlah makanan dalam double
   */
  public final double GetFoodNum() {
    return food_per_day;
  }
  /**
   * Mengubah posisi animal  
   * @param Point p posisi yang diinginkan
   */
  public final void SetPosition(Point p) {
    position.SetX(p.GetX());
    position.SetY(p.GetY());
  }
  /**
   * Interaksi animal kepada pengunjung
   */
	public abstract void Interact();
	
  public abstract void Deskripsi();
  /** Mengembalikan apakah hewan jinak
   * @return boolean true bila hewan jinak
   */
  public final boolean IsTamed() {
    return tamed;
  }
  /**
   * Mengecek apakah animalname musuh dari animal
   * @param animal nama animal yang akan di cek
   * @return boolean true bila musuh false bila tidak
  */
  public boolean IsEnemy(String animal) {
    if(!tamed)
    {
      int i = 0;
      boolean found = false;
      while (i < n_enemy && !found) {
        if (animal == enemy_list[i]) {
          found = true;
        }
      i++;
      }
      return found;
    }
    else return false;
  }
  /** Menambahkan animal enemy ke dalam enemy list 
   * @param animal_name nama hewan yang 
   * akan ditambahkan sebagai enemy
   */
  public void AddEnemy(String animal_name) {
    if (n_enemy < 19) {
      enemy_list[n_enemy] = animal_name;
      n_enemy++;
    }
  }
  /** Menambahkan tipe hewan 
   * @param  type tipe hewan antara "Land", "Water" atau "Flying"
  */
  public final void AddAnimalType(String type) {
	 if (!animal_type[0].equals("Flying") && !animal_type[0].equals("Land") && !animal_type[0].equals("Water")) {
	    animal_type[0] = type;
	 } else {
	   if (!animal_type[1].equals("Flying") && !animal_type[1].equals("Land") && !animal_type[1].equals("Water")) {
	 	  animal_type[1] = type;
	   } else {
      if (!animal_type[2].equals("Flying") && !animal_type[2].equals("Land") && !animal_type[2].equals("Water")) {
	 	  animal_type[2] = type;
      }
	   }
	 }
  }
  /** Mengecek type yang dimiliki hewan 
   * @param type type yang akan dicek
   * @return boolean yes bila type itu ada 
   */
  public final boolean IsTypeThere(String type) {
	  boolean found = false;
	  boolean ubah = false;
	  if (type.equals("Air")) {
      type = "Flying";
	    ubah = true;
	  }
	  for (int i = 0;i < 3;i++) {
	    if (animal_type[i].equals(type)) {
	  	  found = true;
	    }
	  }
	  if (ubah) {
	    type = "Air";
	  }
	  return found;
  }
  /** Mendapatkan type makanan hewan
   * @return type makanan dari hewan
   */
  public abstract String GetFoodType();
  /** Menuliskan symbol yang mewakili hewan
   * @see Renderable#Render()
   */
  public final void Render() {
	  System.out.print(symbol_on_map);
  }
}
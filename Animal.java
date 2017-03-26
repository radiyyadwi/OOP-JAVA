// Nama :  M. Ferdi Ghozali
// NIM : 13515014
import java.util.*;
/** @class Animal
  * Class Animal adalah abstract class yang menjadi base class dari kelas 
  * turunan LandAnimal. WaterAnimal, dan Flying Animal
  */

public abstract class Animal implements Renderable {
  /** @brief Constructor.
    */
  protected final char symbol_on_map;
  protected Point position = new Point();
  protected double weight;
  protected double food_per_day;
  protected final boolean tamed;
  protected String[] animal_type = new String[3];
  protected String species_name;
  //ctor
  public Animal() {
	  symbol_on_map = '.';
	  tamed = true;
  }
	/** @brief Constructor.
	* Mengisi atribut Animal sesuai parameter  
	* @param symbol_on_map simbol animal pada zoo
	* @param pos posisi animal
	* @param weight berat animal
	* @param food makanan yang dibutuhkan animal
	*/
  // ctor berparameter
  public Animal(char sym_on_map, boolean is_tamed) {
	  symbol_on_map = sym_on_map;
	  tamed = is_tamed;
  }
  public final Point GetPosition() {
    return (position);
  }
  public final String GetSpeciesName() {
    return species_name;
  }
  public final double GetFoodNum() {
    return food_per_day;
  }
  public final void SetPosition(Point p) {
    position.SetX(p.GetX());
    position.SetY(p.GetY());
  }
	public abstract void Interact();
  public abstract void Deskripsi();
  /** @brief  mengembalikan apakah hewan jinak
  */
  public abstract boolean IsEnemy(String animalname);
  public final boolean IsTamed() {
    return tamed;
  }
  /** @brief  menambahkan type hewan dengan Land, Water atau Flying
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
  /** @brief  
    * @param  
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
  public abstract String GetFoodType();
  public final void Render() {
	  System.out.print(symbol_on_map);
  }
}
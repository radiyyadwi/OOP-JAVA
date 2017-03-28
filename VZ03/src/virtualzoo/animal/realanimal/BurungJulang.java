//Nama : Radiyya Dwisaputra
//NIM : 13515023
package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/**
 * Class yang menunjukkan hewan real BurungJulang
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */
public class BurungJulang extends Animal
implements AnimalClass, AnimalFoodType {
  private final double defaultweight = 10;
  private final String food_type = "Herbivore";
  private final String kelas = "Aves";
  private final String deskripsi = "Aves merupakan kelas kelompok hewan " + 
  "vertebrata yang memiliki bulu dan sayap";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public BurungJulang() {
    super('j',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "BurungJulang";
    animal_type[0] = "Flying";
  }
  /** InteractionBurungJulang kepada pengunjung
   * @see Animal#Interact()
   */
   public void Interact() {
    System.out.println( "Hai, aku burung berukuran besar, "
      + "dan aku memiliki paruh yang besar");
  }
   /** Memperoleh type makanan animal
    * 
    * @see Animal#GetFoodType()
    * @see AnimalFoodType#GetFoodType()
    */
  public String GetFoodType(){
    return food_type;
  }
  /** Memperoleh nama kelas dari animal
   * 
   * @see AnimalClass#GetClassName()
   */
  public String GetClassName(){
    return kelas;
  }
  /** Memperoleh deskripsi animal
   * 
   * @see AnimalClass#GetDeskripsi()
   */
  public String GetDeskripsi(){
    return deskripsi;
  }
  /** Menuliskan deskripsi hewan
   * 
   */
  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
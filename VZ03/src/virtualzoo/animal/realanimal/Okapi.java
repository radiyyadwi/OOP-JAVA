//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek Okapi yang mewakili hewan Okapi. 
  * objek akan di masukkan ke dalam zoo.
  */
package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/** Class yang menunjukkan hewan real Okapi
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */
public class Okapi extends Animal
implements AnimalClass, AnimalFoodType {
  private final double defaultweight = 250;
  private final String food_type = "Herbivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammal merupakan kelas hewan vertebrata " + 
  "yang ciri utama nya memiliki kelenjar susu";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public Okapi() {
    super('o',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "Okapi";
    animal_type[0] = "Land";
  } 
  /** Interaction Okapi kepada pengunjung
   * @see Animal#Interact()
   */
  @Override
   public void Interact() {
    System.out.println("nguuut");
    System.out.println("aku hewan yang unik lhooo, aku memiliki badan perpaduan" +
         "antara jerapah dan zebra");
  }
   /** Memperoleh type makanan animal
    * @see Animal#GetFoodType()
    * @see AnimalFoodType#GetFoodType()
    */
  @Override
  public String GetFoodType(){
    return food_type;
  }
  /** Memperoleh nama kelas dari animal
   * @see AnimalClass#GetClassName()
   */
  @Override
  public String GetClassName(){
    return kelas;
  }
  /** Memperoleh deskripsi animal 
   * @see AnimalClass#GetDeskripsi()
   */
  @Override
  public String GetDeskripsi(){
    return deskripsi;
  }
  /** Menuliskan deskripsi hewan
   */
  @Override
  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
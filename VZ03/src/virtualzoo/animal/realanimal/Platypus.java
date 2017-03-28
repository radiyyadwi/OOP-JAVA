//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek Platypus yang mewakili hewan Platypus. 
  * objek akan di masukkan ke dalam zoo.
  */
package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/** Class yang menunjukkan hewan real Platypus
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */
public class Platypus extends Animal
implements AnimalClass, AnimalFoodType {
  private final double defaultweight = 2;
  private final String food_type = "Carnivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammal merupakan kelas hewan vertebrata " + 
  "yang ciri utama nya memiliki kelenjar susu";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public Platypus() {
    super('p',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name =  "Platypus";
    animal_type[0] = "Land";
    animal_type[1] = "Water";
  } 
  /** Interaction Platypus kepada pengunjung
   * @see Animal#Interact()
   */
   public void Interact() {
    System.out.println("sebenarnya aku adalah perry");
  }
   /** Memperoleh type makanan animal
    * @see Animal#GetFoodType()
    * @see AnimalFoodType#GetFoodType()
    */
  public String GetFoodType(){
    return food_type;
  }
  /** Memperoleh nama kelas dari animal
   * @see AnimalClass#GetClassName()
   */
  public String GetClassName(){
    return kelas;
  }
  /** Memperoleh deskripsi animal 
   * @see AnimalClass#GetDeskripsi()
   */
  public String GetDeskripsi(){
    return deskripsi;
  }
  /** Menuliskan deskripsi hewan
   */
  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
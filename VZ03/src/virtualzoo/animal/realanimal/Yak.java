//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek Yak yang mewakili hewan Yak. 
  * objek akan di masukkan ke dalam zoo.
  */
package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/** Class yang menunjukkan hewan real Yak
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */
public class Yak extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 500;
  private final String food_type = "Herbivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammal merupakan kelas hewan vertebrata " + 
  "yang ciri utama nya memiliki kelenjar susu";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public Yak() {
    super('y',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name =  "Yak";
    animal_type[0] = "Land";
  } 
  /** Interaction Yak kepada pengunjung
   * @see Animal#Interact()
   */
   public void Interact() {
    System.out.println("Hi I'm Yak!");
    System.out.println("I am usually found in the mountainous regions of " + 
    "central Asia ");
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
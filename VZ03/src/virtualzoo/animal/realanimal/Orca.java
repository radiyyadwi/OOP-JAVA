//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek Orca yang mewakili hewan Orca. 
  * objek akan di masukkan ke dalam zoo.
  */
package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/** Class yang menunjukkan hewan real Orca
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */
public class Orca extends Animal
implements AnimalClass, AnimalFoodType {
  private final double defaultweight = 7700;
  private final String food_type = "Carnivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammal merupakan kelas hewan vertebrata " + 
  "yang ciri utama nya memiliki kelenjar susu";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public Orca() {
    super('r',false);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "Orca";
    animal_type[0] = "Water";
    AddEnemy("IkanCupang");
    AddEnemy("IkanKalajengking");
    AddEnemy("IkanSungutGanda");
  } 
  /** Interaction Orca kepada pengunjung
   * @see Animal#Interact()
   */
   public void Interact() {
    System.out.println("Orca itu lumba lumba lhoo bukan paus~");
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
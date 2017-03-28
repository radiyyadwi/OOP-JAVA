//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek SemutPanda yang mewakili hewan SemutPanda. 
  * objek akan di masukkan ke dalam zoo.
  */
package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/** Class yang menunjukkan hewan real SemutPanda
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */
public class SemutPanda extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 0.1;
  private final String food_type = "Herbivore";
  private final String kelas = "Insect";
  private final String deskripsi = "Insect merupakan hewan avertebrata yang " + 
  "terdiri dari 3 bagian tubuh, dan bernafas dengan trakea";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public SemutPanda() {
    super('s',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name =  "SemutPanda";
    animal_type[0] = "Land";
  } 
  /** Interaction SemutPanda kepada pengunjung
   * @see Animal#Interact()
   */
  @Override
   public void Interact() {
    System.out.println("Aku bukan semut, tetapi lebah!");
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
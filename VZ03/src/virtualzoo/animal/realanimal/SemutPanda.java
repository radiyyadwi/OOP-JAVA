//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek SemutPanda yang mewakili hewan SemutPanda. 
  * objek akan di masukkan ke dalam zoo.
  */

package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/** Class yang menunjukkan hewan real SemutPanda.
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */

public class SemutPanda extends Animal
    implements AnimalClass, AnimalFoodType {
  private final double defaultWeight = 0.1;
  private final String foodType = "Herbivore";
  private final String kelas = "Insect";
  private final String deskripsi = "Insect merupakan hewan avertebrata yang " 
                                    +  "terdiri dari 3 bagian tubuh, dan bernafas dengan trakea";
  /** Constructor.
   *  @see java.lang.reflect.Constructor
   */

  public SemutPanda() {
    super('s',true);
    weight = defaultWeight;
    foodPerDay = weight / 4;
    position.setX(-1);
    position.setY(-1);
    speciesName =  "SemutPanda";
    animalType[0] = "Land";
  } 
  /** Interaction SemutPanda kepada pengunjung.
   * @see Animal#interact()
   */

  @Override
   public void interact() {
    System.out.println("Aku bukan semut, tetapi lebah!");
  }
  /** Memperoleh type makanan animal.
    * @see Animal#getFoodType()
    * @see AnimalFoodType#getFoodType()
    */

  @Override
  public String getFoodType() {
    return foodType;
  }
  /** Memperoleh nama kelas dari animal.
   * @see AnimalClass#getClassName()
   */

  @Override
  public String getClassName() {
    return kelas;
  }
  /** Memperoleh deskripsi animal .
   * @see AnimalClass#getDeskripsi()
   */

  @Override
  public String getDeskripsi() {
    return deskripsi;
  }
  /** Menuliskan deskripsi hewan.
   */

  @Override
  public void deskripsi() {
    System.out.print(super.getSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(getClassName());
    System.out.println(deskripsi);
  }
}
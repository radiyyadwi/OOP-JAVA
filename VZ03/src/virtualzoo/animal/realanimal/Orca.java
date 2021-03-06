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
  private final double defaultWeight = 7700;
  private final String foodType = "Carnivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammal merupakan kelas hewan vertebrata " 
                                    + "yang ciri utama nya memiliki kelenjar susu";
  /** Constructor.
   *  @see java.lang.reflect.Constructor
   */

  public Orca() {
    super('r',false);
    weight = defaultWeight;
    foodPerDay = weight / 4;
    position.setX(-1);
    position.setY(-1);
    speciesName = "Orca";
    animalType[0] = "Water";
    addEnemy("IkanCupang");
    addEnemy("IkanKalajengking");
    addEnemy("IkanSungutGanda");
  } 
  /** Interaction Orca kepada pengunjung.
   * @see Animal#interact()
   */

  @Override
   public void interact() {
    System.out.println("Orca itu lumba lumba lhoo bukan paus~");
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
  /** Memperoleh deskripsi animal.
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
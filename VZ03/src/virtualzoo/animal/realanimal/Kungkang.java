//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek Kungkang yang mewakili hewan Kungkang. 
  * objek akan di masukkan ke dalam zoo.
  */

package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/** Class yang menunjukkan hewan real Kungkang
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */

public class Kungkang extends Animal
    implements AnimalClass, AnimalFoodType {
  private final double defaultWeight = 10;
  private final String foodType = "Omnivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammal merupakan kelas hewan vertebrata " 
                                    + "yang ciri utama nya memiliki kelenjar susu";
  /** Constructor.
   *  @see java.lang.reflect.Constructor
   */
  
  public Kungkang() {
    super('k',true);
    weight = defaultWeight;
    foodPerDay = weight / 4;
    position.setX(-1);
    position.setY(-1);
    speciesName = "Kungkang";
    animalType[0] = "Land";
  } 

  /** Interaction Kungkang kepada pengunjung.
   * @see Animal#interact()
   */
  
  @Override
   public void interact() {
    System.out.println("aku gak gendut, cuman agak bulet dikit");
    System.out.println("Mammal merupakan kelas hewan vertebrata" 
                        + "yang ciri utama nya memiliki kelenjar susu");
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
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
    implements AnimalClass, AnimalFoodType {
  private final double defaultWeight = 500;
  private final String foodType = "Herbivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammal merupakan kelas hewan vertebrata " 
                                  + "yang ciri utama nya memiliki kelenjar susu";
  /** Constructor.
   *  @see java.lang.reflect.Constructor
   */

  public Yak() {
    super('y',true);
    weight = defaultWeight;
    foodPerDay = weight / 4;
    position.setX(-1);
    position.setY(-1);
    speciesName =  "Yak";
    animalType[0] = "Land";
  } 
  /** Interaction Yak kepada pengunjung.
   * @see Animal#interact()
   */

  public void interact() {
    System.out.println("Hi I'm Yak!");
    System.out.println("I am usually found in the mountainous regions of " + "central Asia ");
  }
  /** Memperoleh type makanan animal.
    * @see Animal#getFoodType()
    * @see AnimalFoodType#getFoodType()
    */

  public String getFoodType() {
    return foodType;
  }
  /** Memperoleh nama kelas dari animal.
   * @see AnimalClass#getClassName()
   */

  public String getClassName() {
    return kelas;
  }
  /** Memperoleh deskripsi animal .
   * @see AnimalClass#getDeskripsi()
   */

  public String getDeskripsi() {
    return deskripsi;
  }
  /** Menuliskan deskripsi hewan.
   */

  public void deskripsi() {
    System.out.print(super.getSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(getClassName());
    System.out.println(deskripsi);
  }
}
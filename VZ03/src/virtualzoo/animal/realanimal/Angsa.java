//Nama : Radiyya Dwisaputra
//NIM : 13515023

package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/** Class yang menunjukkan hewan real Angsa.
  * @author Radiyya Dwisaputra/13515023
  * @version 1.0, March 2017
  */

public class Angsa extends Animal
    implements AnimalClass, AnimalFoodType {
  private final double defaultWeight = 5.1;
  private final String foodType = "Omnivore";
  private final String kelas = "Aves";
  private final String deskripsi = "Aves merupakan kelas kelompok hewan " 
                                      + "vertebrata yang memiliki bulu dan sayap";
  /** Constructor Angsa.
    * @see java.lang.reflect.Constructor 
    */

  public Angsa() {
    super('a',true);
    weight = defaultWeight;
    foodPerDay = weight / 4;
    position.setX(-1);
    position.setY(-1);
    speciesName = "Angsa";
    animalType[0] = "Land";
    animalType[1] = "Water";
  }
  /** Interaction Angsa kepada pengunjung.
   * @see Animal#interact()
   */

  @Override
  public void interact() {
    System.out.println("sang angsa penguasa 2 Habitat B) ");
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
   * 
   */

  @Override
  public void deskripsi() {
    System.out.print(super.getSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(getClassName());
    System.out.println(deskripsi);
  }
}
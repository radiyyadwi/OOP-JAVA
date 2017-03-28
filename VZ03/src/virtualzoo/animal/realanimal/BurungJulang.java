//Nama : Radiyya Dwisaputra
//NIM : 13515023

package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/**
 * Class yang menunjukkan hewan real BurungJulang.
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */

public class BurungJulang extends Animal
    implements AnimalClass, AnimalFoodType {
  private final double defaultWeight = 10;
  private final String foodType = "Herbivore";
  private final String kelas = "Aves";
  private final String deskripsi = "Aves merupakan kelas kelompok hewan " 
                                    + "vertebrata yang memiliki bulu dan sayap";
  /** Constructor.
   *  @see java.lang.reflect.Constructor
   */

  public BurungJulang() {
    super('j',true);
    weight = defaultWeight;
    foodPerDay = weight / 4;
    position.setX(-1);
    position.setY(-1);
    speciesName = "BurungJulang";
    animalType[0] = "Flying";
  }
  /** InteractionBurungJulang kepada pengunjung.
   * @see Animal#interact()
   */

  @Override
  public void interact() {
    System.out.println("Hai, aku burung berukuran besar, "
                          + "dan aku memiliki paruh yang besar");
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
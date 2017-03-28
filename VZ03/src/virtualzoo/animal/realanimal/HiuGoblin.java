//Nama : Radiyya Dwisaputra
//NIM : 13515023

package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/**
 * Class yang menunjukkan hewan real HiuGoblin.
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */

public class HiuGoblin extends Animal
    implements AnimalClass, AnimalFoodType {
  private final double defaultWeight = 210;
  private final String foodType = "Carnivore";
  private final String kelas = "Chondrichtyes";
  private final String deskripsi = "Chondrichthyes merupakan ikan dengan tulang rawan";
  /** Constructor.
   *  @see java.lang.reflect.Constructor
   */

  public HiuGoblin() {
    super('h',false);
    weight = defaultWeight;
    foodPerDay = weight / 4;
    position.setX(-1);
    position.setY(-1);
    speciesName = "HiuGoblin";
    animalType[0] = "Water";
    addEnemy("IkanCupang");
    addEnemy("IkanKalajengking");
    addEnemy("IkanSungutGanda");
  }
  /** Interaction HiuGoblin kepada pengunjung.
   * @see Animal#interact()
   */

  @Override
   public void interact() {
    System.out.println("I can extend my jaws!");
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
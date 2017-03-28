//Nama : Radiyya Dwisaputra
//NIM : 13515023

package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/**
 * Class yang menunjukkan hewan real IkanKalajengking.
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */

public class IkanKalajengking extends Animal
    implements AnimalClass, AnimalFoodType {
  private final double defaultWeight = 0.3;
  private final String foodType = "Omnivore";
  private final String kelas = "Actinopterygii";
  private final String deskripsi = "Actinopterygii adalah ikan yang memiliki sirip kipas";
  /** Constructor.
   *  @see java.lang.reflect.Constructor
   */
 
  public IkanKalajengking() {
    super('l',true);
    weight = defaultWeight;
    foodPerDay = weight / 4;
    position.setX(-1);
    position.setY(-1);
    speciesName = "IkanKalajengking";
    animalType[0] = "Water";
  }
  /** Interaction IkanKalajengking kepada pengunjung.
   * @see Animal#interact()
   */

  @Override
   public void interact() {
    System.out.println("Hi I'm Scorpion Fish!");
    System.out.println("I am able to stun my prey with my venom before eating it");
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
//Nama : Radiyya Dwisaputra
//NIM : 13515023

package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/**
 * Class yang menunjukkan hewan real IkanCupang
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */

public class IkanCupang extends Animal
    implements AnimalClass, AnimalFoodType {
  private final double defaultWeight = 0.03;
  private final String foodType = "Carnivore";
  private final String kelas = "Actinopterygii";
  private final String deskripsi = "Actinopterygii adalah ikan yang memiliki sirip kipas";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */

  public IkanCupang() {
    super('i',true);
    weight = defaultWeight;
    foodPerDay = weight / 4;
    position.setX(-1);
    position.setY(-1);
    speciesName = "IkanCupang";
    animalType[0] = "Water";
  }
  /** Interaction IkanCupang kepada pengunjung.
   * @see Animal#interact()
   */

  @Override
  public void interact() {
    System.out.println("Ikan, ikan apa yang paling jelek??");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException error) {
      System.out.print("");
    } 
    System.out.println("I...kan kamu jelek");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException error) {
      System.out.print("");
    } 
    System.out.println("maap..");
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
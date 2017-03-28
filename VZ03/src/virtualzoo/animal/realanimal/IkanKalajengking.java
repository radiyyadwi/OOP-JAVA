//Nama : Radiyya Dwisaputra
//NIM : 13515023
package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/**
 * Class yang menunjukkan hewan real IkanKalajengking
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */
public class IkanKalajengking extends Animal
implements AnimalClass, AnimalFoodType {
  private final double defaultweight = 0.3;
  private final String food_type = "Omnivore";
  private final String kelas = "Actinopterygii";
  private final String deskripsi = "Actinopterygii adalah ikan yang memiliki sirip kipas";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public IkanKalajengking() {
    super('l',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "IkanKalajengking";
    animal_type[0] = "Water";
  }
  /** Interaction IkanKalajengking kepada pengunjung
   * @see Animal#Interact()
   */
   public void Interact() {
    System.out.println("Hi I'm Scorpion Fish!");
    System.out.println("I am able to stun my prey with my venom before eating it");
  }
  /** Memperoleh type makanan animal
   * @see Animal#GetFoodType()
   * @see AnimalFoodType#GetFoodType()
   */
  public String GetFoodType(){
    return food_type;
  }
  /** Memperoleh nama kelas dari animal
   * @see AnimalClass#GetClassName()
   */
  public String GetClassName(){
    return kelas;
  }
  /** Memperoleh deskripsi animal 
   * @see AnimalClass#GetDeskripsi()
   */
  public String GetDeskripsi(){
    return deskripsi;
  }
  /** Menuliskan deskripsi hewan
   */
  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
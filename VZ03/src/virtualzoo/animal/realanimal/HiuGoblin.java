//Nama : Radiyya Dwisaputra
//NIM : 13515023
package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/**
 * Class yang menunjukkan hewan real HiuGoblin
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */
public class HiuGoblin extends Animal
implements AnimalClass, AnimalFoodType {
  private final double defaultweight = 210;
  private final String food_type = "Carnivore";
  private final String kelas = "Chondrichtyes";
  private final String deskripsi = "Chondrichthyes merupakan ikan dengan tulang rawan";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public HiuGoblin() {
    super('h',false);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "HiuGoblin";
    animal_type[0] = "Water";
    AddEnemy("IkanCupang");
    AddEnemy("IkanKalajengking");
    AddEnemy("IkanSungutGanda");
  }
  /** Interaction HiuGoblin kepada pengunjung
   * @see Animal#Interact()
   */
   public void Interact() {
    System.out.println( "I can extend my jaws!");
  }
   /** Memperoleh type makanan animal
    * @see Animal#GetFoodType()
    * @see AnimalFoodType#GetFoodType()
    */
  public String GetFoodType() {
    return food_type;
  }
  /** Memperoleh nama kelas dari animal
   * @see AnimalClass#GetClassName()
   */
  public String GetClassName() {
    return kelas;
  }
  /** Memperoleh deskripsi animal 
   * @see AnimalClass#GetDeskripsi()
   */
  public String GetDeskripsi() {
    return deskripsi;
  }
  /** Menuliskan deskripsi hewan
   */
  public void Deskripsi() {
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
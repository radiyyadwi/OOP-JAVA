//Nama : Radiyya Dwisaputra
//NIM : 13515023
package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/**
 * Class yang menunjukkan hewan real BerangBerang
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */
public class BerangBerang extends Animal
implements AnimalClass, AnimalFoodType {
  private final double defaultweight = 27;
  private final String food_type = "Omnivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammal merupakan kelas hewan vertebrata " +
  "yang ciri utama nya memiliki kelenjar susu";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public BerangBerang() {
    super('b',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "BerangBerang";
    animal_type[0] = "Water";
    animal_type[1] = "Land";
  }
  /** Interaction BerangBerang kepada pengunjung
   * @see Animal#Interact()
   */
   public void Interact() {
    System.out.println( "sungai kotor gini gimana mbikin bendungan nya coba? -_-");
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
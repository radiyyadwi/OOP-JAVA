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
  private final double defaultweight = 0.03;
  private final String food_type = "Carnivore";
  private final String kelas = "Actinopterygii";
  private final String deskripsi = "Actinopterygii adalah ikan yang memiliki sirip kipas";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public IkanCupang() {
    super('i',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "IkanCupang";
    animal_type[0] = "Water";
  }
  /** Interaction IkanCupang kepada pengunjung
   * @see Animal#Interact()
   */
  @Override
  public void Interact() {
    System.out.println("Ikan, ikan apa yang paling jelek??");
    try {
        Thread.sleep(2000);
    } 
    catch(InterruptedException error) {
    } 
    System.out.println("I...kan kamu jelek");
    try {
        Thread.sleep(1000);
    } 
    catch(InterruptedException error) {
    } 
    System.out.println("maap..");
  }
  /** Memperoleh type makanan animal
   * @see Animal#GetFoodType()
   * @see AnimalFoodType#GetFoodType()
   */
  @Override
  public String GetFoodType(){
    return food_type;
  }
  /** Memperoleh nama kelas dari animal
   * @see AnimalClass#GetClassName()
   */
  @Override
  public String GetClassName(){
    return kelas;
  }
  /** Memperoleh deskripsi animal 
   * @see AnimalClass#GetDeskripsi()
   */
  @Override
  public String GetDeskripsi(){
    return deskripsi;
  }
  /** Menuliskan deskripsi hewan
   */
  @Override
  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
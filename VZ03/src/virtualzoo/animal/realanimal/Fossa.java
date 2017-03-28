//Nama : Radiyya Dwisaputra
//NIM : 13515023
package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/**
 * Class yang menunjukkan hewan real Fossa
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */
public class Fossa extends Animal
implements AnimalClass, AnimalFoodType {
  private final double defaultweight = 10;
  private final String food_type = "Carnivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammal merupakan kelas hewan vertebrata " +
  "yang ciri utama nya memiliki kelenjar susu";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public Fossa() {
    super('f',false);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "Fossa";
    animal_type[0] = "Land";
    AddEnemy("Kiwi");
    AddEnemy("Kungkang");
    AddEnemy("Okapi");
    AddEnemy("Yak");
  }
  /** Interaction Fossa kepada pengunjung
   * @see Animal#Interact()
   */
  @Override
   public void Interact() {
    System.out.println("Hi I'm Fossa!");
    System.out.println("I am found nowhere else except on the island of Madagascar");
  }
  /** Memperoleh type makanan animal
   * @see Animal#GetFoodType()
   * @see AnimalFoodType#GetFoodType()
   */
  @Override
  public String GetFoodType() {
    return food_type;
  }
  /** Memperoleh nama kelas dari animal
   * @see AnimalClass#GetClassName()
   */
  @Override
  public String GetClassName() {
    return kelas;
  }
  /** Memperoleh deskripsi animal 
   * @see AnimalClass#GetDeskripsi()
   */
  @Override
  public String GetDeskripsi() {
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
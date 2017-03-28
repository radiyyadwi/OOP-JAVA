//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek SemutPanda yang mewakili hewan SemutPanda. 
  * objek akan di masukkan ke dalam zoo.
  */


/** @brief Kelas objek TikusMondokBerhitungBintang yang mewakili hewan TikusMondokBerhitungBintang. 
  * objek akan di masukkan ke dalam zoo.
  */
package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
/** Class yang menunjukkan hewan real TikusMondokBerhidungBintang
 * @author Radiyya Dwisaputra/13515023
 * @version 1.0, March 2017
 */
public class TikusMondokBerhidungBintang extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 0.1;
  private final String food_type = "Carnivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammal merupakan kelas hewan vertebrata " + 
  "yang ciri utama nya memiliki kelenjar susu";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public TikusMondokBerhidungBintang() {
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name =  "TikusMondokBerhitungBintang";
    animal_type[0] = "Land";
    animal_type[1] = "Water";
  } 
  /** Interaction TikusMondokBerhidungBintang kepada pengunjung
   * @see Animal#Interact()
   */
  @Override
   public void Interact() {
    System.out.println("Hidung bintangku sebenarnya adalah alat sensor yang " +
    "dapat mendeteksi gelombang seismic");
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
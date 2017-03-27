//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek Orca yang mewakili hewan Orca. 
  * objek akan di masukkan ke dalam zoo.
  */
package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;

public class Orca extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 7700;
  private final String food_type = "Carnivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammalia merupakan kelas hewan vertebrata" + 
  "yang ciri utama nya memiliki kelenjar susu";
  /** @brief Ctor objek Orca.
    * Terbentuk objek Orca.
    */ 
  public Orca() {
    super('r',false);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "Orca";
    animal_type[0] = "Water";
    AddEnemy("IkanCupang");
    AddEnemy("IkanKalajengking");
    AddEnemy("IkanSungutGanda");
  } 
  /** @brief Method Interact objek Orca.
    * Menampilkan keluaran saat adanya interaksi.
    * Interaksi dilakukan dengan pengunjung.
    */
   public void Interact() {
    System.out.println("Orca itu lumba lumba lhoo bukan paus~");
  }
  /** @brief Method IsEnemy objek Orca.
    * Mengecek hewan lain apakah musuh Orca atau tidak.
    * Musuh ialah yang tidak dapat diletakkan 1 kandang.
    * @param hewan yang akan di cek.
    */

  /** @brief Method GedFoodType objek Orca.
    * Memperoleh tipe makanan yang dimakan oleh hewan.
    */
  public String GetFoodType(){
    return food_type;
  }
  public String GetClassName(){
    return kelas;
  }
  public String GetDeskripsi(){
    return deskripsi;
  }
  /** @brief Method Deskripsi objek Orca.
      * Menghasilkan deskripsi tentang hewan.
      */
  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
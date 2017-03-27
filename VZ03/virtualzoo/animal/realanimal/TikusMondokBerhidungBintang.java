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

public class TikusMondokBerhidungBintang extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 0.1;
  private final String food_type = "Carnivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammalia merupakan kelas hewan vertebrata" + 
  "yang ciri utama nya memiliki kelenjar susu";
  /** @brief Ctor objek TikusMondokBerhitungBintang.
    * Terbentuk objek TikusMondokBerhitungBintang.
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
  /** @brief Method Interact objek TikusMondokBerhitungBintang.
    * Menampilkan keluaran saat adanya interaksi.
    * Interaksi dilakukan dengan pengunjung.
    */
   public void Interact() {
    System.out.println("Hidung bintangku sebenarnya adalah alat sensor yang " +
    "dapat mendeteksi gelombang seismic");
  }
  /** @brief Method IsEnemy objek TikusMondokBerhitungBintang.
    * Mengecek hewan lain apakah musuh TikusMondokBerhitungBintang atau tidak.
    * Musuh ialah yang tidak dapat diletakkan 1 kandang.
    * @param hewan yang akan di cek.
    */

  /** @brief Method GedFoodType objek TikusMondokBerhitungBintang.
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
  /** @brief Method Deskripsi objek TikusMondokBerhitungBintang.
      * Menghasilkan deskripsi tentang hewan.
      */
  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
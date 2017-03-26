//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek Okapi yang mewakili hewan Okapi. 
  * objek akan di masukkan ke dalam zoo.
  */
public class Okapi extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 250;
  private final String food_type = "Herbivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammalia merupakan kelas hewan vertebrata" + 
  "yang ciri utama nya memiliki kelenjar susu";
  /** @brief Ctor objek Okapi.
    * Terbentuk objek Okapi.
    */ 
  public Okapi() {
    super('o',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "Okapi";
    animal_type[0] = "Land";
  } 
  /** @brief Method Interact objek Okapi.
    * Menampilkan keluaran saat adanya interaksi.
    * Interaksi dilakukan dengan pengunjung.
    */
   public void Interact() {
    System.out.println("nguuut");
    System.out.println("aku hewan yang unik lhooo, aku memiliki badan perpaduan" +
         "antara jerapah dan zebra");
  }
  /** @brief Method IsEnemy objek Okapi.
    * Mengecek hewan lain apakah musuh Okapi atau tidak.
    * Musuh ialah yang tidak dapat diletakkan 1 kandang.
    * @param hewan yang akan di cek.
    */
  public boolean IsEnemy(String animal) {
    return false;
  }
  /** @brief Method GedFoodType objek Okapi.
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
  /** @brief Method Deskripsi objek Okapi.
      * Menghasilkan deskripsi tentang hewan.
      */
  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
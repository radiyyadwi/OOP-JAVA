//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek Platypus yang mewakili hewan Platypus. 
  * objek akan di masukkan ke dalam zoo.
  */
public class Platypus extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 2;
  private final String food_type = "Carnivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammalia merupakan kelas hewan vertebrata" + 
  "yang ciri utama nya memiliki kelenjar susu";
  /** @brief Ctor objek Platypus.
    * Terbentuk objek Platypus.
    */ 
  public Platypus() {
    super('p',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name =  "Platypus";
    animal_type[0] = "Land";
    animal_type[1] = "Water";
  } 
  /** @brief Method Interact objek Platypus.
    * Menampilkan keluaran saat adanya interaksi.
    * Interaksi dilakukan dengan pengunjung.
    */
   public void Interact() {
    System.out.println("sebenarnya aku adalah perry");
  }
  /** @brief Method IsEnemy objek Platypus.
    * Mengecek hewan lain apakah musuh Platypus atau tidak.
    * Musuh ialah yang tidak dapat diletakkan 1 kandang.
    * @param hewan yang akan di cek.
    */
  public boolean IsEnemy(String animal) {
    return false;
  }
  /** @brief Method GedFoodType objek Platypus.
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
  /** @brief Method Deskripsi objek Platypus.
      * Menghasilkan deskripsi tentang hewan.
      */
  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
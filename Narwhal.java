//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek Narwhal yang mewakili hewan Narwhal. 
  * objek akan di masukkan ke dalam zoo.
  */
public class Narwhal extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 940;
  private final String food_type = "Carnivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammalia merupakan kelas hewan vertebrata" + 
  "yang ciri utama nya memiliki kelenjar susu";
  /** @brief Ctor objek Narwhal.
    * Terbentuk objek Narwhal.
    */ 
  public Narwhal() {
    super('n',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "Narwhal";
    animal_type[0] = "Water";
  } 
  /** @brief Method Interact objek Narwhal.
    * Menampilkan keluaran saat adanya interaksi.
    * Interaksi dilakukan dengan pengunjung.
    */
   public void Interact() {
    System.out.println("Unicorn may be not real, but i'm real!");
  }
  /** @brief Method IsEnemy objek Narwhal.
    * Mengecek hewan lain apakah musuh Narwhal atau tidak.
    * Musuh ialah yang tidak dapat diletakkan 1 kandang.
    * @param hewan yang akan di cek.
    */
  public boolean IsEnemy(String animal) {
    return false;
  }
  /** @brief Method GedFoodType objek Narwhal.
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
  /** @brief Method Deskripsi objek Narwhal.
      * Menghasilkan deskripsi tentang hewan.
      */
  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
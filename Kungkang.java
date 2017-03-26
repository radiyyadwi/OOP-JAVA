//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek Kungkang yang mewakili hewan Kungkang. 
  * objek akan di masukkan ke dalam zoo.
  */
public class Kungkang extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 10;
  private final String food_type = "Omnivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammal merupakan kelas hewan vertebrata" + 
  "yang ciri utama nya memiliki kelenjar susu";
  /** @brief Ctor objek Kungkang.
    * Terbentuk objek Kungkang.
    */ 
  public Kungkang() {
    super('k',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "Kungkang";
    animal_type[0] = "Land";
  } 
  /** @brief Method Interact objek Kungkang.
    * Menampilkan keluaran saat adanya interaksi.
    * Interaksi dilakukan dengan pengunjung.
    */
   public void Interact() {
    System.out.println("aku gak gendut, cuman agak bulet dikit");
    System.out.println("Mammal merupakan kelas hewan vertebrata" + 
    "yang ciri utama nya memiliki kelenjar susu");
  }
  /** @brief Method IsEnemy objek Kungkang.
    * Mengecek hewan lain apakah musuh Kungkang atau tidak.
    * Musuh ialah yang tidak dapat diletakkan 1 kandang.
    * @param hewan yang akan di cek.
    */
  public boolean IsEnemy(String animal) {
    return false;
  }
  /** @brief Method GedFoodType objek Kungkang.
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
  /** @brief Method Deskripsi objek Kungkang.
      * Menghasilkan deskripsi tentang hewan.
      */
  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
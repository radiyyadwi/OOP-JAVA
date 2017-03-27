

//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek Yak yang mewakili hewan Yak. 
  * objek akan di masukkan ke dalam zoo.
  */
public class Yak extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 500;
  private final String food_type = "Herbivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammalia merupakan kelas hewan vertebrata" + 
  "yang ciri utama nya memiliki kelenjar susu";
  /** @brief Ctor objek Yak.
    * Terbentuk objek Yak.
    */ 
  public Yak() {
    super('y',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name =  "Yak";
    animal_type[0] = "Land";
  } 
  /** @brief Method Interact objek Yak.
    * Menampilkan keluaran saat adanya interaksi.
    * Interaksi dilakukan dengan pengunjung.
    */
   public void Interact() {
    System.out.println("Hi I'm Yak!");
    System.out.println("I am usually found in the mountainous regions of " + 
    "central Asia ");
  }
  /** @brief Method IsEnemy objek Yak.
    * Mengecek hewan lain apakah musuh Yak atau tidak.
    * Musuh ialah yang tidak dapat diletakkan 1 kandang.
    * @param hewan yang akan di cek.
    */
  public boolean IsEnemy(String animal) {
    return false;
  }
  /** @brief Method GedFoodType objek Yak.
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
  /** @brief Method Deskripsi objek Yak.
      * Menghasilkan deskripsi tentang hewan.
      */
  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
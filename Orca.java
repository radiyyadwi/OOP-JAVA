//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek Orca yang mewakili hewan Orca. 
  * objek akan di masukkan ke dalam zoo.
  */
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
    super('r',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "Orca";
    animal_type[0] = "Water";
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
  public boolean IsEnemy(String animal) {
    return false;
  }
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
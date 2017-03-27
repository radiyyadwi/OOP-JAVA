

//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** @brief Kelas objek Undan yang mewakili hewan Undan. 
  * objek akan di masukkan ke dalam zoo.
  */
public class Undan extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 5;
  private final String food_type = "Carnivore";
  private final String kelas = "Aves";
  private final String deskripsi = "Aves merupakan kelas kelompok hewan " + 
  "vertebrata yang memiliki bulu dan sayap";
  /** @brief Ctor objek Undan.
    * Terbentuk objek Undan.
    */ 
  public Undan() {
    super('u',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name =  "Undan";
    animal_type[0] = "Flying";
  } 
  /** @brief Method Interact objek Undan.
    * Menampilkan keluaran saat adanya interaksi.
    * Interaksi dilakukan dengan pengunjung.
    */
   public void Interact() {
    System.out.println("Aku merupakan Burung Undan, banyak yang memanggilku " + 
    "burung Pelikan aku suka banget sama kamu eh maksudku ikan");
  }
  /** @brief Method IsEnemy objek Undan.
    * Mengecek hewan lain apakah musuh Undan atau tidak.
    * Musuh ialah yang tidak dapat diletakkan 1 kandang.
    * @param hewan yang akan di cek.
    */
  public boolean IsEnemy(String animal) {
    return false;
  }
  /** @brief Method GedFoodType objek Undan.
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
  /** @brief Method Deskripsi objek Undan.
      * Menghasilkan deskripsi tentang hewan.
      */
  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
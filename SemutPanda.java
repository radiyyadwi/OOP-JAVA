/** @brief Kelas objek SemutPanda yang mewakili hewan SemutPanda. 
  * objek akan di masukkan ke dalam zoo.
  */
public class SemutPanda extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 0.1;
  private final String food_type = "Herbivore";
  private final String kelas = "Insect";
  private final String deskripsi = "Insect merupakan hewan avertebrata yang " + 
  "terdiri dari 3 bagian tubuh, dan bernafas dengan trakea";
  /** @brief Ctor objek SemutPanda.
    * Terbentuk objek SemutPanda.
    */ 
  public SemutPanda() {
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name =  "SemutPanda";
    animal_type[0] = "Land";
    animal_type[1] = "Water";
  } 
  /** @brief Method Interact objek SemutPanda.
    * Menampilkan keluaran saat adanya interaksi.
    * Interaksi dilakukan dengan pengunjung.
    */
   public void Interact() {
    System.out.println("Aku bukan semut, tetapi lebah!");
  }
  /** @brief Method IsEnemy objek SemutPanda.
    * Mengecek hewan lain apakah musuh SemutPanda atau tidak.
    * Musuh ialah yang tidak dapat diletakkan 1 kandang.
    * @param hewan yang akan di cek.
    */
  public boolean IsEnemy(String animal) {
    return false;
  }
  /** @brief Method GedFoodType objek SemutPanda.
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
  /** @brief Method Deskripsi objek SemutPanda.
      * Menghasilkan deskripsi tentang hewan.
      */
  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
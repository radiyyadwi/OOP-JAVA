//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** Class yang menunjukkan hewan real Kungkang
  * @author Radiyya Dwisaputra/13515023
  * @version 1.0, March 2017
  */
public class Kungkang extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 10;
  private final String food_type = "Omnivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammal merupakan kelas hewan vertebrata" + 
  "yang ciri utama nya memiliki kelenjar susu";
  /** Constructor
   *  @see java.lang.reflect.Constructor
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
  /** Interaction Kungkang kepada pengunjung
   * @see Animal#Interact()
   */
   public void Interact() {
    System.out.println("aku gak gendut, cuman agak bulet dikit");
    System.out.println("Mammal merupakan kelas hewan vertebrata" + 
    "yang ciri utama nya memiliki kelenjar susu");
  }
   /** Pengecekan apakah String animal enemy atau bukan
    * @param animal string animal yang akan dicek
    * @see Animal#IsEnemy(java.lang.String)
    */
   public boolean IsEnemy(String animal) {
     return false;
   }
   /** Memperoleh type makanan animal
    * @see Animal#GetFoodType()
    * @see AnimalFoodType#GetFoodType()
    */
   public String GetFoodType(){
     return food_type;
   }
   /** Memperoleh nama kelas dari animal
    * @see AnimalClass#GetClassName()
    */
   public String GetClassName(){
     return kelas;
   }
   /** Memperoleh deskripsi animal 
    * @see AnimalClass#GetDeskripsi()
    */
   public String GetDeskripsi(){
     return deskripsi;
   }
   /** Menuliskan deskripsi hewan
    */
   public void Deskripsi(){
     System.out.print(super.GetSpeciesName());
     System.out.print(" termasuk dalam kelas ");
     System.out.println(GetClassName());
     System.out.println(deskripsi);
   }
}
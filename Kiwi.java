//Nama : Radiyya Dwisaputra
//NIM : 13515023
/** Class yang menunjukkan hewan real Kiwi
  * @author Radiyya Dwisaputra/13515023
  * @version 1.0, March 2017
  */
public class Kiwi extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 2.4;
  private final String food_type = "Carnivore";
  private final String kelas = "Aves";
  private final String deskripsi = "Aves merupakan kelas kelompok hewan " + 
  "vertebrata yang memiliki bulu dan sayap";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public Kiwi() {
    super('w',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "Kiwi";
    animal_type[0] = "Land";
  }
  /** Interaction Kiwi kepada pengunjung
   * @see Animal#Interact()
   */
   public void Interact() {
    System.out.print("aku gak gendut, cuman agak bulet dikit");
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
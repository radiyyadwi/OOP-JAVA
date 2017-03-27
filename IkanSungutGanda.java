//Nama : Radiyya Dwisaputra
//NIM : 13515023
/**
  * Class yang menunjukkan hewan real IkanSungutGanda
  * @author Radiyya Dwisaputra/13515023
  * @version 1.0, March 2017
  */
public class IkanSungutGanda extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 32;
  private final String food_type = "Carnivore";
  private final String kelas = "Actinopterygii";
  private final String deskripsi = "Actinopterygii adalah ikan yang memiliki sirip kipas";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public IkanSungutGanda() {
    super('g',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "IkanSungutGanda";
    animal_type[0] = "Water";
  }
  /** Interaction IkanSungutGanda kepada pengunjung
   * @see Animal#Interact()
   */
   public void Interact() {
    System.out.print("Halo aku ikan di bawah laut dalam lho, aku punya lampu supaya aku" + 
    "bisa tetap melihat di kegelapan");
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
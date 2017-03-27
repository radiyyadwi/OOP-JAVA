

//Nama : Radiyya Dwisaputra
//NIM : 13515023
/**
  * Class yang menunjukkan hewan real BurungCekakak
  * @author Radiyya Dwisaputra/13515023
  * @version 1.0, March 2017
  */
public class BurungCekakak extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 0.1;
  private final String food_type = "Omnivore";
  private final String kelas = "Aves";
  private final String deskripsi = "Aves merupakan kelas kelompok hewan " + 
  "vertebrata yang memiliki bulu dan sayap";
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public BurungCekakak() {
    super('c',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "BurungCekakak";
    animal_type[0] = "Flying";
  }
  /** Interaction BurungCekakak kepada pengunjung
   * @see Animal#Interact()
   */
  public void Interact() {
    System.out.println("Hi I'm Kingfisher Bird! ");
    System.out.println("I can fly at 40km/h top speed ");
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
   * 
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


//Nama : Radiyya Dwisaputra
//NIM : 13515023
/**
  * Class yang menunjukkan hewan real Angsa
  * @author Radiyya Dwisaputra/13515023
  * @version 1.0, March 2017
  */
public class Angsa extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 5.1;
  private final String food_type = "Omnivore";
  private final String kelas = "Aves";
  private final String deskripsi = "Aves merupakan kelas kelompok hewan " + 
  "vertebrata yang memiliki bulu dan sayap";
  /** Constructor Angsa
    * @see java.lang.reflect.Constructor 
    */
  public Angsa() {
    super('a',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "Angsa";
    animal_type[0] = "Land";
    animal_type[1] = "Water";
  }
  /** Interaction Angsa kepada pengunjung
    * @see Animal#Interact()
    */
   public void Interact() {
    System.out.println( "sang angsa penguasa 2 Habitat B) ");
  }
  /** Pengecekan apakah String animal enemy atau bukan
    * @param animal string animal yang akan dicek
    * @see Animal#IsEnemy(java.lang.String)
    */
  public boolean IsEnemy(String animal) {
    return false;
  }
  /** Memperoleh type makanan animal
    * 
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
    * 
    * @see AnimalClass#GetDeskripsi()
    */
  public String GetDeskripsi(){
    return deskripsi;
  }
  /** Menuliskan deskripsi hewan
    * 
    */
  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
//Nama : Radiyya Dwisaputra
//NIM : 13515023
public class Angsa extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 5.1;
  private final String food_type = "Omnivore";
  private final String kelas = "Aves";
  private final String deskripsi = "Aves merupakan kelas kelompok hewan " + 
  "vertebrata yang memiliki bulu dan sayap";
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
   public void Interact() {
    System.out.println( "sang angsa penguasa 2 Habitat B) ");
  }
  public boolean IsEnemy(String animal) {
    return false;
  }
  public String GetFoodType(){
    return food_type;
  }
  public String GetClassName(){
    return kelas;
  }
  public String GetDeskripsi(){
    return deskripsi;
  }

  public void Deskripsi(){
    System.out.print(super.GetSpeciesName());
    System.out.print(" termasuk dalam kelas ");
    System.out.println(GetClassName());
    System.out.println(deskripsi);
  }
}
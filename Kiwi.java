//Nama : Radiyya Dwisaputra
//NIM : 13515023
public class Kiwi extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 2.4;
  private final String food_type = "Carnivore";
  private final String kelas = "Aves";
  private final String deskripsi = "Aves merupakan kelas kelompok hewan " + 
  "vertebrata yang memiliki bulu dan sayap";

  
  public Kiwi() {
    super('w',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "Kiwi";
    animal_type[0] = "Land";
  }
   public void Interact() {
    System.out.print("aku gak gendut, cuman agak bulet dikit");
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
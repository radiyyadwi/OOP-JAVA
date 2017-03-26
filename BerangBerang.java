//Nama : Radiyya Dwisaputra
//NIM : 13515023
public class BerangBerang extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 27;
  private final String food_type = "Omnivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammal merupakan kelas hewan vertebrata " +
  "yang ciri utama nya memiliki kelenjar susu";
  public BerangBerang() {
    super('b',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "BerangBerang";
    animal_type[0] = "Water";
    animal_type[1] = "Land";
  }
   public void Interact() {
    System.out.println( "sungai kotor gini gimana mbikin bendungan nya coba? -_-");
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
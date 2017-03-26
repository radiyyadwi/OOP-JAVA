public class IkanCupang extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 0.03;
  private final String food_type = "Carnivore";
  private final String kelas = "Actinopterygii";
  private final String deskripsi = "Actinopterygii adalah ikan yang memiliki sirip kipas";
  public IkanCupang() {
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "IkanCupang";
    animal_type[0] = "Water";
  }
   public void Interact() {
    System.out.println("Ikan, ikan apa yang paling jelek??");
    sleep(2));  
    System.out.println("I...kan kamu jelek")
    sleep(1);
    System.out.println("maap..")
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
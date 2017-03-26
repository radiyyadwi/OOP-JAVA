public class Fossa extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 10;
  private final String food_type = "Carnivore";
  private final String kelas = "Mammal";
  private final String deskripsi = "Mammal merupakan kelas hewan vertebrata " +
  "yang ciri utama nya memiliki kelenjar susu";
  public Fossa() {
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "Fossa";
    animal_type[0] = "Flying";
  }
   public void Interact() {
    System.out.println("Hi I'm Fossa!");
    System.out.println("I am found nowhere else except on the island of Madagascar");
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
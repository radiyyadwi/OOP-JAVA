public class ElangBotak extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 4;
  private final String food_type = "Carnivore";
  private final String kelas = "Aves";
  private final String deskripsi = "Aves merupakan kelas kelompok hewan " + 
  "vertebrata yang memiliki bulu dan sayap";
  public ElangBotak() {
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "ElangBotak";
    animal_type[0] = "Flying";
  }
   public void Interact() {
    System.out.println("aku hewan pemangsa yang kuat bahkan karena " + 
      "kekuatankku aku dijadikan simbol negara Amerika Serikat ");
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
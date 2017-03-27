//Nama : Radiyya Dwisaputra
//NIM : 13515023
package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;

public class HiuGoblin extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 210;
  private final String food_type = "Carnivore";
  private final String kelas = "Chondrichtyes";
  private final String deskripsi = "Chondrichthyes merupakan ikan dengan tulang rawan";
  public HiuGoblin() {
    super('h',false);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "HiuGoblin";
    animal_type[0] = "Water";
    AddEnemy("IkanCupang");
    AddEnemy("IkanKalajengking");
    AddEnemy("IkanSungutGanda");
  }
   public void Interact() {
    System.out.println( "I can extend my jaws!");
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
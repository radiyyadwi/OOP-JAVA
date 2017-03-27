//Nama : Radiyya Dwisaputra
//NIM : 13515023
package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;

public class IkanSungutGanda extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 32;
  private final String food_type = "Carnivore";
  private final String kelas = "Actinopterygii";
  private final String deskripsi = "Actinopterygii adalah ikan yang memiliki sirip kipas";
  public IkanSungutGanda() {
    super('g',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "IkanSungutGanda";
    animal_type[0] = "Water";
  }
   public void Interact() {
    System.out.print("Halo aku ikan di bawah laut dalam lho, aku punya lampu supaya aku" + 
    "bisa tetap melihat di kegelapan");
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
//Nama : Radiyya Dwisaputra
//NIM : 13515023
package virtualzoo.animal.realanimal;

import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;

import java.util.concurrent.TimeUnit;
public class IkanCupang extends Animal
implements AnimalClass, AnimalFoodType
{
  private final double defaultweight = 0.03;
  private final String food_type = "Carnivore";
  private final String kelas = "Actinopterygii";
  private final String deskripsi = "Actinopterygii adalah ikan yang memiliki sirip kipas";
  public IkanCupang() {
    super('i',true);
    weight = defaultweight;
    food_per_day = weight/4;
    position.SetX(-1);
    position.SetY(-1);
    species_name = "IkanCupang";
    animal_type[0] = "Water";
  }
  public void Interact() {
    System.out.println("Ikan, ikan apa yang paling jelek??");
    try {
        Thread.sleep(2000);
    } 
    catch(InterruptedException error) {
    } 
    System.out.println("I...kan kamu jelek");
    try {
        Thread.sleep(1000);
    } 
    catch(InterruptedException error) {
    } 
    System.out.println("maap..");
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
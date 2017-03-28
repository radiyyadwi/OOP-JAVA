// Nama :  M. Ferdi Ghozali
// NIM : 13515014

package virtualzoo.animal.animalclass;
/**
 * Class yang menandakan Class dari masing-masing hewan.
 * @author M.Ferdi Ghozali/13515014
 * @version 1.0, March 2017
 */

public interface AnimalClass {
  /** Menghasilkan deskripsi tentang animal.
   * 
   * @return deskripsi hewan 
   */
  public String getDeskripsi();
  /** Menghasilkan nama kelas animal.
    * @return kelas animal
    */

  public String getClassName();
}
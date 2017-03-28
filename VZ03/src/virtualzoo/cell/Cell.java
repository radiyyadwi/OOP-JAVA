//File: Cell.java
//Author: David Theosaksomo
//NIM: 13515131
package virtualzoo.cell;

import virtualzoo.renderable.Renderable;
/**
 * Class yang menunjukkan Cell
 * @author David Theosaksomo/13515131
 * @version 1.0, March 2017
 */
public abstract class Cell implements Renderable {
  protected String cell_type;
  /** Constructor
   *  @see java.lang.reflect.Constructor
   */
  public Cell() {
  }
  /** Constructor dengan parameter
   *  @param tipe menunjukan type cell
   */
  public Cell(String tipe) {
    cell_type = tipe;
  }
  /** Menghasilkan type dari cell
   * @return String type cell
   */
  public String GetCellType() {
    return cell_type;
  }
  /** Menghasiklan type dari habitat
   * @return String type habitat
   */
  public abstract String GetFacHabType();
  /**
   * Mengubah set_type sesuai parameter
   * @param tipe menunjukkan type yang diinginkan
   */
  public void SetCellType(String tipe) {
    cell_type = tipe; 
  }
  /**Mencetak Cell dengan melihat dalam Cage atau tidak
   * @param oncage menunjukkan Cell dalam Cage atau tidak
   */
  public abstract void Render(boolean oncage);
  /** Mencetak Cell
   */
  @Override
  public abstract void Render();
  /** Menjadikan tempat masuk Virtual Zoo
   */
  public abstract void Enter();
}

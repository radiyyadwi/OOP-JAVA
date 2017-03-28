//File: Cell.java
//Author: David Theosaksomo
//NIM: 13515131

package virtualzoo.cell;

import virtualzoo.renderable.Renderable;
/** Class yang menunjukkan Cell.
 * @author David Theosaksomo/13515131
 * @version 1.0, March 2017
 */

public abstract class Cell implements Renderable {
  protected String cellType;
  /** Constructor.
   *  @see java.lang.reflect.Constructor
   */
  
  public Cell() {}
  /** Constructor dengan parameter.
   *  @param tipe menunjukan type cell
   */
  
  public Cell(String tipe) {
    cellType = tipe;
  }
  /** Menghasilkan type dari cell.
   * @return String type cell
   */

  public String getCellType() {
    return cellType;
  }
  /** Menghasiklan type dari habitat.
   * @return String type habitat
   */
 
  public abstract String getFacHabType();
  /**
   * Mengubah set_type sesuai parameter.
   * @param tipe menunjukkan type yang diinginkan
   */
  
  public void setCellType(String tipe) {
    cellType = tipe; 
  }
  /**Mencetak Cell dengan melihat dalam Cage atau tidak.
   * @param oncage menunjukkan Cell dalam Cage atau tidak
   */
  
  public abstract void render(boolean oncage);
  /** Mencetak Cell.
   */
  
  @Override
  public abstract void render();
  /** Menjadikan tempat masuk Virtual zoo.
   */
  
  public abstract void enter();
}

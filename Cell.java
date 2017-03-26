//File: Cell.java
//Author: David Theosaksomo
//NIM: 13515131

public abstract class Cell implements Renderable {
  protected String cell_type;
  public Cell() {
  }
  public Cell(String tipe) {
    cell_type = tipe;
  }
  public String GetCellType() {
    return cell_type;
  }
  public abstract String GetFacHabType();  
  public void SetCellType(String tipe) {
    cell_type = tipe; 
  }
  public abstract void Render(boolean oncage);
  public abstract void Render();
  public abstract void Enter();
}

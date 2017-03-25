public class UnTamed {
  private String[] enemy_list;
  private int n_enemy = 0;

  public UnTamed() {
    enemy_list = new String [20];
    for (int i = 0; i < 20; i++) {
      enemy_list[i] = " ";
    }
  }
  /** @brief  ctor
  * @param  enemy list enemy hewan
  */
  public UnTamed(String[] enemy) {
    enemy_list = new String [20];
    for (int i = 0; i < 20; i++) {
      enemy_list[i] = enemy[i];
    }
  }
  /** @brief  mengembalikan boolean apakah hewan masuk dalam enemylist
  * @param  animal nama animal
  */
  public boolean IsEnemy(String animal) {
    int i = 0;
    boolean found = false;
    while (i < 20 && !found) {
      if (animal == enemy_list[i]) {
        found = true;
      }
    i++;
    }
    return found;
  }
  /* menambahkan animal enemy ke dalam enemy list */
  public void AddEnemy(String animal_name) {
    if (n_enemy < 19) {
      enemy_list[n_enemy] = animal_name;
      n_enemy++;
    }
  }
}
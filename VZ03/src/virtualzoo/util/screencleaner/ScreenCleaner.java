//File: ScreenCleaner.java
//Author: David Theosaksomo
//NIM: 13515131

package virtualzoo.util.screencleaner;
/** Class untuk membersihkan terminal.
 * @author David Theosaksomo/13515131
 * @version 1.0 , March 2017
 */

public class ScreenCleaner {
  /** Membersihkan terminal.
   */
  public void clearScreen() {
    for (int i = 0; i < 50; ++i) {
      System.out.println();
    }
  } 
}
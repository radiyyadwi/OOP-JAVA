//File: DriverZoo.java
//Author: David Theosaksomo
//NIM: 13515131

package virtualzoo.driver;

import java.util.Random;
import java.util.Scanner; 
import virtualzoo.animal.Animal;
import virtualzoo.animal.animalclass.AnimalClass;
import virtualzoo.animal.animalfoodtype.AnimalFoodType;
import virtualzoo.animal.realanimal.Angsa;
import virtualzoo.animal.realanimal.BerangBerang;
import virtualzoo.animal.realanimal.BurungCekakak;
import virtualzoo.animal.realanimal.BurungJulang;
import virtualzoo.animal.realanimal.ElangBotak;
import virtualzoo.animal.realanimal.Fossa;
import virtualzoo.animal.realanimal.HiuGoblin;
import virtualzoo.animal.realanimal.IkanCupang;
import virtualzoo.animal.realanimal.IkanKalajengking;
import virtualzoo.animal.realanimal.IkanSungutGanda;
import virtualzoo.animal.realanimal.Kiwi;
import virtualzoo.animal.realanimal.Kungkang;
import virtualzoo.animal.realanimal.Narwhal;
import virtualzoo.animal.realanimal.Okapi;
import virtualzoo.animal.realanimal.Orca;
import virtualzoo.animal.realanimal.Platypus;
import virtualzoo.animal.realanimal.SemutPanda;
import virtualzoo.animal.realanimal.TikusMondokBerhidungBintang;
import virtualzoo.animal.realanimal.Undan;
import virtualzoo.animal.realanimal.Yak;
import virtualzoo.cage.Cage;
import virtualzoo.cell.Cell;
import virtualzoo.cell.facility.park.Park;
import virtualzoo.cell.facility.restaurant.Restaurant;
import virtualzoo.cell.facility.road.Road;
import virtualzoo.cell.facility.road.entrance.Entrance;
import virtualzoo.cell.facility.road.exit.Exit;
import virtualzoo.cell.habitat.Habitat;
import virtualzoo.cell.habitat.airhabitat.AirHabitat;
import virtualzoo.cell.habitat.landhabitat.LandHabitat;
import virtualzoo.cell.habitat.waterhabitat.WaterHabitat;
import virtualzoo.util.mesinkar.Mesinkar;
import virtualzoo.util.point.Point;
import virtualzoo.util.screencleaner.ScreenCleaner;
import virtualzoo.zoo.Zoo;
/** Class Zoo memiliki atribut  matriks Cell dimana 1 cell merepresentasikan.
  * sebuah petak 1x1m
  * @author David Theosaksomo/13515131
  * @version 1.0, March 2017
  */

public class DriverZoo {
  private int height;
  private int width;
  private Zoo virtualZoo;
  private Cage[] cageList;
  private Animal[] animalList;
  private static final int MAXCAGE = 20;
  private static final int MAXANIMAL = 100;
  private static final int MAXAREAINCAGE = 50;
  private static final int DEFAULTHEIGHT = 100;
  private static final int DEFAULTWIDTH = 100;
  private Point guestPos;
  private int banyakAnimal = 0;
  private boolean[] isAdaCage;
  /** Driver program Virtual Zoo.
   * 
   */

  public DriverZoo() {
    virtualZoo = new Zoo(DEFAULTWIDTH,DEFAULTHEIGHT);
    guestPos = new Point(-1,-1);
    Mesinkar msk = new Mesinkar();
    //Baca File dan Inisialisasi Zoo;
    msk.start();
    width = msk.getCi();
    msk.adv();
    msk.adv();
    height = msk.getCi();
    msk.adv();
    cageList = new Cage [MAXCAGE];
    animalList = new Animal [MAXANIMAL];
    //Ciptakan variabel temporary
    int[] ukuranCage = new int [MAXCAGE];
    for (int i = 0; i < MAXCAGE; i++) {
      ukuranCage[i] = 0;
    }
    isAdaCage = new boolean [MAXCAGE];
    for (int i = 0; i < MAXCAGE; i++) {
      isAdaCage[i] = false;
    }
    Point[][] areaList = new Point[MAXCAGE][MAXAREAINCAGE];
    for (int i = 0; i < MAXCAGE; i++) {
      for (int j = 0; j < MAXAREAINCAGE; j++) {
        areaList[i][j] = new Point();
      }  
    }
    String[] cageType = new String [MAXCAGE];
    for (int i = 0; i < MAXCAGE; i++) {
      cageType[i] = ".";
    }
    int[][] animalIndex = new int [height + 1][width + 1];
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        animalIndex[i][j] = -1;
      }
    }
    //variable-variabel sementara
    AirHabitat a;
    LandHabitat b;
    WaterHabitat c;
    Park d;
    Restaurant e;
    Road f;
    Entrance g;
    Exit h;
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        switch (msk.getCc()) {
          case 'A' : {
            a = new AirHabitat();
            virtualZoo.setZooElmt(i,j,a);
          }
          break;
          case 'L' : {
            b = new LandHabitat();
            virtualZoo.setZooElmt(i,j,b);
          }
          break;
          case 'W' : {
            c = new WaterHabitat();
            virtualZoo.setZooElmt(i,j,c);
          }
          break;
          case 'P' : {
            d = new Park();
            d.addWahana("RollerCosty");
            d.addWahana("PutingBeliung");
            d.addWahana("RumahZombie");
            virtualZoo.setZooElmt(i,j,d);
          }
          break;
          case 'R' : {
            e = new Restaurant();
            e.addMenu("Nasi Bakar dengan sayur bayam");
            e.addMenu("Steak Daging Asap dengan wortel ");
            e.addMenu("Es Krim Pakai Brokoli");
            virtualZoo.setZooElmt(i,j,e);
          }
          break;
          case '_' : {
            f = new Road();
            virtualZoo.setZooElmt(i,j,f);
          }
          break;
          case 'E' : {
            g = new Entrance();
            virtualZoo.setZooElmt(i,j,g);
          }
          break;
          case 'X' : {
            h = new Exit();
            virtualZoo.setZooElmt(i,j,h);
          }
          break;
          default : {
            System.out.print("");
          }
        }

        //Jika Cell merupakan Habitat
        if (msk.getCc() == 'A' || msk.getCc() == 'L' || msk.getCc() == 'W') {
          //Tambahkan Cage
          char temp = msk.getCc();
          msk.adv(); 
          int num = msk.getCi();

          //Jika ada cage
          if (num > 0) {  
            num--;
            //Jika Cage untuk id tersebut belum dibuat
            if (!isAdaCage[num]) {
              isAdaCage[num] = true;
              switch (temp) {
                case 'A' : {
                  cageType[num] = "Air";
                }
                break;
                case 'L' : {
                  cageType[num] = "Land";
                }
                break;
                case 'W' : {
                  cageType[num] = "Water";
                }
                break;
                default : {
                  System.out.print("");
                }
              }
            }
            if ((temp == 'A' && cageType[num].equals("Air")) 
                ||  (temp == 'L' && cageType[num].equals("Land")) 
                || (temp == 'W' && cageType[num].equals("Water"))) {
              areaList[num][ukuranCage[num]].setX(j);
              areaList[num][ukuranCage[num]].setY(i);
              ukuranCage[num] ++;
              //Pembacaan Animal
              msk.adv();
              if (msk.getCc() != '-') {
                switch (msk.getCc()) {
                  case 'a' : {
                    animalList[banyakAnimal] = new Angsa();  
                  } break;
                  case 'b' : {
                    animalList[banyakAnimal] = new BerangBerang();  
                  } break;
                  case 'c' : {
                    animalList[banyakAnimal] = new BurungCekakak();  
                  } break;
                  case 'e' : {
                    animalList[banyakAnimal] = new ElangBotak();  
                  } break;
                  case 'f' : {
                    animalList[banyakAnimal] = new Fossa();  
                  } break;
                  case 'g' : {
                    animalList[banyakAnimal] = new IkanSungutGanda();  
                  } break;
                  case 'h' : {
                    animalList[banyakAnimal] = new HiuGoblin();  
                  } break;
                  case 'i' : {
                    animalList[banyakAnimal] = new IkanCupang();  
                  } break;
                  case 'j' : {
                    animalList[banyakAnimal] = new BurungJulang();  
                  } break;
                  case 'k' : {
                    animalList[banyakAnimal] = new Kungkang();  
                  } break;
                  case 'l' : {
                    animalList[banyakAnimal] = new IkanKalajengking();  
                  } break;
                  case 'n' : {
                    animalList[banyakAnimal] = new Narwhal();  
                  } break;
                  case 'o' : {
                    animalList[banyakAnimal] = new Okapi();  
                  } break;
                  case 'p' : {
                    animalList[banyakAnimal] = new Platypus();  
                  } break;
                  case 'r' : {
                    animalList[banyakAnimal] = new Orca();  
                  } break;
                  case 's' : {
                    animalList[banyakAnimal] = new SemutPanda();  
                  } break;
                  case 't' : {
                    animalList[banyakAnimal] = new TikusMondokBerhidungBintang();  
                  } break;
                  case 'u' : {
                    animalList[banyakAnimal] = new Undan();  
                  } break;
                  case 'w' : {
                    animalList[banyakAnimal] = new Kiwi();  
                  } break;
                  case 'y' : {
                    animalList[banyakAnimal] = new Yak();  
                  } break;
                  default : {
                    System.out.print("");
                  }
                }
                animalIndex[i][j] = banyakAnimal;
                banyakAnimal++;
              }
            } else {
              msk.adv();
            }
          }
        }
        msk.adv();
      }  
    }
    //Alokasi cage sesuai data file eksternal
    for (int i = 0; i < MAXCAGE; i++) {
      if (isAdaCage[i]) {
        cageList[i] = new Cage(i + 1, areaList[i], ukuranCage[i], cageType[i]);
      }
    }
    //Isicage dengan animal sesuai pembacaan file eksternal
    for (int i = 0; i < MAXCAGE; i++) {
      if (isAdaCage[i]) {
        for (int j = 0; j < cageList[i].getCageSize(); j++) {
          int m = cageList[i].getAreaElmt(j).getX();
          int n = cageList[i].getAreaElmt(j).getY();
          //Ada animal di posisi itu
          if (animalIndex[n][m] >= 0 && animalIndex[n][m] < banyakAnimal) {
            //Masukkan hewan kedalam cage
            cageList[i].inputAnimal(animalList[animalIndex[n][m]],j);
          }
        }
      }
    }
  }
  /** Menampilkan Zoo diatas layar dengan method render.
   */

  public void displayVirtualZoo() {
    Point up = new Point(0,0);
    Point down = new Point(width - 1,height - 1);
    displayVirtualZoo(up,down);
  }
  /** Menampilkan Zoo diatas layar dengan method render.
   * @param upleft kordinat atas kiri
   * @param downright kordinat bawah kanan
   */

  public void displayVirtualZoo(Point upleft, Point downright) {
    //Inisialisasi variabel antara
    int[][] cageMatrix = new int[height][width];
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        cageMatrix[i][j] = -1;
      }
    }
    Point[][] animalMatrix = new Point[height][width];
    for (int i = 0;i < height; i++) {
      for (int j = 0;j < width; j++) {
        animalMatrix[i][j] = new Point(-1,-1);
      }
    }
    //Variabel char cage dan animal
    for (int i = 0; i < MAXCAGE; i++) {
      if (isAdaCage[i]) {
        for (int j = 0; j < cageList[i].getCageSize(); j++) {
          int m = cageList[i].getAreaElmt(j).getX();
          int n = cageList[i].getAreaElmt(j).getY();
          cageMatrix[n][m] = i;
        }
        for (int j = 0; j < cageList[i].numberOfAnimal(); j++) {
          int m = cageList[i].getAnimal(j).getPosition().getX();
          int n = cageList[i].getAnimal(j).getPosition().getY();
          animalMatrix[n][m].setX(i);
          animalMatrix[n][m].setY(j);
        }
      }
    }
    //Create Garis Horizontal
    for (int k = upleft.getX() * 4; k < (downright.getX() + 1) * 4; k++) {
      System.out.print("_");
    }
    System.out.println('_');
    for (int i = upleft.getY(); i < downright.getY() + 1; i++) {
      for (int k = upleft.getX() * 4; k < (downright.getX() + 1) * 4; k++) {
        if (k % 4 == 0) {
          System.out.print("|");
        } else
          if (k % 4 == 1) {
            System.out.print(" ");
          } else
            if (k % 4 == 2) {
              // Jika ada kandang
              if (cageMatrix[i][k / 4] >= 0) {
                virtualZoo.getZooElmt(i,k / 4).render(true);
              } else {
                virtualZoo.getZooElmt(i,k / 4).render();
              }
            } else {
              System.out.print(" ");
            }
      }
      System.out.println('|');
      for (int k = upleft.getX() * 4; k < (downright.getX() + 1) * 4; k++) {
        if (k % 4 == 0) {
          System.out.print('|');
        } else
          if (k % 4 == 2) {  
            if (i == guestPos.getY() && k  / 4 == guestPos.getX()) {
              System.out.print("&");
            } else
              if (animalMatrix[i][k / 4].getX() >= 0) {
                cageList[animalMatrix[i][k / 4].getX()].getAnimal(animalMatrix[i][k / 4]
                .getY()).render();
              } else {
                System.out.print("_");
              } 
          } else {
            System.out.print("_");
          }
      }
      System.out.println('|');
    }
  }
  /** Menghitung jumlah makanan seluruh hewan.
   */

  public void hitungMakanan() {
    double daging = 0;
    double sayur = 0;
    double omni = 0;
    //hitung makanan masing-masing
    for (int i = 0; i < MAXCAGE; i++) {
      if (isAdaCage[i]) {
        for (int j = 0; j < cageList[i].numberOfAnimal(); j++) {
          String type = cageList[i].getAnimal(j).getFoodType();
          double foodnum = cageList[i].getAnimal(j).getFoodNum();
          if (type.equals("Omnivore")) {
            omni += foodnum;
          } else 
            if (type.equals("Carnivore")) {
              daging += foodnum;
            } else 
              if (type.equals("Herbivore")) {
                sayur += foodnum;
              } else {
                System.out.println("Tipe tidak dikenali");
              } 
        }
      }
    }
    System.out.println("Untuk memberi makan binatang di TalkingZoo dalam sehari dibutuhkan:");
    System.out.println(daging + " kg daging,");
    System.out.println(sayur + " kg sayur, dan");
    System.out.println(omni + " kg daging/sayur,");  
  }
  /** Menggerakan hewan.
   */

  public void moveAnimal() {
    for (int i = 0; i < MAXCAGE; i++) {
      if (isAdaCage[i]) {
        cageList[i].moveAnimal();
      }
    }
  }
  /** Mencetak Judul Program Virtual Zoo.
   */

  public void printTitle() {
    System.out.println(" _____     _ _    _               ______        ");    
    System.out.println("|_   _|   | | |  (_)             |___  /            ");
    System.out.println("  | | __ _| | | ___ _ __   __ _     / /  ___   ___  ");
    System.out.println("  | |/ _` | | |/ / | '_ \\ / _` |   / /  / _ \\ / _ \\ ");
    System.out.println("  | | (_| | |   <| | | | | (_| | ./ /__| (_) | (_) |");
    System.out.println("  \\_/\\__,_|_|_|\\_\\_|_| |_|\\__, | \\_____/\\___/ \\___/ ");
    System.out.println("                           __/ |                    ");
    System.out.println("                          |___/   ");
    System.out.println("========================================================");  
  }
  /** Secara acak memilih salah satu Entrance, kemudian membuat sebuah.
    * jalur tour yang menampilkan serangkaian
    * experience yang akan dialami pengunjung  berdasarkan interaksi dengan
    * hewan-hewan yang dilalui tour tersebut. 
    */

  public void tourVirtualZoo() {
    Point[] entranceList = new Point[10];
    int banyakEntrance = 0;
    //Mendata Entrance yang ada
    for (int i = 0;i < height; i++) {
      for (int j = 0;j < width; j++) {
        if (virtualZoo.getZooElmt(i,j).getCellType().equals("Facility")) {
          if (virtualZoo.getZooElmt(i,j).getFacHabType().equals("Entrance")) {
            entranceList[banyakEntrance] = new Point(j,i);
            banyakEntrance++;
          }
        }
      }
    }
    //Inisialisasi variabel closed
    boolean[][] isClosed = new boolean [height][width];
    for (int i = 0;i < height; i++) {
      isClosed[i] = new boolean[width];
    }
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        isClosed[i][j] = false;
      }
    }
    //Secara random memilih entrance
    Random rand = new Random();
    int n = rand.nextInt(banyakEntrance);
    guestPos.setX(entranceList[n].getX());
    guestPos.setY(entranceList[n].getY());
    isClosed[guestPos.getY()][guestPos.getX()] = true;
    ScreenCleaner screenCleaner = new ScreenCleaner();
    screenCleaner.clearScreen();
    displayVirtualZoo();
    System.out.println("Tour akan dimulai. tekan enter untuk melanjutkan");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    boolean noway = false;
    boolean isExit = false;
    //Loop hingga mencapai exit atau tidak ada road lagi
    while (!noway && !isExit) {
      //pilih arah secara random
      Point dest = new Point(guestPos.getX(),guestPos.getY());
      int dir = rand.nextInt(4) + 1;
      int t = 0;
      boolean isroad = false;
      //cari arah yang valid
      while ((((dest.getY() < 0 || dest.getX() < 0 || dest.getY() >= height || dest.getX() 
                >= width) ? true : isClosed[dest.getY()][dest.getX()]) || !isroad) && t <= 4) {
        if (dir == 4) {
          dest.setY(guestPos.getY() + 1);
          dest.setX(guestPos.getX());
        } else 
          if (dir == 1) {
            dest.setY(guestPos.getY() - 1);
            dest.setX(guestPos.getX());
          } else 
            if (dir == 2) {
              dest.setY(guestPos.getY());
              dest.setX(guestPos.getX() - 1);
            } else 
              if (dir == 3) {
                dest.setY(guestPos.getY());
                dest.setX(guestPos.getX() + 1);
              }
        t++;
        dir = dir % 4 + 1;
        isroad = false;
        if ((dest.getY() < 0 || dest.getX() < 0 || dest.getY() >= height || dest.getX() >= width) 
            ? false : true) {
          if (virtualZoo.getZooElmt(dest.getY(),dest.getX()).getCellType() 
              .equals("Facility")) {
            if (virtualZoo.getZooElmt(dest.getY(),dest.getX()).getFacHabType() == "Road" 
                || virtualZoo.getZooElmt(dest.getY(),dest.getX()).getFacHabType() == "Exit") {
              isroad = true;
            }
          }
        }
      }
      if (t > 4) {
        noway = true;
      } else {
        if (virtualZoo.getZooElmt(guestPos.getY(),guestPos.getX()).getCellType() 
            == "Facility") {
          if (virtualZoo.getZooElmt(guestPos.getY(),guestPos.getX()).getFacHabType() 
              == "Exit") {
            isExit = true;
          }
        }
      }
      if (!noway && !isExit) {
        guestPos.setX(dest.getX());
        guestPos.setY(dest.getY());
        isClosed[guestPos.getY()][guestPos.getX()] = true;
        screenCleaner.clearScreen();
        moveAnimal();
        displayVirtualZoo();
        //Variabel pointer ke animal yang ada di cage yang bersisian di sebelah
        Animal[] nearbyAnimal = new Animal [MAXANIMAL];
        int nearAnimal = 0;
        //Variabel menyimpan data facility yang bersebelahan dengan posisi player
        Cell[] nearbyFacility = new Cell[4];
        int nearfac = 0;
        //Coba untuk setiap arah
        for (dir = 1; dir <= 4; dir++) {
          if (dir == 4) {
            dest.setY(guestPos.getY() + 1);
            dest.setX(guestPos.getX());
          } else 
            if (dir == 1) {
              dest.setY(guestPos.getY() - 1);
              dest.setX(guestPos.getX());
            } else 
              if (dir == 2) {
                dest.setY(guestPos.getY());
                dest.setX(guestPos.getX() - 1);
              } else 
                if (dir == 3) {
                  dest.setY(guestPos.getY());
                  dest.setX(guestPos.getX() + 1);
                }
          if (dest.getY() < 0 || dest.getX() < 0 || dest.getY() >= height 
              || dest.getX() >= width) {
            System.out.print("");
          } else
            if (virtualZoo.getZooElmt(dest.getY(),dest.getX()).getCellType()
                .equals("Facility")) {  
              String type = virtualZoo.getZooElmt(dest.getY(),dest.getX()).getFacHabType();
              if (!type.equals("Road") && !type.equals("Entrance") && !type.equals("Exit")) {
                //Cari apakah facility dengan jenis tersebut sudah ada
                int k = 0;
                boolean exist = false;
                while (k < nearfac && !exist) {
                  if (nearbyFacility[k].getFacHabType().equals(virtualZoo.getZooElmt(dest.getY(),
                      dest.getX()).getFacHabType())) {
                    exist = true;
                  }
                  k++;
                }
                if (!exist) {
                  nearbyFacility[nearfac] = virtualZoo.getZooElmt(dest.getY(),dest.getX());
                  nearfac++;  
                }
              }
            } else
              if (virtualZoo.getZooElmt(dest.getY(),dest.getX()).getCellType().equals("Habitat")) {
                //Cari apakah ada kandang di habitat  itu
                boolean found = false;
                int i = 0;
                while (i < MAXCAGE && !found) {
                  if (isAdaCage[i]) {  
                    int j = 0;
                    while (j < cageList[i].getCageSize() && !found) {
                      if (cageList[i].getAreaElmt(j).getX() == dest.getX() 
                          && cageList[i].getAreaElmt(j).getY() == dest.getY()) {
                        found = true;
                      } else {
                        j++;
                      }
                    }
                  }
                  if (!found) {
                    i++;
                  }
                }
                //Ada cage, data ada animal apa saja 
                if (found) {
                  //Telusuri animal
                  for (int j = 0; j < cageList[i].numberOfAnimal(); j++) {
                    String animalspeci = cageList[i].getAnimal(j).getSpeciesName();
                    //cari apakah spesies animal sudah ada di list
                    int k = 0;
                    boolean exist = false;
                    while (k < nearAnimal && !exist) {
                      if (nearbyAnimal[k].getSpeciesName().equals(animalspeci)) {
                        exist = true;
                      }
                      k++;
                    }  
                    //Tambahkan animal jika belum ada
                    if (!exist) {
                      nearbyAnimal [nearAnimal] = cageList[i].getAnimal(j);
                      nearAnimal++;
                    }                
                  }
                }
              }
        }
        int x = 0;
        //Tampilkan pilihan
        while (x != 1) {
          n = 1;
          System.out.println("Pilihan aksi: ");
          System.out.println(n + ". Lanjut Tour");
          n++;
          for (int i = 0; i < nearAnimal; i++) {
            System.out.println(n + ". Interaksi dengan " + nearbyAnimal[i].getSpeciesName());
            n++;
          }
          for (int i = 0; i < nearfac;i++) {
            System.out.println(n + ". Masuk ke " + nearbyFacility[i].getFacHabType());
            n++;
          }
          System.out.println("Masukkan pilihan: ");
          x = scanner.nextInt();
          while (x < 1 || x >= n) {
            System.out.print("Pilihan salah. Ulangi: ");
            x = scanner.nextInt();
          }
          if (x != 1) {  
            if (x <= nearAnimal + 1) {
              System.out.print(nearbyAnimal[x - 2].getSpeciesName() + ": ");
              nearbyAnimal[x - 2].interact();
              System.out.println();
              nearbyAnimal[x  - 2].deskripsi();
              System.out.println();
              System.out.println();
            } else {
              nearbyFacility[x - nearAnimal - 2].enter();
              System.out.println();
            }
          }
        }
      }
    }
    System.out.println("\nTour selesai.");
  }
  /** Mencetak seluruh hewan dalam map.
   */

  public void printAllAnimal() {
    int count = 0;
    for (int i = 0; i < MAXCAGE; i++) {
      if (isAdaCage[i]) {
        for (int j = 0; j < cageList[i].numberOfAnimal(); j++) {
          count++;
          System.out.println(count + "." + cageList[i].getAnimal(j).getSpeciesName());
        }
      }
    }
  }
}
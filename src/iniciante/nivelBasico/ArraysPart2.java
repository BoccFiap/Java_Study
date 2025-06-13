package iniciante.nivelBasico;

public class ArraysPart2 {
  public static void main(String[] args) {

    //     primeiro quadrado -> linha
    String[][] ninjasAndVillage = new String[3][3];
    //     segundo quadrado -> coluna

    ninjasAndVillage[0][0] = "konaha";
    ninjasAndVillage[0][1] = "Naruto Uzumaki";
    ninjasAndVillage[0][2] = "Sasuke Uchica";

    ninjasAndVillage[1][0] = "Nevoa";
    ninjasAndVillage[1][1] = "Zabuza";
    ninjasAndVillage[1][2] = "Haku";

    ninjasAndVillage[2][0] = "Deserto";
    ninjasAndVillage[2][1] = "Gaara";
    ninjasAndVillage[2][2] = "Temari";

    for (int i = 0; i < ninjasAndVillage.length; i++) { System.out.println("Aldeia: " + ninjasAndVillage[i][0]); for (int j = 1; j < ninjasAndVillage[i].length; j++) { System.out.println("Ninja: " + ninjasAndVillage[i][j]); } }





  }
}

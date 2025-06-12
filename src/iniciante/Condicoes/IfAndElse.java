package iniciante.Condicoes;

public class IfAndElse {
  public static void main(String[] args) {

    /*
      IF and ELSE - Condições
      IF
      Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
     */

    // Ninja Naruto
    String name = "Naruto Uzumaki";
    String rank;
    int age = 16;
    boolean hokage = false;
    short numberOfMissons = 21;


    // se (condição) {faça isso}
    if (numberOfMissons == 10 && age > 15){
      System.out.println(name+ " is ready to level up.");
      System.out.println(name+ " is now a Chunin Rank.");
    } else if (numberOfMissons >= 20){
      System.out.printf(name+ " is now a Jounin Rank.");
    }else{
      System.out.println(name+ " is not ready to level up");
      System.out.println(name+ " is not ready to level up; he has " +numberOfMissons+ " missions, and the minimum required is 10.");
    }
  }


}

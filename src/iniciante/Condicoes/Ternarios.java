package iniciante.Condicoes;

public class Ternarios {
  public static void main(String[] args) {

     /*
        Ternarios: sao maneiras de reduzir o codigo
        varivael = (condiçao) ? valorSerVerdadeiro : valorSeFalso;
     */

    short numberOfMissions = 1;
    String ninjasLevel = (numberOfMissions >= 10) ? "This ninja has more than 10 missions." : "This ninja has fewer than 10 missions.";
    System.out.println(ninjasLevel);



  }
}

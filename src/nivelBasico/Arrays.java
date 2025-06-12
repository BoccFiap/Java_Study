package nivelBasico;

public class Arrays {
  public static void main(String[] args) {

    String[] ninja = new String[4];

    // String inicializa como -> null
    ninja[0] = "Naruto Uzumaki";
    ninja[1] = "Sasuke Uchiha";
    ninja[2] = "Sakura Haruno";
    System.out.println(ninja[2]);

    // Int inicializa como -> 0
    int[] age = new int[2];
    age[0] = 15;
    System.out.println(age[1]);

    // Boolean inicializa como -> False
    boolean[] trueOrFalse = new boolean[2];
    System.out.println(trueOrFalse[0]);

    // Double inicializa como -> 0
    double[] doubles = new double[2];
    System.out.println(doubles[0]);
  }
}

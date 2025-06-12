package nivelBasico;

public class ArraysPart1 {
  public static void main(String[] args) {

    String[] ninja = new String[6];

    // String inicializa como -> null
    ninja[0] = "Naruto Uzumaki";
    ninja[1] = "Sasuke Uchiha";
    ninja[2] = "Sakura Haruno";
    ninja[3] = "Hinata Hyuga";
    ninja[4] = "Kakashi hateke";
    System.out.println(ninja[5]);

    // redeclarar ARRAY
    ninja = new String[7];
    ninja[0] = "Hashirama Senju";
    ninja[1] = "Tobirama Senju";
    ninja[2] = "Hiruzen Sarutobi ";
    ninja[3] = "Minato Namikaze";
    ninja[4] = "Tsunade";
    ninja[5] = "Kakashi Hatake";
    ninja[6] = "Naruto Uzumaki";

    // for para fazer um LOOP no array
    for (int i = 0; i < 7; i++) {
      System.out.println(ninja[i]);
    }


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

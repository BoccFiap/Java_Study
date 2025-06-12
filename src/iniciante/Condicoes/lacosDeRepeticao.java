package iniciante.Condicoes;

public class lacosDeRepeticao {
  public static void main(String[] args) {

    /*
        Laços de Repetição: Existem dois While e For
        WHILE =
        FOR =
     */

    // WHILE
    // while (condição) { tudo aqui vai acontecer}
    int numberOfClones = 0;
    int maximoNumberOfClones = 40;

    while( numberOfClones <= maximoNumberOfClones) {
      System.out.println("Naruto made a shadow clone. " + numberOfClones);
      numberOfClones++;
    }

    // FOR (int i = 0; i <= 'variavel'; i++)
    for (int i = 0; i <= maximoNumberOfClones; i++) {
      System.out.println("Naruto made a shadow clone. " +i);
    }

  }
}

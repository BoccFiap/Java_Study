package iniciante.TiposDeDados;

public class DadosNaoPrimitivos {
  public static void main(String[] args) {
    // tudo que esta dentro da main, ira rodar o codigo

    /*
        Dados nao primitivos = String, Array, Class, enum
        objetivo: Criar um ninja, e atribuir metodos a ele.
     */


    String name = "Naruto Uzumaki";
    String upperName = name.toUpperCase(); // transforma em CAPSLOCK
    System.out.println(upperName);
    System.out.println(name + "\n");

    String village = "ALDEIA DA FOLHA";
    String lowerVillage = village.toLowerCase(); // transforma em minusculo
    System.out.println(village);
    System.out.println(lowerVillage);

  }
}

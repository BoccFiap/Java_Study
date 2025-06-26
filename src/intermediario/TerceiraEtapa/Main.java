package intermediario.TerceiraEtapa;

public class Main {
  public static void main(String[] args) {

    Hokage Hashirama = new Hokage();
    Hashirama.nome = "Hashirama";

    Hokage Tobirama = new Hokage("Tobirama Senju", 56, true);
    System.out.println(Tobirama.nome);
    System.out.println(Tobirama.idade);
    if (Tobirama.vivoOuNao == true){
      System.out.println("vivo");
    } else{
      System.out.println("morto");
    }


  }
}

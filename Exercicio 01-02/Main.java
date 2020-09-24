import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    
    Scanner sc = new Scanner (System.in);

    Pedido c1 = new Pedido();

    System.out.println("Qual seu codigo?");
    String codigo = sc.nextLine();
    System.out.println("Qual seu nome?");
    String nome = sc.nextLine();
    System.out.println("Qual e a descricao do produto?");
    String descricao = sc.nextLine();
    System.out.println("Seu nome e: " + nome);
    System.out.println("Sua descrição é: " +descricao);
    System.out.println("Qual seu novo nome?:");
    String modificar = sc.nextLine();
    System.out.println("Seu novo nome e: " + modificar);
    System.out.println("");
    System.out.println("Qual sua nova descrição?:");
    String modificar2 = sc.nextLine();
    System.out.println("Sua nova descrição é: " + modificar2);
    System.out.println("");
    System.out.println("Seu antigo nome e:" + nome);
    System.out.println("Seu novo nome e: " + modificar);
    System.out.println("");
    System.out.println("Seu antigo nome e:" + descricao);
    System.out.println("Seu novo nome e: " + modificar2);
    


  }
}

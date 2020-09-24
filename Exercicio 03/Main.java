import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

  System.out.println("Qual seu codigo? ");
  int CodigoCliente = sc.nextInt();

  System.out.println("Qual seu nome? ");
  String NomeCliente = sc.nextLine();

    System.out.println("Qual nome e: " + NomeCliente);
    System.out.println("Seu codigo e: " + CodigoCliente);
  }

}
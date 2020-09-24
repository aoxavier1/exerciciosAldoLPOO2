import javax.swing.JOptionPane;
 
public class Main {   
   
    public static void main(String[] args)
    {
        String num1, num2, nome;
        int n1, n2, total = 0;
       
        nome = JOptionPane.showInputDialog("Qual seu nome? ");
        num1 = JOptionPane.showInputDialog("Que ano nos estamos ?");
        num2 = JOptionPane.showInputDialog("Qual ano voce nasceu ? ");
       
        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);
       
        total = n1 - n2;
       if (total>18){
         JOptionPane.showInputDialog(nome +" Voce pode tirar CNH " + "Idade: " + total);
       }else{
         JOptionPane.showInputDialog(nome +" Voce nao pode tirar CNH" + "Idade: " + total);
       }
       
    }
   
}


  
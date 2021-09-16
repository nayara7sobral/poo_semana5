import java.util.Scanner;
import javax.swing.JOptionPane;
public class TesteImpressora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        Impressora imp = new Impressora();
        String menu = "\n0-Sair\n1-Um float\n2-Dois floats\n3-Um float e uma String\n4-Uma String e um float\n5-Tres Strings\n6-Dois ints e uma string\n";
        int op = 1;
        
        do{
            System.out.println(menu);
            op = Integer.parseInt(JOptionPane.showInputDialog("Insira a opcao:"));
            switch (op){
                case 1:
                    System.out.println("Insira um float");
                    float f1 = Float.parseFloat(JOptionPane.showInputDialog("Insira um float"));
                    imp.exibir(f1);
                    break;
                case 2:
                    f1 = Float.parseFloat(JOptionPane.showInputDialog("Insira um float"));
                    float f2 = Float.parseFloat(JOptionPane.showInputDialog("Insira um float"));
                    imp.exibir(f1,f2);
                    break;
                case 3:
                    f1 = Float.parseFloat(JOptionPane.showInputDialog("Insira um float"));
                    String s1 = JOptionPane.showInputDialog("Insira uma string");
                    imp.exibir(f1,s1);
                    break;
                case 4:
                    s1 = JOptionPane.showInputDialog("Insira uma string");
                    f1 = Float.parseFloat(JOptionPane.showInputDialog("Insira um float"));
                    imp.exibir(s1,f1);
                    break;
                case 5:
                    s1 = JOptionPane.showInputDialog("Insira uma string");
                    String s2 = JOptionPane.showInputDialog("Insira uma string");
                    String s3 = JOptionPane.showInputDialog("Insira uma string");
                    imp.exibir(s1,s2,s3);
                    break;
                case 6:
                    int i1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um inteiro: "));
                    int i2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um inteiro: "));
                    s1 = JOptionPane.showInputDialog("Insira uma string");
                    imp.exibir(i1,i2,s1);
                    break;
                default:
                    System.out.println("Opcao invalida");
                    continue;
                case 0:
                    System.out.println("Ate logo");
                    return;  
            }
        }while(op != 0);
        leitor.close();
    
    }
}

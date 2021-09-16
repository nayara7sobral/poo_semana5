import javax.swing.JOptionPane;
public class TesteCalculadoraCientifica {
    public static void main(String[] args) {
        String menu = "\n0-Sair\n1-Raiz de double\n2-Raiz de int\n3-raiz de string\n4-Potencia de byte\n5-Potencia de string\n6-Potencia de int e double\n";
        CalculadoraCientifica calc = new CalculadoraCientifica();
        int op = 1;
        do{
            System.out.println(menu);
            op = Integer.parseInt(JOptionPane.showInputDialog("Insira a opcao:"));
            switch (op){
                case 1:
                    calc.raiz(Double.parseDouble(JOptionPane.showInputDialog("Insira um double")));
                    break;
                case 2:
                    calc.raiz(Integer.parseInt(JOptionPane.showInputDialog("Insira um int")));
                    break;
                case 3:
                    calc.raiz(JOptionPane.showInputDialog("Insira uma string"));
                    break;
                case 4:
                    calc.potencia(Byte.parseByte(JOptionPane.showInputDialog("Insira um byte")),Byte.parseByte(JOptionPane.showInputDialog("Insira um byte")));
                    break;
                case 5:
                    calc.potencia(JOptionPane.showInputDialog("Insira uma string"),JOptionPane.showInputDialog("Insira uma string"));
                    break;
                case 6:
                    calc.potencia(Integer.parseInt(JOptionPane.showInputDialog("Insira um inteiro: ")),Double.parseDouble(JOptionPane.showInputDialog("Insira um Double: ")));
                    break;
                default:
                    System.out.println("Opcao invalida");
                    continue;
                case 0:
                    System.out.println("Ate logo");
                    return;  
            }
        }while(op != 0);
    }
}

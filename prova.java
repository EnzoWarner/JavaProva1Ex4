import java.util.Locale;
import java.util.Scanner;

public class prova {
public static void main (String []args){
         Scanner sc = new Scanner (System.in);
                 Locale.setDefault(Locale.US);
                 System.out.println("Insira numero de carros vendido: ");
   double valor = Double.parseDouble(sc.nextLine()) ;
   System.out.println("Insira o valor total de vendas: ");
   double valor1 = Double.parseDouble(sc.nextLine()) ;
   System.out.println("Insira o salario fixo: ");
   double valor2 = Double.parseDouble(sc.nextLine()) ;
   double to = 0;
   to = valor2 * 0.5;
   System.out.println(" o numero de carros vendidos: " + valor + "o numero total de vendas: " + valor1 + "Salário recebido por carro vendido: " +to);
   sc.close();
}
}


package imc2;

import java.util.Scanner;


public class IMC2 {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println ("Informe o peso");
        double peso = leia.nextDouble();
        
        System.out.println ("Informe a altura");
        double altura = leia.nextDouble();
        
        double resultado = peso/(altura * altura);
        System.out.println(resultado);
        
        if (resultado < 18.5) {
    System.out.println("Abaixo do Peso"); 
    }  else if ((resultado >= 18.5) & (resultado <= 24.9)) {
            System.out.println("Peso Normal");        
    } else if ((resultado >= 25) & (resultado <= 29.9)) {
            System.out.println("Sobrepeso");
    } else if ((resultado >= 30) & (resultado <= 34.9)) {
            System.out.println("Obesidade grau 1");
    } else if ((resultado >= 35) & (resultado <= 39.9)) {
            System.out.println("Obesidade Grau 2");
    } else  {
            System.out.println("Obesidade Grau 3");                
    }
    }
    
}

package application;

import entities.Pessoa;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Quantos quilos você pesa? ");
      Double peso = sc.nextDouble();

      System.out.println("Qual a sua altura ? ");
      sc.nextLine();
      Double altura = sc.nextDouble();


      Double imc = peso/(Math.pow(altura, 2));

      Pessoa pessoa = new Pessoa(altura, peso, imc);
      System.out.printf("Seu IMC é de: %.2f 'kg/m2'. ", pessoa.getImc());

      if (imc < 17) {
          System.out.println("Muito abaixo do peso.Você está comendo?");
      }else if (imc < 18.49) {
          System.out.println("Um pouco abaixo do peso. Você deve comer mais carboidrato!" );
      } else if (imc < 25) {
          System.out.println("Tá de boa. Mantenha-se assim!");
      } else if (imc < 30) {
          System.out.println("Acima do peso. Pega leve na fast food!");
      }else if (imc < 35) {
          System.out.println("Opa ! Obesidade nível 1. Você está exagerando !");
      } else if (imc < 40) {
          System.out.println("Vixiii !! Obesidade nível 2. Melhor você procurar um(a) nutricionista");
      }else {
          System.out.println("Obesidade mórbida!! Já ouviu falar do Doutor Nowzaradan?");
      }


      sc.close();

    }
}

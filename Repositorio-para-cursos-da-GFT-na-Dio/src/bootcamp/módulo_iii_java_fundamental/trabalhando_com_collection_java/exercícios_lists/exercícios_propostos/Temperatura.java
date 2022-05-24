package bootcamp.módulo_iii_java_fundamental.trabalhando_com_collection_java.exercícios_lists.exercícios_propostos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Temperatura {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Double> temperatura = new ArrayList<>();

        // a cada loop o usuário têm q inserir a temperatura
        for (int i = 0; i < 6; i++) {
            System.out.println("Qual a temperatura: ");
            Double recebendoTemperatura = scan.nextDouble();
            temperatura.add(recebendoTemperatura);
        }
        scan.close();

        System.out.println(temperatura);

        Iterator<Double> iterator = temperatura.iterator();

        int contador = 0;
        Double somandoTemperaturas = 0.0;
        Double resultado = 0.0;

        do {
            iterator.hasNext();
            Double recebeTemperatura = iterator.next();
            somandoTemperaturas += recebeTemperatura;
            contador++;
        } while (contador < 6);

        resultado = somandoTemperaturas / 6;

        System.out.println("\nMédia semestral: " + resultado);

        // MOSTRAR AS TEMPERATURAS ACIMA DA MÉDIA
        Iterator<Double> iterator2 = temperatura.iterator();

        contador = 0;

        while (iterator2.hasNext()) {
            Double recebeTemperatura = iterator2.next();
            if (recebeTemperatura > resultado) {

                switch (contador) {
                    case (0):
                        System.out.println("1 - Janeiro: " + recebeTemperatura);
                        break;
                    case (1):
                        System.out.println("2 - Fevereiro: " + recebeTemperatura);
                        break;
                    case (2):
                        System.out.println("3 - Março: " + recebeTemperatura);
                        break;
                    case (3):
                        System.out.println("4 - Abril: " + recebeTemperatura);
                        break;
                    case (4):
                        System.out.println("5 - Maio: " + recebeTemperatura);
                        break;
                    case (5):
                        System.out.println("6 - Junho: " + recebeTemperatura);
                        break;
                    default:
                        System.out.println("Não houve temperaturas acima da média.");
                        break;
                }
            }
            contador++;
        }
    }
}

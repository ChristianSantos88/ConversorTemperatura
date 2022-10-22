import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        int quantidadeDeTemperaturas = 0;
        double somaTemperaturasOriginais = 0;
        double somaTemperaturasConvertidas = 0;
        double mediaTemperaturasOriginais = 0;
        double mediaTemperaturasConvertidas = 0;
        double celciusParaFahrenheit = 0;
        double celciusParaKelvin = 0;
        double fahrenheitParaCelcius = 0;
        double fahrenheitParaKelvin = 0;
        double kelvinParaCelcius = 0;
        double kelvinParaFahrenheit = 0;


        System.out.println("##########  CONVERSOR DE TEMPERATURAS ###########");
        System.out.print("Quantas temperaturas  você gostaria de converter? ");
        quantidadeDeTemperaturas = sc.nextInt();
        System.out.print("##################################################");

        int[] temperaturas = new int[quantidadeDeTemperaturas];

        System.out.println();



        System.out.println("Escolha a unidade de origem da temperatura: ");
        System.out.println("C - Celcius");
        System.out.println("F - Fahrenheit");
        System.out.println("K - Kelvin");
        System.out.print("Temperatura de origem: ");
        String temperaturaDeOrigem = sc.next();
        System.out.print("##################################################");

        System.out.println();

        System.out.println("Para qual unidade de temperatura você gostaria de converter a unidade anterior? ");
        String temperaturaDeConversao = "";

        if (Objects.equals(temperaturaDeOrigem, "C")) {
            System.out.println("F - Fahrenheit");
            System.out.println("K - Kelvin");
            System.out.print("Temperatura de conversão: ");
            temperaturaDeConversao = sc.next();
        } else if (Objects.equals(temperaturaDeOrigem, "F")) {
            System.out.println("C - Celcius");
            System.out.println("K - Kelvin");
            System.out.print("Temperatura de conversão: ");
            temperaturaDeConversao = sc.next();
        } else if (Objects.equals(temperaturaDeOrigem, "K")) {
            System.out.println("C - Celcius");
            System.out.println("F - Fahrenheit");
            System.out.print("Temperatura de conversão: ");
            temperaturaDeConversao = sc.next();
        }
        System.out.print("##################################################");

        System.out.println();

        for(int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite o " + contador + "º valor a ser convertido: ");
            temperaturas[i] = sc.nextInt();
            somaTemperaturasOriginais += temperaturas[i];
            contador++;
        }

        mediaTemperaturasOriginais = somaTemperaturasOriginais / quantidadeDeTemperaturas;

        //Convertendo Celcius para...
        if (Objects.equals(temperaturaDeOrigem, "C")) {
            if (Objects.equals(temperaturaDeConversao, "F")) {
                for (int temperatura : temperaturas) {
                    celciusParaFahrenheit = temperatura * 1.8 + 32;
                    somaTemperaturasConvertidas += celciusParaFahrenheit;
                    System.out.println(temperatura + "ºC é igual a " + celciusParaFahrenheit + "F.");
                }
            } else if (Objects.equals(temperaturaDeConversao, "K")) {
                for (int temperatura : temperaturas) {
                    celciusParaKelvin = temperatura + 273;
                    somaTemperaturasConvertidas += celciusParaKelvin;
                    System.out.println(temperatura + "ºC é igual a " + celciusParaKelvin + "K.");
                }
            }

        }

        //Convertendo Fahrenheit para...
        if (Objects.equals(temperaturaDeOrigem, "F")) {
            if (Objects.equals(temperaturaDeConversao, "C")) {
                for(int temperatura : temperaturas) {
                    fahrenheitParaCelcius = (temperatura - 32) / 1.8 ;
                    somaTemperaturasConvertidas += fahrenheitParaCelcius;
                    System.out.println(temperatura + "F é igual a " + fahrenheitParaCelcius + "ºC.");
                }
            } else if (Objects.equals(temperaturaDeConversao, "K")) {
                for(int temperatura : temperaturas) {
                    fahrenheitParaKelvin = ((temperatura - 32) * 5/9) + 273;
                    somaTemperaturasConvertidas += fahrenheitParaKelvin;
                    System.out.println(temperatura + "F é igual a " + fahrenheitParaKelvin + "K.");
                }
            }
        }

        //Convertendo Kelvin para...
        if (Objects.equals(temperaturaDeOrigem, "K")) {
            if (Objects.equals(temperaturaDeConversao, "C")) {
                for(int temperatura : temperaturas) {
                    kelvinParaCelcius = temperatura - 273;
                    somaTemperaturasConvertidas += kelvinParaCelcius;
                    System.out.println(temperatura + "K é igual a " + kelvinParaCelcius + "ºC.");
                }
            } else if (Objects.equals(temperaturaDeConversao, "F")) {
                for(int temperatura : temperaturas) {
                    kelvinParaFahrenheit = (temperatura - 273) * 1.8 + 32;
                    somaTemperaturasConvertidas += kelvinParaFahrenheit;
                    System.out.println(temperatura + "K é igual a " + kelvinParaFahrenheit + "F.");
                }
            }
        }

        mediaTemperaturasConvertidas = somaTemperaturasConvertidas / quantidadeDeTemperaturas;

        System.out.println("Média das temperaturas originais: " + mediaTemperaturasOriginais);
        System.out.println("Média das temperaturas convertidas: " + mediaTemperaturasConvertidas);

    }
}
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Consulta consulta = new Consulta();
        int opcion;
        double cantidadConvertir;

        do {
            String texto = """
                    ************************************
                    Sea bienvenido(a) al Conversor de Moneda 

                    1) Dólar => Peso Argentino
                    2) Peso argentino => Dólar
                    3) Dólar => Real brasileño
                    4) Real brasileño => Dólar
                    5) Dólar = Peso colombiano
                    6) Peso colombiano => Dólar
                    7) salir

                    Elija una opcion válida:
                    ************************************
                    """;
            System.out.println(texto);
            opcion = lectura.nextInt();

            System.out.println("Ingrese el valor que desee convertir: ");
            cantidadConvertir = lectura.nextDouble();

            switch (opcion) {
                case 1:
                try{
                    Moneda resultado = consulta.buscaMoneda("USD");
                    System.out.println(resultado.formatoConversion(cantidadConvertir, "ARS")); 
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                    break;
                case 2:
                try{
                    Moneda resultado = consulta.buscaMoneda("ARS");
                    System.out.println(resultado.formatoConversion(cantidadConvertir, "USD")); 
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                    break;
                case 3:
                try{
                    Moneda resultado = consulta.buscaMoneda("USD");
                    System.out.println(resultado.formatoConversion(cantidadConvertir, "BRL")); 
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                    break;
                case 4:
                try{
                    Moneda resultado = consulta.buscaMoneda("BRL");
                    System.out.println(resultado.formatoConversion(cantidadConvertir, "USD")); 
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                    break;
                case 5:
                try{
                    Moneda resultado = consulta.buscaMoneda("USD");
                    System.out.println(resultado.formatoConversion(cantidadConvertir, "COP")); 
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                    break;
                case 6:
                try{
                    Moneda resultado = consulta.buscaMoneda("COP");
                    System.out.println(resultado.formatoConversion(cantidadConvertir, "USD")); 
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                    break;
                case 7:
                try{
                    Moneda resultado = consulta.buscaMoneda("USD");
                    System.out.println(resultado.formatoConversion(cantidadConvertir, "ARS")); 
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                    break;
            }

        } while (opcion != 7 );
        
        lectura.close();
    }
}

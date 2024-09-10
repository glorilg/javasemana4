package com.example;

public class Main {
    public static void main(String[] args) {
        

        //primer punto
        import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese el valor total de la cuenta (incluyendo el IVA:)")
        double valorCuenta = scanner.nextDouble();

        System.out.println("ingrese el porcentaje de propina que desea dejar: ");
        double porcentajePropina = scanner.nextDouble();
        double valorPropina = valorCuenta * (porcentajePropina / 100);
        double valorTotal = valorCuenta + valorPropina;
        
        System.out.println("-----------factura-----------");
        System.out.printf("Valor de la cuenta: $%.2f%n", valorCuenta);
        System.out.printf("Porcentaje de propina: %.2f%%%n", porcentajePropina);
        System.out.printf("Valor de la propina: $%.2f%n", valorPropina);
        System.out.printf("Valor total a pagar: $%.2f%n", valorTotal);
        
        //segundo punto

        Scanner scanner2 = new Scanner(System.in);
        
        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();
      
        System.out.print("Ingrese el tiempo de espera en tráfico en minutos: ");
        int tiempoEspera = scanner.nextInt();
        
        final double tarifaBase = 4000.00;
        final double valorKilometro = 900.00;
        final double valorMinuto = 150.00;
        
        
        double costoPorDistancia = distancia * valorKilometro;
        double costoPorTiempoEspera = tiempoEspera * valorMinuto;
        double precioTotal = tarifaBase + costoPorDistancia + costoPorTiempoEspera;
        
        System.out.println();
        System.out.printf("Precio del viaje: $%.2f%n", precioTotal)

        //tercer punto

        Scanner scanner3 = new Scanner(System.in);

        String mensajeCodificado = "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0";
        
        // Reemplazar números por letras
        String mensajeDecodificado = mensajeCodificado
            .replace("0", "o")  // Reemplazar "0" por "o"
            .replace("3", "e")  // Reemplazar "3" por "e"
            .replace("4", "a"); // Reemplazar "4" por "a"
        
        // Eliminar espacios en blanco adicionales
        mensajeDecodificado = mensajeDecodificado
            .trim()             // Eliminar espacios al principio y al final
            .replaceAll("\\s+", " "); // Reemplazar múltiples espacios por uno solo
        
        // Convertir a mayúsculas
        mensajeDecodificado = mensajeDecodificado.toUpperCase();
        
        // Imprimir el mensaje decodificado
        System.out.println("Mensaje decodificado: " + mensajeDecodificado);

        scanner.close();
        scanner2.close();
        scanner3.close();


          



    }
}
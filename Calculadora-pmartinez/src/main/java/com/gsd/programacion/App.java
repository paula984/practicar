package com.gsd.programacion;
//quiero aprobar
public class App {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Tienen que ser 2 argumentos, la IP y la máscara");
            return;
        }

        String argumento1 = args[0];  
        String mascara = args[1];     
        int masc;

        String[] octetos = argumento1.split("\\.");
        if (octetos.length != 4) {
            System.out.println(argumento1 + " no tiene 4 numeros");
            return;
        }

        try {
            masc = Integer.parseInt(mascara);
        } catch (Exception e) {
            System.out.println("Error, Tienes que poner solo la mascara");
            return;
        }

        if (!Correcto.ip(argumento1)) {
            System.out.println("La ip no esta bien");
            return;
        }

        if (!Correcto.mascara(masc)) {
            System.out.println("La mascara no esta bien");
            return;
        }

        System.out.println(argumento1 + " " + masc);
        System.out.println(argumento1 + "/" + masc);
        System.out.println("Clase: " + Tipo.clase(argumento1));
        
        

        if (Tipo.Subnetting(argumento1, masc)) {
            System.out.println("Subnetting: true");
        } else if (Tipo.Supernetting(argumento1, masc)) {
            System.out.println("Supernetting: true");
        } else {
            System.out.println("Subnetting: false");
        }
    }
}


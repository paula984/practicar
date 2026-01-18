package com.gsd.programacion;

public class Correcto {

    public static boolean ip(String ip) {
        try {
            String[] p = ip.split("\\.");
            
            if (p.length != 4) {
            	
            	return false;
            }
         
            int n1 = Integer.parseInt(p[0]);
            int n2 = Integer.parseInt(p[1]);
            int n3 = Integer.parseInt(p[2]);
            int n4 = Integer.parseInt(p[3]);

            if (n1 == 0 || n1 == 255) {
                return false;
            }
            if (n1 < 0) {
                return false;
            }
            if (n1 > 255) {
                return false;
            }
            if (n2 < 0) {
                return false;
            }
            if (n2 > 255) {
                return false;
            }
            if (n3 < 0) {
                return false;
            }
            if (n3 > 255) {
                return false;
            }
            if (n4 < 0) {
                return false;
            }
            if (n4 > 255) {
                return false;
            }


            return true;
            
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean mascara(int masc) {
        if (masc >= 1 && masc <= 32) {
            return true;
        } else {
            return false;
        }
    }
}

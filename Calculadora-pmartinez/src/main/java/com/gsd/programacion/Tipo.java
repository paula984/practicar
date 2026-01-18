package com.gsd.programacion;

public class Tipo {

    public static String clase(String ip) {
    	String[] tipo = ip.split("\\.");
        int n1 = Integer.parseInt(tipo[0]);
        
        if (n1 >= 1 && n1 <= 127) {
            return "A";
        } 
        else if (n1 >= 128 && n1 <= 191) {
        	return "B";
        }
        else if (n1 >= 192 && n1 <= 223) {
        	return "C";
        }
        else return "OTRA";
    }

    public static boolean Subnetting(String ip, int masc) {
        String[] tipo = ip.split("\\.");
        int n1 = Integer.parseInt(tipo[0]);

        if (n1 >= 1 && n1 <= 127) {  
            if (masc > 8) {
                return true;
            } else {
                return false;
            }
        } else if (n1 >= 128 && n1 <= 191) {  
            if (masc > 16) {
                return true;
            } else {
                return false;
            }
        } else if (n1 >= 192 && n1 <= 223) {  
            if (masc > 24) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean Supernetting(String ip, int masc) {
        String[] tipo = ip.split("\\.");
        int n1 = Integer.parseInt(tipo[0]);

        if (n1 >= 1 && n1 <= 127) {  
            if (masc < 8) {
                return true;
            } else {
                return false;
            }
        } else if (n1 >= 128 && n1 <= 191) {  
            if (masc < 16) {
                return true;
            } else {
                return false;
            }
        } else if (n1 >= 192 && n1 <= 223) {  
            if (masc < 24) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    }


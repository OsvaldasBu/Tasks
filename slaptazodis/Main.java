package slaptazodis;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String slaptazodis = generuotiSlaptazodi(20,true,true,true);
        System.out.println("Slaptaodis = " + slaptazodis);

    }

    public static String generuotiSlaptazodi(
            int ilgis,
            boolean skaiciai,
            boolean simboliai,
            boolean raides
    ) {
        String slaptazodis = "";
        String galimiSimboliai = "";

        if (skaiciai) {
            galimiSimboliai = galimiSimboliai + "0123456789";
        }
        if (simboliai) {
            galimiSimboliai = galimiSimboliai + "!@#$%^^&*(){}[]';/.,<>-*/+";
        }
        if (raides) {
            galimiSimboliai = galimiSimboliai + "qwerty";
        }
        Random rand = new Random();
        for ( int i = 0; i <ilgis; i++) {
            int atsitiktinisIndeksas = rand.nextInt(galimiSimboliai.length());
            String atsitiktinisSimbolis = String.valueOf(galimiSimboliai.charAt(atsitiktinisIndeksas));
           slaptazodis = slaptazodis + atsitiktinisSimbolis;
        }
        return slaptazodis;
    }
}

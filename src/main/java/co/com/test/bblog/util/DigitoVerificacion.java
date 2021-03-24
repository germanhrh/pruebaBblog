package co.com.test.bblog.util;

public class DigitoVerificacion {

    public static CharSequence ObtenerDigitoVerificacion(String Nit) {
        int[] secu = new int[15];
        String miTemp = "";
        String NITs = "";
        int miContador = 0;
        int miResiduo = 0;
        int miChequeo = 0;

        secu[0] = 3;
        secu[1] = 7;
        secu[2] = 13;
        secu[3] = 17;
        secu[4] = 19;
        secu[5] = 23;
        secu[6] = 29;
        secu[7] = 37;
        secu[8] = 41;
        secu[9] = 43;
        secu[10] = 47;
        secu[11] = 53;
        secu[12] = 59;
        secu[13] = 67;
        secu[14] = 71;

        System.out.println("NIT: ");
        NITs = Nit;//String.valueOf(escaner.nextInt());

        for (miContador = 0; miContador < NITs.length(); miContador++) {
            miTemp = NITs.substring(miContador, (miContador + 1));
            miChequeo = miChequeo + Integer.parseInt(miTemp) * secu[(NITs.length() - 1) - miContador];
        }
        miResiduo = miChequeo % 11;
        if (miResiduo > 1) {
            miResiduo = 11 - miResiduo;
            System.out.println("DV: " + miResiduo);
        } else {
            System.out.println("DV: " + miResiduo);
        }

        return String.valueOf(miResiduo);
    }
}



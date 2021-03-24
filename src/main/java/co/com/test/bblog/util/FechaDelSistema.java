package co.com.test.bblog.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaDelSistema {

    public static String ObtenerFechaDelSistema() {

        Date objDate = new Date();
        String strDateFormat = "dd/MM/yyyy";
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
        String Fecha = objSDF.format(objDate);

        return Fecha;
    }

    public static String ObtenerFechaDelSistema(String formato) {

        Date objDate = new Date();
        String strDateFormat = formato;
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
        String Fecha = objSDF.format(objDate);

        return Fecha;
    }

}

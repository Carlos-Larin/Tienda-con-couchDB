package com.ugb.controlesbasicos;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Base64;

public class utilidades {
    static String urlConsulta = "http://192.168.1.19:5984/productos/_design/productos/_view/productos";
    static String urlMto = "http://192.168.1.19:5984/productos";
    static String user = "CarlosAristides";
    static String passwd = "CARTOS12A?";
    static String credencialesCodificadas = Base64.getEncoder().encodeToString((user +":"+ passwd).getBytes());
    public String generarIdUnico(){
        return java.util.UUID.randomUUID().toString();
    }
}

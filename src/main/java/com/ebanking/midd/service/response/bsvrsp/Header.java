package com.ebanking.midd.service.response.bsvrsp;

public class Header {
    private String nombre;
    private String fecha;
    private String hora;
    private String resultado;

    public Header(String nombre, String fecha, String hora, String resultado) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.resultado = resultado;
    }

    public Header() {
        this("","","","");
    }
}

package com.ebanking.midd.service.request;

public class Data {
    private String numclie;
    private String funcion;
    private String nropaq;

    public Data(String numclie, String funcion, String nropaq) {
        this.numclie = numclie;
        this.funcion = funcion;
        this.nropaq = nropaq;
    }

    public Data() {
        this("","","");
    }

    public String getNumclie() {
        return numclie;
    }

    public void setNumclie(String numclie) {
        this.numclie = numclie;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getNropaq() {
        return nropaq;
    }

    public void setNropaq(String nropaq) {
        this.nropaq = nropaq;
    }
}

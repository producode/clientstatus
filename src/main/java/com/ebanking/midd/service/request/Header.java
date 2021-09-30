package com.ebanking.midd.service.request;

public class Header {
    private String usuario;
    private String password;
    private String canal;
    private String requerimiento;

    public Header(String usuario, String password, String canal, String requerimiento) {
        this.usuario = usuario;
        this.password = password;
        this.canal = canal;
        this.requerimiento = requerimiento;
    }

    public Header() {
        this("","","","");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(String requerimiento) {
        this.requerimiento = requerimiento;
    }
}

package com.ebanking.midd.service.response.bsvrsp;

public class Row {
    private String producto;
    private String prod_desc;
    private String estado_desc;
    private String numero;
    private String motivo_rechazo;

    public Row(String producto, String prod_desc, String estado_desc, String numero, String motivo_rechazo) {
        this.producto = producto;
        this.prod_desc = prod_desc;
        this.estado_desc = estado_desc;
        this.numero = numero;
        this.motivo_rechazo = motivo_rechazo;
    }

    public Row() {
        this("","","","","");
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getProd_desc() {
        return prod_desc;
    }

    public void setProd_desc(String prod_desc) {
        this.prod_desc = prod_desc;
    }

    public String getEstado_desc() {
        return estado_desc;
    }

    public void setEstado_desc(String estado_desc) {
        this.estado_desc = estado_desc;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMotivo_rechazo() {
        return motivo_rechazo;
    }

    public void setMotivo_rechazo(String motivo_rechazo) {
        this.motivo_rechazo = motivo_rechazo;
    }
}

package com.ebanking.midd.service.response.bsvrsp;

public class Data {
    private String centro;
    private String numclie;
    private String tipodoc;
    private String orgbkb;
    private String segmen;
    private String nomape;
    private String paq;
    private String nropaq;
    private String estado;
    private String prodcom;
    private String codcamp;
    private String codvend;
    private String canal;
    private String fecalta;
    private String product;
    private String rechazo;
    private String numprod;
    private String numtram;
    private int limvisa;
    private int limmast;
    private int limcc;
    private int limpres;
    private float perboni;
    private int bonif;
    private String nrocar;
    private String nrocomi;
    private General general;

    public Data(String centro, String numclie, String tipodoc, String orgbkb, String segmen, String nomape, String paq, String nropaq, String estado, String prodcom, String codcamp, String codvend, String canal, String fecalta, String product, String rechazo, String numprod, String numtram, int limvisa, int limmast, int limcc, int limpres, float perboni, int bonif, String nrocar, String nrocomi, General general) {
        this.centro = centro;
        this.numclie = numclie;
        this.tipodoc = tipodoc;
        this.orgbkb = orgbkb;
        this.segmen = segmen;
        this.nomape = nomape;
        this.paq = paq;
        this.nropaq = nropaq;
        this.estado = estado;
        this.prodcom = prodcom;
        this.codcamp = codcamp;
        this.codvend = codvend;
        this.canal = canal;
        this.fecalta = fecalta;
        this.product = product;
        this.rechazo = rechazo;
        this.numprod = numprod;
        this.numtram = numtram;
        this.limvisa = limvisa;
        this.limmast = limmast;
        this.limcc = limcc;
        this.limpres = limpres;
        this.perboni = perboni;
        this.bonif = bonif;
        this.nrocar = nrocar;
        this.nrocomi = nrocomi;
        this.general = general;
    }

    public Data() {
        this("","","","","","","","","","","","","","","","","","",0,0,0,0,0,0,"","", new General());
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getNumclie() {
        return numclie;
    }

    public void setNumclie(String numclie) {
        this.numclie = numclie;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getOrgbkb() {
        return orgbkb;
    }

    public void setOrgbkb(String orgbkb) {
        this.orgbkb = orgbkb;
    }

    public String getSegmen() {
        return segmen;
    }

    public void setSegmen(String segmen) {
        this.segmen = segmen;
    }

    public String getNomape() {
        return nomape;
    }

    public void setNomape(String nomape) {
        this.nomape = nomape;
    }

    public String getPaq() {
        return paq;
    }

    public void setPaq(String paq) {
        this.paq = paq;
    }

    public String getNropaq() {
        return nropaq;
    }

    public void setNropaq(String nropaq) {
        this.nropaq = nropaq;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getProdcom() {
        return prodcom;
    }

    public void setProdcom(String prodcom) {
        this.prodcom = prodcom;
    }

    public String getCodcamp() {
        return codcamp;
    }

    public void setCodcamp(String codcamp) {
        this.codcamp = codcamp;
    }

    public String getCodvend() {
        return codvend;
    }

    public void setCodvend(String codvend) {
        this.codvend = codvend;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getFecalta() {
        return fecalta;
    }

    public void setFecalta(String fecalta) {
        this.fecalta = fecalta;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getRechazo() {
        return rechazo;
    }

    public void setRechazo(String rechazo) {
        this.rechazo = rechazo;
    }

    public String getNumprod() {
        return numprod;
    }

    public void setNumprod(String numprod) {
        this.numprod = numprod;
    }

    public String getNumtram() {
        return numtram;
    }

    public void setNumtram(String numtram) {
        this.numtram = numtram;
    }

    public int getLimvisa() {
        return limvisa;
    }

    public void setLimvisa(int limvisa) {
        this.limvisa = limvisa;
    }

    public int getLimmast() {
        return limmast;
    }

    public void setLimmast(int limmast) {
        this.limmast = limmast;
    }

    public int getLimcc() {
        return limcc;
    }

    public void setLimcc(int limcc) {
        this.limcc = limcc;
    }

    public int getLimpres() {
        return limpres;
    }

    public void setLimpres(int limpres) {
        this.limpres = limpres;
    }

    public float getPerboni() {
        return perboni;
    }

    public void setPerboni(float perboni) {
        this.perboni = perboni;
    }

    public int getBonif() {
        return bonif;
    }

    public void setBonif(int bonif) {
        this.bonif = bonif;
    }

    public String getNrocar() {
        return nrocar;
    }

    public void setNrocar(String nrocar) {
        this.nrocar = nrocar;
    }

    public String getNrocomi() {
        return nrocomi;
    }

    public void setNrocomi(String nrocomi) {
        this.nrocomi = nrocomi;
    }

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }
}

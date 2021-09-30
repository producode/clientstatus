package com.ebanking.midd.service.request;

public class Bsvreq {
    private Header header;
    private Data data;

    public Bsvreq(Header header, Data data) {
        this.header = header;
        this.data = data;
    }

    public Bsvreq() {
        this(new Header(), new Data());
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}

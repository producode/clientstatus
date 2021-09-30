package com.ebanking.midd.service.response.bsvrsp;

public class Bsvrsp {
    private Header header;
    private Data data;

    public Bsvrsp(Header header, Data data) {
        this.header = header;
        this.data = data;
    }

    public Bsvrsp() {
        this(new Header(), new Data());
    }
}

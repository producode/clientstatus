package com.ebanking.midd.service.response.bsvrsp;

public class ResponseDetallePaqueteCliente {
    private Header header;
    private Data data;

    public ResponseDetallePaqueteCliente(Header header, Data data) {
        this.header = header;
        this.data = data;
    }

    public ResponseDetallePaqueteCliente() {
        this(new Header(), new Data());
    }
}

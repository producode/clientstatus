package com.ebanking.midd.service;

import com.ebanking.midd.service.detalle_paquete_cliente.PQ06;
import com.ebanking.midd.service.response.bsvrsp.Header;

public class DetallePaqueteCliente {
    public static ResponseDetallePaqueteCliente DetallePaqueteCliente(RequestDetallePaqueteCliente request){
        ResponseDetallePaqueteCliente response = new ResponseDetallePaqueteCliente();

        Header opHeader = new Header();
        PQ06.execute(opHeader, request, response);

        return response;
    }
}

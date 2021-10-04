package com.ebanking.midd.service;

import com.ebanking.midd.service.detalle_paquete_cliente.PQ06;
import com.ebanking.midd.service.request.Header;
import com.ebanking.midd.service.request.RequestDetallePaqueteCliente;
import com.ebanking.midd.service.response.bsvrsp.ResponseDetallePaqueteCliente;

public class DetallePaqueteCliente {
    public static ResponseDetallePaqueteCliente DetallePaqueteCliente(RequestDetallePaqueteCliente request){
        ResponseDetallePaqueteCliente response = new ResponseDetallePaqueteCliente();

        Header opHeader = new Header();
        PQ06.execute(opHeader, request, response);

        return response;
    }
}

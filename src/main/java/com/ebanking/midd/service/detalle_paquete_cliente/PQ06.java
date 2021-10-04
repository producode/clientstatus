package com.ebanking.midd.service.detalle_paquete_cliente;

import com.ebanking.midd.service.request.Bsvreq;
import com.ebanking.midd.service.request.Header;
import com.ebanking.midd.service.response.bsvrsp.Bsvrsp;

public class PQ06 {
    public static Bsvrsp execute(Header reqHeader, Bsvreq resquest, Bsvrsp response){
        resquest.setHeader(reqHeader);

        EJ01request tnRequest = new Ej01Request();
        //Settear valores de tnRquest

        Bsvrsp tnResponse = AssetsLiabitiesClient.eJ01(tnRequest);

        MiddServicesUtil.initResponseHeader(tnResponse, response);

        Ej01Output tnResponseData = tnResponse.getData();
        if(!tnResponseData.isNull()){
            response.setProducto(tnResponseData.getProducto());
            response.setProd_desc(tnResponseData.getProd_desc());
            response.setEstado_desc(tnResponseData.getEstado_desc());
            response.setNumero(tnResponseData.getNumero());
            response.setMotivo_rechazo(tnResponseData.getMotivo_rechazo());
        }

        return response;
    }

}

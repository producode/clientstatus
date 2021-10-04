package com.ebanking.midd.service.detalle_paquete_cliente;

import com.ebanking.midd.service.request.RequestDetallePaqueteCliente;
import com.ebanking.midd.service.request.Header;
import com.ebanking.midd.service.response.bsvrsp.ResponseDetallePaqueteCliente;

public class PQ06 {
    public static ResponseDetallePaqueteCliente execute(Header reqHeader, RequestDetallePaqueteCliente resquest, ResponseDetallePaqueteCliente response){
        resquest.setHeader(reqHeader);

        EJ01request tnRequest = new Ej01Request();
        //Settear valores de tnRquest

        ResponseDetallePaqueteCliente tnResponse = AssetsLiabitiesClient.eJ01(tnRequest);

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

    private EJ01request asignarEntidates(RequestDetallePaqueteCliente request){
        EJ01request tnRequest = new Ej01Request();

        tnRequest.setFuncion(request.getData().getFuncion());
        tnRequest.setCentro();
        tnRequest.setNumclie(request.getData().getNumclie());
        tnRequest.setTipoDoc();
        tnRequest.setNroDoc();
        tnRequest.setOrgbkb();
        tnRequest.setSegmen();
        tnRequest.setNomape();
        tnRequest.setPaq();
        tnRequest.setNropaq(request.getData().getNropaq());
        tnRequest.setEstado();
        tnRequest.setProdcom();
        tnRequest.setCodcamp();
        tnRequest.setCodvend();
        tnRequest.setCanal();
        tnRequest.setFecalta();
        tnRequest.setProduct();
        tnRequest.setRechazo();
        tnRequest.setNumprod();
        tnRequest.setNrotram();
        tnRequest.setLimvisa();
        tnRequest.setLimmast();
        tnRequest.setLimcc();
        tnRequest.setLimpres();
        tnRequest.setPerboni();
        tnRequest.setBonif();
        tnRequest.setNrocar();
        tnRequest.setNrocomi();

    }

}

package com.nttd.ms.pago.credito.entity;

import io.quarkus.mongodb.panache.common.MongoEntity;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.time.LocalDate;

@MongoEntity(collection = "credito_pago")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagoCredito {

    private ObjectId id;

    //1:Pago de crédito
    //2:Pago de tarjeta de crédito
    private String tipoPago;

    private String numeroCuenta;

    private Integer cantidadCuotas;

    private Double monto;

    private LocalDate fecha;

    private String descripcion;

}

package com.nttd.ms.pago.credito.repository;

import com.nttd.ms.pago.credito.entity.PagoCredito;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoCreditoRepository implements PanacheMongoRepository<PagoCredito> {
}

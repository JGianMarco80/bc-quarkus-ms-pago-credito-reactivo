package com.nttd.ms.pago.credito.service.impl;

import com.nttd.ms.pago.credito.entity.PagoCredito;
import com.nttd.ms.pago.credito.repository.PagoCreditoRepository;
import com.nttd.ms.pago.credito.service.PagoCreditoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class PagoCreditoServiceImpl implements PagoCreditoService {

    @Inject
    PagoCreditoRepository repository;

    @Override
    public List<PagoCredito> findByNumeroCuenta(String numeroCuenta, String tipoPago) {
        List<PagoCredito> pagoCreditos = repository.listAll();

        List<PagoCredito> pgObtenidos = new ArrayList<>();

        for (PagoCredito pg: pagoCreditos) {
            if(pg.getTipoPago().equals(tipoPago)){
                if (pg.getNumeroCuenta().equals(numeroCuenta)) {
                    pgObtenidos.add(pg);
                }
            }
        }

        return pgObtenidos;
    }
}

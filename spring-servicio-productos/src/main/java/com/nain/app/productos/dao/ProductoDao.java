package com.nain.app.productos.dao;

import org.springframework.data.repository.CrudRepository;

import nain.app.commons.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}

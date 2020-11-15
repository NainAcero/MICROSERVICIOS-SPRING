package com.nain.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nain.app.productos.dao.ProductoDao;

import nain.app.commons.models.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private ProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = true) // Solo lectura
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productoDao.findById(id).orElse(null); // Si no encuentra return Null
	}

	@Override
	@Transactional
	public Producto save(Producto producto) {

		return productoDao.save(producto);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		
		productoDao.deleteById(id);
	}

}

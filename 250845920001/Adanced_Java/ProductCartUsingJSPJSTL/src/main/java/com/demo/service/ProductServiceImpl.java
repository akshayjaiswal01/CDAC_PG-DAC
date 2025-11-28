package com.demo.service;

import java.util.List;

import com.demo.beans.Product;
import com.demo.dao.ProductDaoI;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductServiceI 
{
	
	ProductDaoI pdao;
	
	public ProductServiceImpl()
	{
		pdao = new ProductDaoImpl();
	}
	
	@Override
	public List<Product> getAllProducts() 
	{
		return pdao.getAllProducts();
	}

}

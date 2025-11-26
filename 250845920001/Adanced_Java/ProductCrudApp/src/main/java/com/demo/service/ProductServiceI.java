package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductServiceI {

	List<Integer> getAllCategory();

	List<Product> getByCid(int cid);

}

package com.amol.exercise.sales.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.amol.exercise.sales.model.Product;

public class ProductMapper implements RowMapper<Product> {
	   public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		      Product Product = new Product();
		      Product.setId(rs.getInt("ProductID"));
		      Product.setName(rs.getString("ProductName"));
		      return Product;
		   }
		}

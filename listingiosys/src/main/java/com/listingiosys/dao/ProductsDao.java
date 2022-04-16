package com.listingiosys.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.listingiosys.beans.Products;

public class ProductsDao {
	  
	JdbcTemplate template;    
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	
	// Inserting new record to products table
	public int save(Products p){    
	    String sql="insert into PRODUCT_TABLE(PRODUCT_NAME,PRODUCT_QTY,PRODUCT_PRICE,PRODUCT_TYPE) "
	    		+ "values('"+p.getPRODUCT_NAME()+"',"+"'"+p.getPRODUCT_QTY()+"',"+"'"+p.getPRODUCT_PRICE()+"',"+"'"+p.getPRODUCT_TYPE()+"')";    
	    return template.update(sql);    
	}    

	// View all records from products table
	public List<Products> getProducts(){  
	    return template.query("select * from PRODUCT_TABLE",new RowMapper<Products>(){  
	        public Products mapRow(ResultSet rs, int row) throws SQLException {  
	            Products p=new Products();  
	            p.setPRODUCT_ID(rs.getInt(1));  
	            p.setPRODUCT_NAME(rs.getString(2));            
	            p.setPRODUCT_QTY(rs.getInt(3));
	            p.setPRODUCT_PRICE(rs.getFloat(4));
	            p.setPRODUCT_TYPE(rs.getString(5));
	            return p;  
	        }  
	    });
	}

	// View specific product for update
	public Products getProdById(int id){  
	    String sql="select * from PRODUCT_TABLE where PRODUCT_ID=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Products>(Products.class));  
	}  
	
	// Updating certain product
	public int update(Products p){  
	    String sql="update PRODUCT_TABLE set PRODUCT_NAME='"+p.getPRODUCT_NAME()+"', PRODUCT_QTY="+p.getPRODUCT_QTY()+",PRODUCT_PRICE='"+p.getPRODUCT_PRICE()+"',PRODUCT_TYPE='"+p.getPRODUCT_TYPE() +"' where PRODUCT_ID='"+p.getPRODUCT_ID()+"'";  
	    return template.update(sql);  
	}  
	
	// Delete a product
	public int delete(int PRODUCT_ID){  
	    String sql="delete from PRODUCT_TABLE where PRODUCT_ID="+PRODUCT_ID+"";  
	    return template.update(sql);  
	}  
	
}

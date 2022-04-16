package com.listingiosys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.listingiosys.beans.Products;
import com.listingiosys.dao.ProductsDao;

@Controller
public class ProductController {
	
	@Autowired    
    ProductsDao dao;
	
	// Display form for addition of products	
	@RequestMapping("/prodform")
    public String showform(Model m){    
        m.addAttribute("command", new Products());  
        return "prodform";   
    }    
	
	// Addition processing	
    @RequestMapping(value="/add",method = RequestMethod.POST)  
    public String save(@ModelAttribute("prod") Products prod){  
        dao.save(prod);  
        return "redirect:/viewprod";
    }  
    
    // Products table inquiry
    @RequestMapping("/viewprod")  
    public String viewprod(Model m){  
        List<Products> list=dao.getProducts();  
        m.addAttribute("list",list);
        return "viewprod";  
    }  
    
    // Select product to update
    @RequestMapping(value="/editprod/{PRODUCT_ID}")  
    public String edit(@PathVariable int PRODUCT_ID, Model m){  
        Products prod=dao.getProdById(PRODUCT_ID);  
        m.addAttribute("command", prod);
        return "prodeditform";  
    }  
    
    // Update processing
    @RequestMapping(value="/updateprod",method = RequestMethod.POST)  
    public String updateprod(@ModelAttribute("product") Products product){  
        dao.update(product);  
        return "redirect:/viewprod";  
    }  
    
    // Delete product
    @RequestMapping(value="/deleteprod/{PRODUCT_ID}",method = RequestMethod.GET)  
    public String delete(@PathVariable int PRODUCT_ID){  
        dao.delete(PRODUCT_ID);  
        return "redirect:/viewprod";  
    }   


}

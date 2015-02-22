package com.ecommerce.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.ecommerce.dao.ProductDao;
import com.ecommerce.dao.ProductDaoImpl;
import com.ecommerce.dao.RegistrationDao;
import com.ecommerce.persistence.ProductBean;
import com.ecommerce.persistence.RegistrationBean;

@Path("/doSearch")
public class SearchService {
	
	@Autowired
	private ApplicationContext appContext;
	 @Autowired
	private ProductDao productDao; 
	 
	 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
		
		try{
	    	  ProductDao customerDao = appContext.getBean("productDao", ProductDao.class);
	    	  ProductBean bean = new ProductBean();
	    	  bean.setProductColor( "");
	    	  bean.setProductDescription( "" );
	    	  bean.setProductId( "" );
	    	  bean.setProductImage( "" );
	    	  bean.setProductType( "" );
	    	   
	    	  
	  		  customerDao.addCustomer(bean);
	  		
	      }catch(Exception ex){
	    	  ex.printStackTrace();
	      }
 
		return Response.status(200).entity(output).build();
 
	}

}

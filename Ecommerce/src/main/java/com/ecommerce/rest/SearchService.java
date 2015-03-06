package com.ecommerce.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.ecommerce.common.JsonHelper;
import com.ecommerce.dao.ProductDao;
import com.ecommerce.persistence.ProductBean;
import com.ecommerce.web.controller.ApplicationContextHolder;

@Path("/doSearch")
@Service
public class SearchService {
	
    @Autowired
	private ApplicationContext appContext;
	 @Autowired
	private ProductDao productDao;  
	 
	 @Context
	    private HttpServletRequest request;
	 
	 
	 /***
	  * This method is used for data insertion into productdetails table.
	  * @param msg
  	  * @return
	 */ 
	@GET
	@Path("/{param}")
	public Response storeProducts(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
		
		
		 try{
			 productDao = ApplicationContextHolder.getContext().getBean(
						ProductDao.class);
	    	  ProductBean bean = new ProductBean();
	    	  bean.setProductColor( "Blue");
	    	  bean.setProductDescription( "Kenmore 100 cu ft washer" );
	    	  bean.setProductId( "ECOM_KEN_100_Washer" );
	    	  bean.setProductImage( "../img/washer.png" );
	    	  bean.setProductType( "Washer" );
	    	   
	    	  productDao.addCustomer(bean);
	    	  
	    	  
	    	  bean = new ProductBean();
	    	  bean.setProductColor( "White");
	    	  bean.setProductDescription( "Kmart 100 cu ft Dryer" );
	    	  bean.setProductId( "ECOM_KMR_100_Dryer" );
	    	  bean.setProductImage( "../img/dryer.png" );
	    	  bean.setProductType( "Dryer" );
	    	  
	    	  productDao.addCustomer(bean);
	  		  
	  		 bean = new ProductBean();
	    	  bean.setProductColor( "Orange");
	    	  bean.setProductDescription( "Kmart 100 cu ft Dryer" );
	    	  bean.setProductId( "ECOM_KMR_100_Dryer" );
	    	  bean.setProductImage( "../img/dryer.png" );
	    	  bean.setProductType( "Dryer" );
	    	  
	    	  productDao.addCustomer(bean);
	  		  
	  		  
	  		
	      }catch(Exception ex){
	    	  ex.printStackTrace();
	      } 
 
		return Response.status(200).entity(output).build();
 
	}
	
	
	
	@GET
	@Path("/{param}{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProducts(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
		List listOfProducts = null;  
		JsonHelper jsonHelper = new JsonHelper();
		 try{
			 
			productDao = ApplicationContextHolder.getContext().getBean("productDao",ProductDao.class);
			listOfProducts = productDao.findAllProducts(msg);			
			request.getSession().setAttribute(request.getSession( true).getId(), listOfProducts); 
	  		
	      }catch(Exception ex){
	    	  ex.printStackTrace();
	      } 
		 return Response.ok(jsonHelper.getProductJsonArray(listOfProducts).toString(), MediaType.APPLICATION_JSON).build();
		 
 
	}

}

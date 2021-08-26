package com.taskJumia.Jumia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
 
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.taskJumia.Jumia.models.Customer;



public class TestController extends JumiaApplicationTests {

	@Override
	@Before
	public void setUp() {
		super.setUp();
	}

 
	 @Test
	   public void getProductsList() throws Exception {
	      String uri = "/customers";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      Customer[] customerlist = super.mapFromJson(content, Customer[].class);
	      assertTrue(customerlist.length > 0);
	   }
		 
	
}

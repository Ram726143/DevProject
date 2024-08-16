package com.UseProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UseProductController {
	private static final HttpMethod HttpMethods = null;
	@Autowired
	RestTemplate rt;
	@GetMapping(value="/displayAllProdWithGST")
	public List<ProductPojo> getThis() {
		String url1="http://localhost:8080/GetProductAll";
		String url2="http://localhost:8081/GetGSTpercentage/";
		ResponseEntity <List<ProductPojo>> re1=rt.exchange(url1, HttpMethods.GET, null, new ParameterizedTypeReference<List<ProductPojo>>(){});
		List<ProductPojo> products=re1.getBody();
		products.forEach(x-> {
			int hsn=x.getHsncode();
			ResponseEntity<Integer> re2=rt.exchange(url2+hsn, HttpMethods.GET, null, Integer.class);
			int percentage=re2.getBody();
			int netprice=x.getPrice()+(x.getPrice()*percentage/100);
			x.setPrice(netprice);
		});
		return products;
	}
	

}

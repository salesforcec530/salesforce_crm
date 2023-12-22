package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.entities.ResponseWrapper;
import com.example.demo.repository.ProductRepository;
import com.example.demo.utility.SetResponseApi;

@RestController
@RequestMapping("/api-gateway/")
public class ProdutController {

	@Autowired
	ProductRepository productRepository;

	@PostMapping("insert-account")
	public ResponseEntity<ResponseWrapper> insertProduct(@RequestBody List<Product> products) {
		List<Product> listProducts = new ArrayList<>();

		for (Product p : products) {
			Product newProduct = new Product();
			newProduct.setName(p.getName());
			listProducts.add(newProduct);
		}

		List<Product> resultProducts = productRepository.saveAll(listProducts);
		return SetResponseApi.setResponse("CRM", "MuleSoft", resultProducts, "Bạn đã gửi request thành công",
				HttpStatus.OK, 200);
	}
}

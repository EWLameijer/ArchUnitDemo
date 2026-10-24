package org.ericwubbo.archunitdemo;

import org.ericwubbo.archunitdemo.product.ProductService;
import org.ericwubbo.archunitdemo.product.internal.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArchUnitDemoApplication {

    static void main(String[] args) {
        SpringApplication.run(ArchUnitDemoApplication.class, args)
                .getBean(ProductService.class)
                .create(new Product("baeldung", "course", 10));
    }
}

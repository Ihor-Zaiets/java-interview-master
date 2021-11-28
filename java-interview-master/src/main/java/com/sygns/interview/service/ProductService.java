package com.sygns.interview.service;

import com.sygns.interview.model.Color;
import com.sygns.interview.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public Object validateProduct(Product product) {
        final int DEFAULT_SIZE_18 = 18;
        final int DEFAULT_SIZE_30 = 30;
        final String DEFAULT_USER_CONTENT = "Customize me";
        final Color DEFAULT_COLOR = Color.RED;

        if (product.getProductColor() == Color.RGB && !product.getProductFamily().equals("led")
                || product.getProductColor() == null)
            product.setProductColor(DEFAULT_COLOR);
        if (product.getUserContent() == null)
            product.setUserContent(DEFAULT_USER_CONTENT);
        if (product.getSize() <= 0) {
            if (product.getProductFamily().equals("neon") || product.getProductFamily().equals("led"))
                product.setSize(DEFAULT_SIZE_18);
            if (product.getProductFamily().equals("letter") || product.getProductFamily().equals("lightbox"))
                product.setSize(DEFAULT_SIZE_30);
        }

        return product;
    }

    public float calculateProductCost(Product product) {
        float price = 0;
        float colorPrice = 0;
        float userContentLength = product.getUserContent().replace(" ", "").length();

        switch(product.getProductColor()) {
            case RGB:
                colorPrice = 150;
            case RED:
                colorPrice = 100;
            case BLUE:
                colorPrice = 110;
            case PINK:
                colorPrice = 110;
            case WHITE:
                colorPrice = 110;
        }

        if (product.getProductFamily().equals("neon") || product.getProductFamily().equals("led"))
            price = colorPrice * product.getSize() / 100;

        if (product.getProductFamily().equals("letter") || product.getProductFamily().equals("lightbox")) {
            price = userContentLength * 10 + colorPrice / 100 * 50;
            if (product.getProductFamily().equals("letter"))
                price += 20;
        }

        return price;
    }

}

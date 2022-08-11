package ma.atos.shoppingcart.services;

import ma.atos.shoppingcart.dto.CartFidelityProductDto;
import ma.atos.shoppingcart.model.CartFidelityProduct;

import java.util.List;

public interface ICartFidelityProduct {
    List<CartFidelityProduct> save(CartFidelityProductDto cartFidelityProductDto);
}

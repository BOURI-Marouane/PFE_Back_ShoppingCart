package ma.atos.shoppingcart.services;

import ma.atos.shoppingcart.dto.CartProductDto;
import ma.atos.shoppingcart.model.CartProduct;

import java.util.List;

public interface ICartProduct {
    List<CartProduct> save(CartProductDto cartProductDto);
}

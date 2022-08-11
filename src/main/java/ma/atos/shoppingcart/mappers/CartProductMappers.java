package ma.atos.shoppingcart.mappers;

import ma.atos.shoppingcart.dto.CartProductDto;
import ma.atos.shoppingcart.dto.NormalCartDto;
import ma.atos.shoppingcart.model.CartProduct;
import ma.atos.shoppingcart.model.NormalCart;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CartProductMappers {
    @Autowired
    private ModelMapper modelMapper;

    public CartProduct toCartProduct(CartProductDto cartProductDto)
    {
        CartProduct cartProduct = modelMapper.map(cartProductDto, CartProduct.class);
        return cartProduct;
    }
}

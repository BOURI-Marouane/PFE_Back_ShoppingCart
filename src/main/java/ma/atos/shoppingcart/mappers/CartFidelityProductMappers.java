package ma.atos.shoppingcart.mappers;

import ma.atos.shoppingcart.dto.CartFidelityProductDto;
import ma.atos.shoppingcart.dto.CartProductDto;
import ma.atos.shoppingcart.model.CartFidelityProduct;
import ma.atos.shoppingcart.model.CartProduct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CartFidelityProductMappers {
    @Autowired
    private ModelMapper modelMapper;

    public CartFidelityProduct toCartFidelityProduct(CartFidelityProductDto cartFidelityProductDto)
    {
        CartFidelityProduct cartFidelityProduct = modelMapper.map(cartFidelityProductDto, CartFidelityProduct.class);
        return cartFidelityProduct;
    }
}

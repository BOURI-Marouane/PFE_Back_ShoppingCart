package ma.atos.shoppingcart.web.mappers;

import ma.atos.shoppingcart.dto.CartProductDto;
import ma.atos.shoppingcart.model.CartProduct;
import ma.atos.shoppingcart.model.FidelityCart;
import ma.atos.shoppingcart.model.NormalCart;
import ma.atos.shoppingcart.web.responseDto.ResponseCartProduct;
import ma.atos.shoppingcart.web.responseDto.ResponseFidelityCart;
import ma.atos.shoppingcart.web.responseDto.ResponseNormalCart;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperNormalCartResponse {
    @Autowired
    private ModelMapper modelMapper;

    public ResponseNormalCart toNormalCartResponse(NormalCart normalCart)
    {
        ResponseNormalCart normalCartResponse = modelMapper.map(normalCart, ResponseNormalCart.class);
        return normalCartResponse;
    }

    public ResponseFidelityCart toFidelityResponseCart(FidelityCart fidelityCart)
    {
        ResponseFidelityCart responseFidelityCart = modelMapper.map(fidelityCart,ResponseFidelityCart.class);
        return responseFidelityCart;
    }

    public ResponseCartProduct toResponseCartProduct(CartProduct cartProduct)
    {
        ResponseCartProduct responseCartProduct = modelMapper.map(cartProduct,ResponseCartProduct.class);
        return responseCartProduct;
    }

    public ResponseFidelityCart toResponseFidelityCart(FidelityCart fidelityCart) {
        ResponseFidelityCart responseFidelityCart = modelMapper.map(fidelityCart,ResponseFidelityCart.class);
        return responseFidelityCart;
    }
}

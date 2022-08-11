package ma.atos.shoppingcart.services.imp;

import ma.atos.shoppingcart.dto.CartProductDto;
import ma.atos.shoppingcart.mappers.CartProductMappers;
import ma.atos.shoppingcart.model.CartProduct;
import ma.atos.shoppingcart.model.NormalCart;
import ma.atos.shoppingcart.repository.CartProductRepository;
import ma.atos.shoppingcart.repository.NormalCartRepository;
import ma.atos.shoppingcart.services.ICartProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartProductService implements ICartProduct {

    @Autowired
    CartProductRepository cartProductRepository;

    @Autowired
    CartProductMappers cartProductMappers;

    @Autowired
    NormalCartRepository normalCartRepository;

    @Override
    public List<CartProduct> save(CartProductDto cartProductDto) {
        CartProduct cartProduct = cartProductMappers.toCartProduct(cartProductDto);
        Optional<NormalCart> normalCart = normalCartRepository.findById(cartProductDto.getNormalCart());
        cartProduct.setNormalCart(normalCart.get());
        cartProductRepository.save(cartProduct);
        return cartProductRepository.findAll();
    }
}

package ma.atos.shoppingcart.services.imp;

import ma.atos.shoppingcart.dto.CartFidelityProductDto;
import ma.atos.shoppingcart.mappers.CartFidelityProductMappers;
import ma.atos.shoppingcart.model.CartFidelityProduct;
import ma.atos.shoppingcart.model.FidelityCart;
import ma.atos.shoppingcart.repository.CartFidelityProductRepository;
import ma.atos.shoppingcart.repository.FidelityCartRepository;
import ma.atos.shoppingcart.services.ICartFidelityProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartFidelityService implements ICartFidelityProduct {

    @Autowired
    CartFidelityProductRepository cartFidelityProductRepository;

    @Autowired
    CartFidelityProductMappers cartFidelityProductMappers;

    @Autowired
    FidelityCartRepository fidelityCartRepository;

    @Override
    public List<CartFidelityProduct> save(CartFidelityProductDto cartFidelityProductDto) {
        CartFidelityProduct cartFidelityProduct = cartFidelityProductMappers.toCartFidelityProduct(cartFidelityProductDto);
        Optional<FidelityCart> fidelityCart = fidelityCartRepository.findById(cartFidelityProductDto.getFidelityCart());
        cartFidelityProduct.setFidelityCart(fidelityCart.get());
        cartFidelityProductRepository.save(cartFidelityProduct);
        return cartFidelityProductRepository.findAll();
    }
}

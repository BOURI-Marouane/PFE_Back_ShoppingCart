package ma.atos.shoppingcart.services;

import ma.atos.shoppingcart.dto.GetNormalCart;
import ma.atos.shoppingcart.dto.NormalCartDto;
import ma.atos.shoppingcart.exception.NormalCartException;
import ma.atos.shoppingcart.model.FidelityCart;
import ma.atos.shoppingcart.model.NormalCart;

import java.util.List;

public interface INormalCart {
    NormalCart save(NormalCartDto normalCartDto);

    NormalCart findNormalCart(GetNormalCart normalCart) throws NormalCartException;

    List<NormalCart> findAll();

    NormalCart findByCustomer(GetNormalCart normalCart) throws NormalCartException;



}

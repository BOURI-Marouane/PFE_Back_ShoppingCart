package ma.atos.shoppingcart.services;

import ma.atos.shoppingcart.dto.FidelityCartDto;
import ma.atos.shoppingcart.dto.GetNormalCart;
import ma.atos.shoppingcart.exception.NormalCartException;
import ma.atos.shoppingcart.model.FidelityCart;

import java.util.List;

public interface IFidelityCart {
    FidelityCart save(FidelityCartDto fidelityCartDto);

    FidelityCart findFidelityByCustomer(GetNormalCart getNormalCart) throws NormalCartException;
}

package ma.atos.shoppingcart.services.imp;

import ma.atos.shoppingcart.dto.FidelityCartDto;
import ma.atos.shoppingcart.dto.GetNormalCart;
import ma.atos.shoppingcart.exception.NormalCartException;
import ma.atos.shoppingcart.mappers.FidelityCartMappers;
import ma.atos.shoppingcart.model.FidelityCart;
import ma.atos.shoppingcart.model.NormalCart;
import ma.atos.shoppingcart.repository.FidelityCartRepository;
import ma.atos.shoppingcart.services.IFidelityCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FidelityCartService implements IFidelityCart {

    @Autowired
    FidelityCartRepository fidelityCartRepository;

    @Autowired
    FidelityCartMappers fidelityCartMappers;

    @Override
    public FidelityCart save(FidelityCartDto fidelityCartDto) {
        FidelityCart fidelityCart = fidelityCartMappers.toFidelityCart(fidelityCartDto);
        return fidelityCartRepository.save(fidelityCart);

    }

    @Override
    public FidelityCart findFidelityByCustomer(GetNormalCart getNormalCart) throws NormalCartException {
        FidelityCart fidelityCart = null;
        try {
            fidelityCart = fidelityCartRepository.findAllByCustomer(getNormalCart.getCustomer_id());

        }catch (Exception e)
        {
            new NormalCartException("Normal cart is not record");
        }
        return fidelityCart;
    }
}

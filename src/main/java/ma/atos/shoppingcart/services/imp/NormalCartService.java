package ma.atos.shoppingcart.services.imp;

import ma.atos.shoppingcart.dto.GetNormalCart;
import ma.atos.shoppingcart.dto.NormalCartDto;
import ma.atos.shoppingcart.exception.NormalCartException;
import ma.atos.shoppingcart.mappers.NormalCartMappers;
import ma.atos.shoppingcart.model.NormalCart;
import ma.atos.shoppingcart.repository.NormalCartRepository;
import ma.atos.shoppingcart.services.INormalCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NormalCartService implements INormalCart {

    @Autowired
    NormalCartRepository normalCartRepository;

    @Autowired
    NormalCartMappers normalCartMappers;

    @Override
    public NormalCart save(NormalCartDto normalCartDto) {
        NormalCart normalCart = normalCartMappers.toNormalCart(normalCartDto);
        return  normalCartRepository.save(normalCart);
    }

    @Override
    public NormalCart findNormalCart(GetNormalCart getNormalCart) throws NormalCartException{
        Optional<NormalCart> normalCart = Optional.ofNullable(normalCartRepository.findById(getNormalCart.getCustomer_id()).orElseThrow(() -> new NormalCartException("Normal cart is not record")));
        return normalCart.get();
    }

    @Override
    public List<NormalCart> findAll() {
        List<NormalCart> listNormalCart = normalCartRepository.findAll();
        return listNormalCart;
    }

    @Override
    public NormalCart findByCustomer(GetNormalCart normalCart) throws NormalCartException{
        NormalCart normalCart1 = null;
        try {
             normalCart1 = normalCartRepository.findAllByCustomer(normalCart.getCustomer_id());

        }catch (Exception e)
        {
            new NormalCartException("Normal cart is not record");
        }
        return normalCart1;
    }
}

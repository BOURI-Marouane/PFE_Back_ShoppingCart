package ma.atos.shoppingcart.mappers;

import ma.atos.shoppingcart.dto.FidelityCartDto;
import ma.atos.shoppingcart.dto.NormalCartDto;
import ma.atos.shoppingcart.model.FidelityCart;
import ma.atos.shoppingcart.model.NormalCart;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FidelityCartMappers {
    @Autowired
    private ModelMapper modelMapper;

    public FidelityCart toFidelityCart(FidelityCartDto fidelityCartDto)
    {
        FidelityCart fidelityCart = modelMapper.map(fidelityCartDto, FidelityCart.class);
        return fidelityCart;
    }
}

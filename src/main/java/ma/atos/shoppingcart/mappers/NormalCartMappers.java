package ma.atos.shoppingcart.mappers;

import ma.atos.shoppingcart.dto.NormalCartDto;
import ma.atos.shoppingcart.model.NormalCart;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NormalCartMappers {

    @Autowired
    private ModelMapper modelMapper;

    public NormalCart toNormalCart(NormalCartDto normalCartDto)
    {
        NormalCart normalCart = modelMapper.map(normalCartDto, NormalCart.class);
        return normalCart;
    }
}

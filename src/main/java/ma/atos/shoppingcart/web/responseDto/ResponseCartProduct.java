package ma.atos.shoppingcart.web.responseDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.atos.shoppingcart.model.NormalCart;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCartProduct extends GeneralResponse
{
    private long product_reference;

    private long quantity;

    private NormalCart normalCart;
}

package ma.atos.shoppingcart.web.responseDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.atos.shoppingcart.model.FidelityCart;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCartFidelityProduct extends GeneralResponse
{

    private long product_reference;

    private long quantity;

    private long product_fidelity_reference;

    private FidelityCart fidelityCart;

}

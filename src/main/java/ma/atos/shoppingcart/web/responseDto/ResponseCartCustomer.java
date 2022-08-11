package ma.atos.shoppingcart.web.responseDto;

import lombok.*;
import ma.atos.shoppingcart.model.FidelityCart;
import ma.atos.shoppingcart.model.NormalCart;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCartCustomer extends GeneralResponse{
    private NormalCart normalCart;
    private FidelityCart fidelityCart;
}

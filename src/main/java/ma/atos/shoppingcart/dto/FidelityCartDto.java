package ma.atos.shoppingcart.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FidelityCartDto {

    private long customer_id;

    private long total_points;
}

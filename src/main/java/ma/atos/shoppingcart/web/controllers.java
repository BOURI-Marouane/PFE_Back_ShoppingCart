package ma.atos.shoppingcart.web;

import ma.atos.shoppingcart.dto.*;
import ma.atos.shoppingcart.enums.EnumNormalCart;
import ma.atos.shoppingcart.exception.NormalCartException;
import ma.atos.shoppingcart.model.CartFidelityProduct;
import ma.atos.shoppingcart.model.CartProduct;
import ma.atos.shoppingcart.model.FidelityCart;
import ma.atos.shoppingcart.model.NormalCart;
import ma.atos.shoppingcart.services.imp.CartFidelityService;
import ma.atos.shoppingcart.services.imp.CartProductService;
import ma.atos.shoppingcart.services.imp.FidelityCartService;
import ma.atos.shoppingcart.services.imp.NormalCartService;
import ma.atos.shoppingcart.web.mappers.MapperNormalCartResponse;
import ma.atos.shoppingcart.web.responseDto.ResponseCartCustomer;
import ma.atos.shoppingcart.web.responseDto.ResponseFidelityCart;
import ma.atos.shoppingcart.web.responseDto.ResponseNormalCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class controllers {

    @Autowired
    CartFidelityService cartFidelityService;

    @Autowired
    CartProductService cartProductService;

    @Autowired
    FidelityCartService fidelityCartService;

    @Autowired
    NormalCartService normalCartService;

    @Autowired
    MapperNormalCartResponse mapperNormalCartResponse;





/**************************************** Normal Cart ****************************************************/




    @RequestMapping("/normal-cart/save")
    private ResponseNormalCart save(@RequestBody NormalCartDto normalCartDto)
    {
        ResponseNormalCart responseNormalCart = null;
        try
        {
            responseNormalCart = mapperNormalCartResponse.toNormalCartResponse(normalCartService.save(normalCartDto));
            responseNormalCart.setMessage("succès de la requête");
            responseNormalCart.setHttpStatus("200");
        }
        catch (Exception e)
        {
            responseNormalCart.setMessage("erreurs serveur");
            responseNormalCart.setHttpStatus("500");
        }
        return responseNormalCart;
    }


    @RequestMapping("/normal-cart/findNormalCartByCustomer")
    private ResponseNormalCart findNormalCartByCustomer(@RequestBody GetNormalCart getNormalCart) throws Exception
    {
        ResponseNormalCart responseNormalCart = null;
        try {
            responseNormalCart = mapperNormalCartResponse.toNormalCartResponse(normalCartService.findByCustomer(getNormalCart));
            responseNormalCart.setMessage("succès de la requête");
            responseNormalCart.setHttpStatus("200");
        }
        catch (NormalCartException normalCartException)
        {
            responseNormalCart.setHttpStatus("404");
            responseNormalCart.setMessage(EnumNormalCart.NOT_FOUND);
        }
        catch (Exception e)
        {
            responseNormalCart.setHttpStatus("500");
            responseNormalCart.setMessage("erreurs serveur");
        }
        return responseNormalCart;
    }


    @RequestMapping("/normal-cart/findByCustomer")
    private ResponseCartCustomer findCartCustomer(@RequestBody GetNormalCart getNormalCart) throws Exception
    {
        ResponseCartCustomer responseCartCustomer = new ResponseCartCustomer();
        try {
            NormalCart normalCart = normalCartService.findByCustomer(getNormalCart);
            FidelityCart fidelityCart = fidelityCartService.findFidelityByCustomer(getNormalCart);
            responseCartCustomer.setNormalCart(normalCart);
            responseCartCustomer.setFidelityCart(fidelityCart);
            responseCartCustomer.setHttpStatus("200");
            responseCartCustomer.setMessage("succès de la requête");
        }
        catch (NormalCartException normalCartException)
        {
            responseCartCustomer.setHttpStatus("404");
            responseCartCustomer.setMessage(EnumNormalCart.NOT_FOUND);
        }
        catch (Exception e)
        {
            responseCartCustomer.setHttpStatus("500");
            responseCartCustomer.setMessage("erreurs serveur");
        }
        return responseCartCustomer;

    }



    @RequestMapping("/normal-cart/find")
    private ResponseNormalCart findNormalCart(@RequestBody GetNormalCart getNormalCart) throws Exception
    {
        ResponseNormalCart responseNormalCart = null;
            try {
                responseNormalCart = mapperNormalCartResponse.toNormalCartResponse(normalCartService.findNormalCart(getNormalCart));
                responseNormalCart.setMessage("succès de la requête");
                responseNormalCart.setHttpStatus("200");
            }
            catch (NormalCartException normalCartException)
            {
                responseNormalCart.setHttpStatus("404");
                responseNormalCart.setMessage(EnumNormalCart.NOT_FOUND);
            }
            catch (Exception e)
            {
                responseNormalCart.setHttpStatus("500");
                responseNormalCart.setMessage("erreurs serveur");
            }
            return responseNormalCart;
    }





    /**************************************** Fidelity Cart **************************************/

    @RequestMapping("/fidelity-cart/save")
    private ResponseFidelityCart save(@RequestBody FidelityCartDto fidelityCartDto)
    {

        ResponseFidelityCart responseFidelityCart = null;
        try
        {
            responseFidelityCart = mapperNormalCartResponse.toResponseFidelityCart(fidelityCartService.save(fidelityCartDto));
            responseFidelityCart.setMessage("succès de la requête");
            responseFidelityCart.setHttpStatus("200");
        }
        catch (Exception e)
        {
            responseFidelityCart.setMessage("erreurs serveur");
            responseFidelityCart.setHttpStatus("500");
        }
        return responseFidelityCart;
    }








    @RequestMapping("/cart-product/save")
    private List<CartProduct> save(@RequestBody CartProductDto cartProductDto)
    {
        return cartProductService.save(cartProductDto);
    }

    @RequestMapping("/cart-fidelity-product/save")
    private List<CartFidelityProduct> save(@RequestBody CartFidelityProductDto cartFidelityProductDto)
    {
        return cartFidelityService.save(cartFidelityProductDto);
    }

}

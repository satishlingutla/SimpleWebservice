package service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: satish
 * Date: 6/26/17
 * Time: 9:00 PM
 * To change this template use File | Settings | File Templates.
 */

@WebService
@SOAPBinding(style = Style.RPC)

public interface ProductService {

    @WebMethod(operationName = "productDetail")
    String getProduct(int id);

}

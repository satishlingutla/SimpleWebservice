package serviceImpl;

import service.ProductService;

import javax.jws.WebService;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: satish
 * Date: 6/26/17
 * Time: 9:11 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "service.ProductService")

public class ProductServiceImpl implements ProductService {

    @Override
    public String getProduct(int id) {
        //Connect to database and retrieve details/from cache .
        // For Simlicity  I am returning constant value

        return getProductName(id);

    }

    public String getProductName(int productId) {
        //Connect to database and retrieve details .
        // For Simlicity  I am using pre- populated collection
        if (productId == 1) return "Brick";
        else if (productId == 2) return "Cement";
        else if (productId == 3) return "Gypbrock";
        else if (productId == 4) return "Frames";
        else return "No product Found";
    }

}


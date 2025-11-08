package Services;

import Controllers.UserRepository;
import Entities.User;

import java.util.Date;
import java.util.List;

public class UserService {
    UserRepository userRepository = new UserRepository();

    private List<User> getBuyerUsersByOrderCategoryAndDate(String category, String name, Date fromTime, Date toTime){
        userRepository.getBuyerUsersByOrderCategoryAndDate(category,name,fromTime,toTime);
    }

    private List<User> getBuyerUsersByOrderPrice(Float minPrice, Float maxPrice){
        userRepository.getBuyerUsersByOrderPrice(minPrice, maxPrice);
    }

    //Sem compras nem vendas
    private List<User> getInativeUsersByDate(Date fromTime, Date toTime){
        userRepository.getInativeUsersByDate(fromTime,toTime);
    }
}

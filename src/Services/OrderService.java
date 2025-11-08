package Services;

import Entities.Departament;
import Entities.Order;
import Repositories.OrderRepository;

import java.util.Date;
import java.util.List;

public class OrderService {
    OrderRepository orderRepository = new OrderRepository();

    private List<Order> getOrdersByUser(Integer userId, Boolean flagSeller, Boolean flagBuyer){
        orderRepository.getOrdersByUser(userId, flagSeller, flagBuyer);
    }

    private List<Order> getOrdersByCpfEmployee(Integer cpf){
        orderRepository.getOrdersByCpfEmployee(cpf);
    }

    private List<Order> getOrderByPrice(Float minPrice, Float maxPrice){
        orderRepository.getOrderByPrice(minPrice, maxPrice);
    }

    private List<Order> getOrdersByDepartamentAndDate(Departament departament, Date fromTime, Date toTime){
        orderRepository.getOrdersByDepartamentAndDate(departament, fromTime, toTime);
    }

    private List<Order> getOrdersByStatusAndDate(String orderStatus, Date fromTime, Date toTime){
        orderRepository.getOrdersByStatusAndDate(orderStatus, fromTime, toTime);
    }
}

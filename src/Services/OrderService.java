package Services;

import Entities.Departament;
import Entities.Order;

import java.util.Date;
import java.util.List;

public class OrderService {

    private List<Order> getOrdersByUser(){
//        Pedidos de compra e venda tambem
    }

    private List<Order> getOrdersByCpfEmployee(Integer cpf){

    }

    private List<Order> getOrderByPrice(Float price){

    }

    private List<Order> getOrdersByDepartamentAndDate(Departament departament, Date fromTime, Date toTime){
    }

    private List<Order> getOrdersByStatusAndDate(String orderStatus, Date fromTime, Date toTime){
    }
}

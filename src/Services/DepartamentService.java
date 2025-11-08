package Services;


import Entities.Employee;
import EntitiesDTOs.DepartamentDTO;
import Repositories.DepartamentRepository;

import java.util.Date;
import java.util.List;

public class DepartamentService {

    DepartamentRepository departamentRepository = new DepartamentRepository();

    private DepartamentDTO getDepartamentByEmployeeQuantity(Integer minEmployeesQuantity, Integer maxEmployeesQuantity){
        return departamentRepository.getDepartamentByEmployeeQuantity(minEmployeesQuantity, maxEmployeesQuantity);
    }

    private List<DepartamentDTO> getDepartamentByOrderLocalization(Integer code){
        departamentRepository.getDepartamentByOrderLocalization(code);
    }

    //Filtro de unidade por fluxo de pedidos em determinado período de datas
    private DepartamentDTO getDepartamentByOrderDataAndId(Integer minOrders, Integer maxOrders, Date fromTime, Date toTime){
        return departamentRepository.getDepartamentByOrderDataAndId(minOrders, maxOrders, fromTime, toTime);
    }
}

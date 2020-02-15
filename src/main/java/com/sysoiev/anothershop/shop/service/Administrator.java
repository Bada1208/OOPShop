package com.sysoiev.anothershop.shop.service;


import com.sysoiev.anothershop.shop.SalesRoom;
import com.sysoiev.anothershop.shop.interfaces.DepartmentInterface;
import com.sysoiev.anothershop.shop.interfaces.EmployeeInterface;

public class Administrator {

    private SalesRoom salesRoom;

    public Administrator(SalesRoom salesRoom) {
        this.salesRoom = salesRoom;
    }

    public Consultant getFreeConsultant(DepartmentInterface departmentInterface){
        for (EmployeeInterface employee : departmentInterface.getEmployeeList()){
            if (employee instanceof Consultant){
                if (employee.isFree()){
                    return (Consultant)employee;
                }
            }
        }

        return null;
    }


}

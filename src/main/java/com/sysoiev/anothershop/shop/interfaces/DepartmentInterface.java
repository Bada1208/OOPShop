package com.sysoiev.anothershop.shop.interfaces;

import java.util.ArrayList;

public interface DepartmentInterface {

    String getName();

    ArrayList<EmployeeInterface> getEmployeeList();

    ArrayList<GoodsInterface> getGoodsList();

}

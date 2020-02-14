package com.sysoiev.shop;


import com.sysoiev.shop.interfaces.DepartmentInterface;
import com.sysoiev.shop.interfaces.VisitorInterface;
import com.sysoiev.shop.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    private ArrayList<DepartmentInterface> departmentList;// в каждом департаменте имеются свои сотрудники

    private String name;

    private ArrayList<VisitorInterface> visitorList;

    private Administrator administrator;

}

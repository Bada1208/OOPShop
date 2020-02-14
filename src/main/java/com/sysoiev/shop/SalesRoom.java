package com.sysoiev.shop;

import com.sysoiev.shop.client.BaseVisitor;
import com.sysoiev.shop.department.BaseDepartment;
import com.sysoiev.shop.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {
    private String name;
    private Administrator administrator;
    private ArrayList<BaseDepartment> departmentList;//в каждом департаменте имеются свои сотрудники
    private ArrayList<BaseVisitor> visitorList;
}

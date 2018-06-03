package org.dianhu.microsample.service;

import org.dianhu.microframework.dao.DatabaseHelper;
import org.dianhu.microframework.util.PropsUtil;
import org.dianhu.microsample.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Time : 18-6-2 下午7:00
 * Author : hcy
 * Description :
 */
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList() {
        Connection conn = DatabaseHelper.getConnection();
        try {
            String sql = "SELECT * FROM customer";
            return DatabaseHelper.queryEntityList(Customer.class,conn,sql);
        } finally {
            DatabaseHelper.closeConnection(conn);
        }
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id) {
        String sql = "SELECT * FROM customer WHERE id = ?";
        return null;
    }

    /**
     * 创建客户
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return false;
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return false;
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id) {
        return false;
    }
}

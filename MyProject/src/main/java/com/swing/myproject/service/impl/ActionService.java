/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.myproject.service.impl;

import com.swing.myproject.DAO.impl.ActionDAO;
import com.swing.myproject.excel.Connection;
import com.swing.myproject.model.ActionModel;
import java.util.List;

/**
 *
 * @author nmthang
 */
public class ActionService{

    public Object[][] findAll() {
        ActionDAO actDAO = new ActionDAO();
        int maxRow = Connection.getInstance().getSheet().getLastRowNum();
        List<ActionModel> list = actDAO.findAll();
        Object[][] result = new Object[maxRow - 2][4];
        for (int i = 0; i <= list.size() - 2; i++) {
            result[i][0] = list.get(i).getRow();
            result[i][1] = list.get(i).getId();
            result[i][2] = list.get(i).getHeading();
            result[i][3] = list.get(i).getValueHtml();
        }

        return result;
    }
}

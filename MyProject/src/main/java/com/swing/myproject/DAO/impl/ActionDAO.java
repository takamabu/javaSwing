/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.myproject.DAO.impl;

import com.swing.myproject.excel.Connection;
import com.swing.myproject.mapper.ActionMapper;
import com.swing.myproject.model.ActionModel;
import com.swing.myproject.system.Constant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nmthang
 */
public class ActionDAO {

    private int column;

    public ActionDAO() {
        this.column = Constant.ACTION;
    }

    public List<ActionModel> findAll() {
        List<ActionModel> result = new ArrayList<>();
        int maxRow = Connection.getInstance().getSheet().getLastRowNum();
        for (int i = 2; i <= maxRow; i++) {
            result.add(new ActionMapper(i, this.column).mapRow());
        }
        return result;
    }
}

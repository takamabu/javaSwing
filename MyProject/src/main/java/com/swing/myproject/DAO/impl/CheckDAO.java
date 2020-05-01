/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.myproject.DAO.impl;

import com.swing.myproject.excel.Connection;
import com.swing.myproject.mapper.CheckMapper;
import com.swing.myproject.mapper.PreconditionMapper;
import com.swing.myproject.model.CheckModel;
import com.swing.myproject.model.PreconditionModel;
import com.swing.myproject.system.Constant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nmthang
 */
public class CheckDAO{
    private int column;
    
    public CheckDAO() {
        this.column = Constant.CHECK;
    }
    
    public List<CheckModel> findAll(){
        List<CheckModel> result = new ArrayList<>();
        int maxRow = Connection.getInstance().getSheet().getLastRowNum();
        for (int i = 2; i <= maxRow; i++){
            result.add(new CheckMapper(i, this.column).mapRow());            
        }
        return result;
    }
       
}

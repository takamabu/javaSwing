/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.myproject.mapper;

import com.swing.myproject.excel.ExcelAccess;
import com.swing.myproject.model.CheckModel;

/**
 *
 * @author nmthang
 */
public class CheckMapper extends ExcelAccess implements RowMapper<CheckModel>{

    public CheckMapper(int row, int column) {
        super(row, column);
    }


    @Override
    public CheckModel mapRow() {
        CheckModel checkModel = new CheckModel();
        checkModel.setRow(getRow());
        checkModel.setColumn(getColumn());
        checkModel.setHeading(getHeading());
        checkModel.setId(getID());
        checkModel.setValueString(getValueString());
        checkModel.setValueList(getValueList());
        checkModel.setValueHtml(getValueHtml());
        return checkModel;
    }
    
}

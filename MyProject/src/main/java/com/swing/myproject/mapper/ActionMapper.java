/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.myproject.mapper;

import com.swing.myproject.excel.ExcelAccess;
import com.swing.myproject.model.ActionModel;

/**
 *
 * @author nmthang
 */
public class ActionMapper extends ExcelAccess implements RowMapper<ActionModel> {

    public ActionMapper(int row, int column) {
        super(row, column);
    }
    
    @Override
    public ActionModel mapRow() {
        ActionModel actModel = new ActionModel();
        actModel.setRow(getRow());
        actModel.setColumn(getColumn());
        actModel.setHeading(getHeading());
        actModel.setId(getID());
        actModel.setValueString(getValueString());
        actModel.setValueList(getValueList());
        actModel.setValueHtml(getValueHtml());
        return actModel;
    }

}

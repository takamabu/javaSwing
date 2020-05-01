/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.myproject.mapper;

import com.swing.myproject.excel.ExcelAccess;
import com.swing.myproject.model.PreconditionModel;

/**
 *
 * @author nmthang
 */
public class PreconditionMapper extends ExcelAccess implements RowMapper<PreconditionModel>{

    public PreconditionMapper(int row, int column) {
        super(row, column);
    }

    @Override
    public PreconditionModel mapRow() {
        PreconditionModel preModel = new PreconditionModel();
        preModel.setRow(getRow());
        preModel.setColumn(getColumn());
        preModel.setHeading(getHeading());
        preModel.setId(getID());
        preModel.setValueString(getValueString());
        preModel.setValueList(getValueList());
        preModel.setValueHtml(getValueHtml());
        return preModel;
    }
    
}

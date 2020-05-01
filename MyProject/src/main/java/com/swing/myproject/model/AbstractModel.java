/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.myproject.model;

import java.util.List;

/**
 *
 * @author nmthang
 */
public class AbstractModel {

    private int row;
    private int column;
    private String Id;
    private String heading;
    private String valueString;
    private List<List<Object>> valueList;
    private String valueHtml;

    public String getValueHtml() {
        return valueHtml;
    }

    public void setValueHtml(String valueHtml) {
        this.valueHtml = valueHtml;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getValueString() {
        return valueString;
    }

    public void setValueString(String valueString) {
        this.valueString = valueString;
    }

    public List<List<Object>> getValueList() {
        return valueList;
    }

    public void setValueList(List<List<Object>> valueList) {
        this.valueList = valueList;
    }

}

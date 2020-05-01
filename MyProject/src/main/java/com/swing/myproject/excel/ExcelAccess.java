/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.myproject.excel;

import com.swing.myproject.system.Constant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nmthang
 */
public class ExcelAccess {

    private final int row;
    private final int column;

    public ExcelAccess(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }


    public String getValueString() {
        return Connection.getInstance().getSheet().getRow(this.row).getCell(this.column).toString();
    }

    public String getID() {
        return Connection.getInstance().getSheet().getRow(this.row).getCell(Constant.ID).toString();
    }

    public String getHeading() {
        String value;
        value = Connection.getInstance().getSheet().getRow(this.row).getCell(Constant.HEADING).toString();;
        List<String> list = Arrays.asList(value.split("\\."));
        return list.get(list.size() - 1);
    }

    public List<List<Object>> getValueList() {
        String sValue = this.getValueString().replaceAll("\\[|\\]|\\s", "").replace("),", ")#");
        List<List<Object>> result = new ArrayList<>();
        if (sValue.contains("#")) {
            for (String i : sValue.split("#")) {
                result.add(getSubList(i));
            }
        } else {
            result.add(getSubList(sValue));
        }
        return result;
    }

    public String getValueHtml() {
        List<List<Object>> value = this.getValueList();
        String result = "<html>";
        for (Object i : value) {
            result = result + i.toString() + "<br>";
        }
        return result.substring(0, result.length() - 4) + "</html>";
    }

    private List<Object> getSubList(String value) {
        List<Object> subList = new ArrayList<>();
        subList.addAll(Arrays.asList(value.replaceAll("\\(|\\)", "").split(",")));
        try {
            subList.set(0, Integer.parseInt(String.valueOf(subList.get(0))));
        } catch (NumberFormatException e) {

        }
        return subList;
    }

}

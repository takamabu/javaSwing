/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.myproject.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author nmthang
 */
public class Connection {

    private static XSSFSheet sheet = null;
    private static Connection connection = null;
    private XSSFWorkbook wb;
    
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    

    public static Connection getInstance() {
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }

    public XSSFSheet getSheet() {

        if (Connection.sheet == null) {

            String path = this.path;
            String sheet = "Sheet1";
            FileInputStream inputStream = null;

            try {
                inputStream = new FileInputStream(new File(path));
                try {
                    this.wb = new XSSFWorkbook(inputStream);
                    Connection.sheet = wb.getSheet(sheet);
                } catch (IOException ex) {
                    Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Connection.sheet;
    }
}

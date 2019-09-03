/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleorcamento.objeto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author rosaan
 */
public class DataHoje {

    private String datahoje;

    public DataHoje() {
    }

    public DataHoje(String datahoje) {
        this.datahoje = datahoje;
    }

    public String getDatahoje() {
        return datahoje;
    }

    public void setDatahoje(String datahoje) {
        this.datahoje = datahoje;
    }

    public void Data() {

        GregorianCalendar calendar = new GregorianCalendar();
        int mes = calendar.get(GregorianCalendar.MONTH);
        if(mes == 1){
            datahoje = "JAN";
        } else if (mes == 2){
            datahoje = "FEV";
        }else if (mes == 3){
            datahoje = "MAR";
        }else if (mes == 4){
            datahoje = "ABR";
        }else if (mes == 5){
            datahoje = "MAI";
        }else if (mes == 6){
            datahoje = "JUN";
        }else if (mes == 7){
            datahoje = "JUL";
        }else if (mes == 8){
            datahoje = "AGO";
        }else if (mes == 9){
            datahoje = "SET";
        }else if (mes == 10){
            datahoje = "OUT";
        }else if (mes == 11){
            datahoje = "NOV";
        }else if (mes == 12){
            datahoje = "DEZ";
        }

//        Date d = new Date();
//        Calendar c = Calendar.getInstance();
//        SimpleDateFormat mes = new SimpleDateFormat("MM");
//        this.datahoje = mes;
//               
//        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL); //Data COmpleta
////        System.out.println("Data brasileira: " + f.format(data));
//
//        f = DateFormat.getDateInstance(DateFormat.LONG);
////        System.out.println("Data sem o dia descrito: " + f.format(data));
//
//        f = DateFormat.getDateInstance(DateFormat.MEDIUM);
//        System.out.println("Data resumida 1: " + f.format(data));
//
//        f = DateFormat.getDateInstance(DateFormat.SHORT);
//        System.out.println("Data resumida 2: " + f.format(data));
    }
}

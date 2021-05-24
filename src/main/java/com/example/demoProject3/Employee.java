package com.example.demoProject3;


import java.util.HashMap;

public class Employee {
    static HashMap<Integer, String> EmpIdName = new HashMap<>();
    static  {
        EmpIdName.put(1, "tom");
        EmpIdName.put(2, "pam");
        EmpIdName.put(3, "mave");
    }
    public static double getGrossSalary(double basic, double hra, double da, double ma) {
        return basic + (hra * basic)/100 + (da * basic)/100 + (ma * basic)/100;
    }
    public static double getNetSalary(double basic, double hra, double da, double ma, double pf, double insurance) {
        return getGrossSalary(basic, hra, da, ma) - (pf + insurance);
    }

}

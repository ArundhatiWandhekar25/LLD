package com.arundhati.lld.oops.Polymorphism;

public class Student extends User{
    private String batchName;
    private double psp;

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }
}

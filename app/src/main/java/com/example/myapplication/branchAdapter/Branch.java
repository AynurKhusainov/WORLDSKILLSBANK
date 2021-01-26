package com.example.myapplication.branchAdapter;

public class Branch {
    private String address;
    private String bankomat;
    private String working;
    private String Wtime;

    public Branch(String address, String bankomat, String working, String wtime) {
        this.address = address;
        this.bankomat = bankomat;
        this.working = working;
        this.Wtime = wtime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankomat() {
        return bankomat;
    }

    public void setBankomat(String bankomat) {
        this.bankomat = bankomat;
    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }

    public String getWtime() {
        return Wtime;
    }

    public void setWtime(String wtime) {
        Wtime = wtime;
    }

    public Branch() {
    }
}

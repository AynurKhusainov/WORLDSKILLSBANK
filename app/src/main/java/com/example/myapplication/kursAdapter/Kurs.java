package com.example.myapplication.kursAdapter;

public class Kurs {
    private String flag, kurs, longkurs, buy, sell;

    public Kurs(String buy) {
        this.buy = buy;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    public String getLongkurs() {
        return longkurs;
    }

    public void setLongkurs(String longkurs) {
        this.longkurs = longkurs;
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }
}

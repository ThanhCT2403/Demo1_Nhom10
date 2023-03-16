package com.tn;

public class Rectange {
    int d;
    int r;
    public Rectange(){

    }

    public Rectange(int d, int r) {
        this.d = d;
        this.r = r;
    }
    public int dientichhcn(){
        int dientich;
        dientich = d*r;
        return dientich;
    }
    public int chuvihcn(){
        int chuvi;
        chuvi = (d+r)*2;
        return chuvi;
    }
}

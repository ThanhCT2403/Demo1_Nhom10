package Bai1;

public class TinhSn {
    int n;
    int x;
    public TinhSn(){

    }
    public double Tong(){
        double tong = 0;
        for (int i=0;i<=n;i++){
            tong +=i;
        }
        return tong;
    }
    public double Tich(){
        double tich = 0;
        for (int i=0;i<=n;i++){
            tich +=Math.pow(x,i)/Tong();
        }
        return tich;
    }
}

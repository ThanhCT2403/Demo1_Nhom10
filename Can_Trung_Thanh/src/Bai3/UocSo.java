package Bai3;

public class UocSo {
    int n;
    public UocSo(){

    }
    public int Tong(){
        int tong = 0;
        for(int i=1;i<=n;i++){
            if (n%i==0 && i%2==0){
                    tong+=i;

            }
        }
        return tong;
    }
}

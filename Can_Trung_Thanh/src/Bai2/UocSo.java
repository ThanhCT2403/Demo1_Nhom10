package Bai2;

public class UocSo {
    int n;
    public UocSo(){

    }
    public void Uoc(){
        for(int i=1;i<=n;i++){
            if (n%i==0 && i%2==1){
                    System.out.println("Cac uoc la "+i);
            }
        }
    }
}

package TinhKeThua;

public class Xekhach extends Vehicle {
    private int soGhe;

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    @Override
    public String toString() {
        return "Xekhach{" +
                "soGhe=" + soGhe +
                ", vehicleName='" + vehicleName + '\'' +
                '}';
    }
}

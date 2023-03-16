package TinhKeThua;

public class Truck extends Vehicle{
    private int trongTai;
    private int containerHeight;

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    public void setContainerHeight(int containerHeight) {
        this.containerHeight = containerHeight;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public int getContainerHeight() {
        return containerHeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "trongTai=" + trongTai +
                ", containerHeight=" + containerHeight +
                '}';
    }
}

package TinhKeThua;

public class Program {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.showData();

        Car car = new Car();
        car.showData();
        car.vehicleName = "Vios";

        Truck truck1 = new Truck();
        truck1.setId(10);
        truck1.setVehicleName("xe tai Huyndai");
        truck1.setModel("SFKD981");
        truck1.setPrice(1000);

        truck1.setTrongTai(2);
        truck1.setContainerHeight(3);
        System.out.println(truck1);

        Xekhach xekhach = new Xekhach();
        xekhach.setVehicleName(("Xe khach duong dai"));
        xekhach.setSoGhe(45);
        System.out.println(xekhach);

    }
}

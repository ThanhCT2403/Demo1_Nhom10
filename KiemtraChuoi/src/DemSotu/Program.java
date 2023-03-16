package DemSotu;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi n: ");
        String n = scanner.nextLine();

        System.out.println();
        DemSoTu st1 = new DemSoTu();
        st1.SoTu(n);

    }
}

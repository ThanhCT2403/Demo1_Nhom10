package Interfac_Abstract;

public class Program {
    public static void printFormatted(String str,StringFunction stringFunction){
        System.out.println(str);
        String result  =stringFunction.ghepchuoi(str);
        System.out.println(result);

    }

    public static void main(String[] args) {
        StringFunction ghepchuoi = (s) ->s +" vl luon";
        printFormatted("Hello",ghepchuoi);
    }
}

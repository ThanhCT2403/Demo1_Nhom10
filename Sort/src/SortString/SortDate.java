package SortString;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SortDate {
    public static void main(String[] args) {
        String strDate1 = "1998-12-31 06:15:21";
        String strDate2 = "2022-11-12 00:15:50";
        String strDate3 = "2001-06-01 14:15:21";
        Date date1 = null;
        Date date2 = null;
        Date date3 = null;
        try{
            date1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(strDate1);
            date2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(strDate2);
            date3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(strDate3);
        } catch(ParseException e){
            e.printStackTrace();
        }

        List<Date> listDate= Arrays.asList(date1,date2,date3);
        Collections.sort(listDate);
        System.out.println(listDate);
        Collections.sort(listDate, Collections.reverseOrder());
        System.out.println(listDate);

    }
}

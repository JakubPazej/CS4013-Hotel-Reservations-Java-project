import java.util.GregorianCalendar;
import java.util.Date;
import java.io.*;
import java.util.Scanner;
public class billing{
    private int resNum;
    public double bill(int resNum) throws Exception{
        String startDate;
        String endDate;
        String firstName;
        String lastName;
        String resType;
        double Bill=0;
        toReadCSV reader = new toReadCSV();
        
        startDate = reader.readResStart(resNum);
        endDate = reader.readResEnd(resNum);
        resType = reader.readResType(resNum);
        
        
        
        return Bill;
    }
}
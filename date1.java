import java.text.SimpleDateFormat;
import java.util.*;
public class date1 
{
    public static void main(String[] args)
     {
         Date dt=new Date();
         SimpleDateFormat sdf=new SimpleDateFormat("E dd/MMMM/yyyy");
         String current_date=sdf.format(dt);
         System.out.println(current_date);
    }
}

package Q4;

import java.util.*;
import java.text.SimpleDateFormat;


public class Q4 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        System.out.print(sdf.format(today));
    }
}

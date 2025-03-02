package Q7;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 { public static void main(String[] args) {
    Date today = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

    JFrame myWindow;
    myWindow = new JFrame();
    myWindow.setSize(300, 200);
    myWindow.setTitle(sdf.format(today));
    myWindow.setVisible(true);
}
}


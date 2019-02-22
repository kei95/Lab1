package Lab;

import java.util.Scanner;

public class Modeldetail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = "";


        Model m1 = new Model("Susan", "Smith", 70, 120, false, true);
        m1.printDetails();

    }
}

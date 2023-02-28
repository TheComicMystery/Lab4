public class Lab1 {
    public static void Lab1(String[] args) {

        int xa = 6;
        int ya = 2;

        int xb = 6;
        int yb = 5;

        int xc = 3;
        int yc = 4;

        //Formula: d = sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double distAB = Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));
        double distAC = Math.sqrt(Math.pow(xc - xa, 2) + Math.pow(yb - ya, 2));

        if (distAB < distAC){
            System.out.println("The closest point to A is B: (" + xb + ", " + yb + "). The distance between them is " + distAB);
        } else {
            System.out.println("The closest point to A is C: (" + xc + ", " + yc + "). The distance between them is " + distAC);
        }
    }
}






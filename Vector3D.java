public class Vector3D {

    double X;
    double Y;
    double Z;

    public Vector3D(double x, double y, double z) {
        X = x;
        Y = y;
        Z = z;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public double getZ() {
        return Z;
    }


    @Override
    public String toString() {
        String myStr = "(%.2f, %.2f, %.2f)";
        return String.format(myStr, X, Y, Z);
    }

    public static void main(String[] args) {
        var apple = new Vector3D(2.22222, 3.33333, 4.44444);
        System.out.println(apple);
    }
}

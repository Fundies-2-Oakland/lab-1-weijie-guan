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

    public double getMagnitude() {
        return Math.abs(Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2) + Math.pow(Z, 2)));
    }

    public Vector3D normalize() {
        var mag = getMagnitude();
        if (mag == 0) {
            throw new IllegalStateException("Magnitude is zero.");
        }
        return new Vector3D(X / mag, Y / mag, Z / mag);
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(this.X + other.X, this.Y + other.Y, this.Z + other.Z);
    }

    public Vector3D multiply(double scalar) {
        return new Vector3D(this.X * scalar, this.Y * scalar, this.Z * scalar);
    }

    public double dotProduct(Vector3D other) {
        return this.X * other.X + this.Y * other.Y + this.Z * other.Z;
    }

    public double angleBetween(Vector3D other) {
        var mag = this.getMagnitude() * other.getMagnitude();
        if (mag == 0) {
            throw new IllegalStateException("Magnitude is zero.");
        }
        return Math.toDegrees(Math.acos(this.dotProduct(other) / mag));
    }


    public static void main(String[] args) {
        var apple = new Vector3D(2.22222, 3.33333, 4.44444);
        System.out.println(apple);
        System.out.println(apple.getMagnitude());
        System.out.println(apple.normalize());
        var banana = new Vector3D(3, 3, 3);
        System.out.println(apple.add(banana));
        System.out.println(banana.multiply(3));
        System.out.println(apple.dotProduct(banana));
        System.out.println(apple.angleBetween(banana));
    }
}

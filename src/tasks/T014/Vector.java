package tasks.T014;

public class Vector {
    private float x;
    private float y;
    private float z;


    public Vector(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double runLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    
    public double runScalarProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }


    public Vector runProduct(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }


    public double runCos(Vector vector) {
        return runScalarProduct(vector) / (runLength() * vector.runLength());
    }

    public Vector runAdd(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }

    public Vector runDiff(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }

    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector((int) (Math.random() * 6),(int) (Math.random() * 6), (int) (Math.random() * 6));
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

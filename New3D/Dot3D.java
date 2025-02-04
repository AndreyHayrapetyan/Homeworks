package New3D;

import java.util.Objects;

public class Dot3D implements Comparable<Dot3D> {
    private double x, y, z;
    private String name;
    private String color;

    public Dot3D(double x, double y, double z, String name, String color){
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dot3D dot3D = (Dot3D) o;
        return Double.compare(x, dot3D.x) == 0 &&
                Double.compare(y, dot3D.y) == 0 &&
                Double.compare(z, dot3D.z) == 0 &&
                Objects.equals(name, dot3D.name) &&
                Objects.equals(color, dot3D.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, name, color);
    }

    @Override
    public int compareTo(Dot3D o) {
        int cmp = Double.compare(this.x, o.x);
        if (cmp == 0) cmp = Double.compare(this.y, o.y);
        if (cmp == 0) cmp = Double.compare(this.z, o.z);
        if (cmp == 0) cmp = this.color.compareTo(o.color);
        return cmp;
    }

    @Override
    public String toString() {
        return "Dot3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

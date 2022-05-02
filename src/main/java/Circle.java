import java.awt.*;

public class Circle extends Figure{
        private Point center;
        private double radius;

    public Circle(Point center, double radius, Color color) {
        super (color);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void expand(double scaleFactor){};

    @Override
    public double perimeter() {
        return 0;
    }
}

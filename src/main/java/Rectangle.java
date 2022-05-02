import java.awt.*;

public class Rectangle extends Figure {

    private Point upperLeft;
    private Point bottomRight;

    public Rectangle(Color color, Point upperLeft, Point bottomRight) {
        super (color);
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public double area() {
        return 0;
    }
        public double perimeter () {
            return 10;

    }
}

import java.util.ArrayList;
import java.util.List;

import ca.shaw.interfaces.Shape;

public class Main {

    public static void main(String [ ] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        System.out.println("Drawing shapes...");
        for (Shape shape : shapes) {
            System.out.println(shape.draw());
        }
    }
}

package OpenClosed;

import java.awt.*;

public class OpenClosedExample {

    ///////////////// Open-Closed Prensibine Aykırı /////////////////////
    public class AreaCalculator {


        public class Circle {

            private double Radius;

            public double getRadius() {
                return Radius;
            }

            public void setRadius(double radius) {
                Radius = radius;
            }
        }
                         /////////////////////////////////

        public double Area(Object shape) {
            double area = 0;
            if (shape instanceof Rectangle) {
                area = ((Rectangle) shape).getWidth() * ((Rectangle) shape).getHeight();
            } else {
                Circle circle = (Circle) shape;
                area += circle.getRadius() * circle.getRadius() * Math.PI;

            }
            return area;
        }
    }
                  ///////////////// Open-Closed Prensibine Uygun  /////////////////////
    public abstract class Shape
    {
        public abstract double Area();
    }
                                       ///////////////
    public class Circle extends Shape {

        private double radius;

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public double Area() {
            return radius*radius*Math.PI;
        }
    }
}

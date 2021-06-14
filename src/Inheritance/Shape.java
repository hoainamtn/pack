package Inheritance;

public class Shape {
    String color = "red";
    boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

    public static class ShapeTest {
        public static void main(String[] args) {
            Shape shape = new Shape();
            System.out.println(shape);
            shape = new Shape("red", false);
            System.out.println(shape);
        }
    }

    public static class Circle extends Shape {
        private double readius = 1.0;

        public Circle() {

        }

        public Circle(double readius) {
            this.readius = readius;
        }

        public Circle(double readius, String color, boolean filled) {
            super(color, filled);
            this.readius = readius;

        }

        public double getReadius() {
            return readius;
        }

        public void setReadius(double readius) {
            this.readius = readius;
        }

        public double getArea() {
            return readius * readius * Math.PI;

        }

        public double getPerimeter() {
            return 2 * readius * Math.PI;

        }

        @Override
        public String toString() {
            return "A Circle with radius="
                    + getReadius()
                    + ", which is a subclass of "
                    + super.toString();
        }

        public class CircleTest {


            public static void main(String[] args) {
                Circle circle = new Circle();
                System.out.println(circle);

                circle = new Circle(3.5);
                System.out.println(circle);
                circle = new Circle(3.5, "indigo", false);
                System.out.println(circle);

            }
        }

        public static class Rectangle extends Shape {
            private double width = 1.0;
            private double length = 1.0;

            public Rectangle() {
            }

            public Rectangle(double width, double length) {
                this.width = width;
                this.length = length;
            }

            public Rectangle(double width, double length, String color, boolean filled) {
                super(color, filled);
                this.width = width;
                this.length = length;
            }

            public double getWidth() {
                return width;
            }

            public void setWidth(double width) {
                this.width = width;
            }

            public double getLength() {
                return length;
            }

            public void setLength(double length) {
                this.length = length;
            }

            public double getArea() {
                return width * this.length;
            }

            public double getPerimeter() {
                return 2 * (width + this.length);
            }

            @Override
            public String toString() {
                return "A Rectangle with width="
                        + getWidth()
                        + " and length="
                        + getLength()
                        + ", which is a subclass of "
                        + super.toString();
            }

            public static class RectangleTest {
                public static void main(String[] args) {
                    Rectangle rectangle = new Rectangle();
                    System.out.println(rectangle);

                    rectangle = new Rectangle(2.3, 5.8);
                    System.out.println(rectangle);

                    rectangle = new Rectangle(2.5, 3.8, "orange", true);
                    System.out.println(rectangle);
                }
            }
            public static class Square extends Rectangle {
                public Square() {
                }

                public Square(double side) {
                    super(side, side);
                }

                public Square(double side, String color, boolean filled) {
                    super(side, side, color, filled);
                }

                public double getSide() {
                    return getWidth();
                }

                public void setSide(double side) {
                    setWidth(side);
                    setLength(side);
                }

                @Override
                public void setWidth(double width) {
                    setSide(width);
                }

                @Override
                public void setLength(double length) {
                    setSide(length);
                }

                @Override
                public String toString() {
                    return "A Square with side="
                            + getSide()
                            + ", which is a subclass of "
                            + super.toString();
                }
            }
            public static class SquareTest {
                public static void main(String[] args) {
                    Square square = new Square();
                    System.out.println(square);

                    square = new Square(2.3);
                    System.out.println(square);

                    square = new Square(5.8, "yellow", true);
                    System.out.println(square);
                }
            }

        }

    }
}


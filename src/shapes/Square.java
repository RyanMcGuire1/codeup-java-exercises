package shapes;

class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;

    }

    @Override
    public void setWidth(double width) {
//        this.width = width;
        this.setLength(width);
    }

    @Override
    public double getPerimeter() {
        return 4 * super.length;
    }

    @Override
    public double getArea() {
        return super.length  * super.length;
    }

//    public Square(int side) {
//
//        this.length = side;
//        this.width = side;
//    }
//
//    @Override
//    public int getArea(){
//        System.out.println("Square area method");
//        return this.length * this.length;
//    }
//
//    @Override
//    public int getPerimeter(){
//        System.out.println("Square perimeter method");
//        return this.length * 4;
//    }

}

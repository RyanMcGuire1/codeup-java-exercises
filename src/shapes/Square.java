package shapes;

class Square extends Rectangle{

    public Square(int side) {

        this.length = side;
        this.width = side;
    }

    @Override
    public int getArea(){
        System.out.println("Square area method"); 
        return this.length * this.length;
    }

    @Override
    public int getPerimeter(){
        System.out.println("Square perimeter method");
        return this.length * 4;
    }

}

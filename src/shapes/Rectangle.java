package shapes;

class Rectangle {
    protected int length;
    protected int width;



    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public  Rectangle(){

    }

    public int getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }
    public int getArea(){
        return this.length * this.width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth(){
        return width;
    }
}

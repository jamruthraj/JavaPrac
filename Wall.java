public class Wall {
    private double width, height;

    public Wall() {
    }

    public Wall(double width, double height) {
        if (width < 0)
            width = 0;
        else
            this.width = width;
        if (height < 0)
            height = 0;
        else
            this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >= 0)
            this.width = width;
        else width = 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height >= 0)
            this.height = height;
        else height = 0;
    }

    public double getArea() {
        return width * height;
    }
}
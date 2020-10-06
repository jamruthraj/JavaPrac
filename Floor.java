public class Floor {
    private double width, length;

    public Floor(double width, double length) {
        if (width >= 0)
            this.width = width;
        else
            this.width = 0;
        if (length >= 0)
            this.length = length;
        else
            this.length = 0;
    }

    public double getArea() {
        return width * length;
    }
}


class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        if (cost >= 0)
            return cost;
        else
            return 0;
    }
}

class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
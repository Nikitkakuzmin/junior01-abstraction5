public class CubeGold extends GoldShape{

    double side;

    public CubeGold(double side) {
        this.side = side;
    }

    double V = 0;

    @Override
    double getVolume() {
        V = side * side * side;
        return V;
    }

    @Override
    double getPrice() {
        return getVolume() * 250 + 1200;
    }
}

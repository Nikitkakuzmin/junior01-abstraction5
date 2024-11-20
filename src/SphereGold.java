public class SphereGold extends GoldShape {
    double radius;

    public SphereGold(double radius) {
        this.radius = radius;
    }

    double V = 0;

    @Override
    public double getVolume(){
        V = 4/3 * 3.14 * (radius * radius * radius);
        return V;
    }

    @Override
    double getPrice() {
        return getVolume() * 250 + 1200;
    }
}

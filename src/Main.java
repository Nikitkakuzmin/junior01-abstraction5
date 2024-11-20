public class Main {
    public static void main(String[] args) {

        SphereGold s1 = new SphereGold(2.3);
        SphereGold s2 = new SphereGold(3.1);
        SphereGold s3 = new SphereGold(2.7);

        CubeGold c1 = new CubeGold(2.3);
        CubeGold c2 = new CubeGold(2.7);
        CubeGold c3 = new CubeGold(3.1);

        GoldShape[] goldshape = {s1,s2,s3,c1,c2,c3};

        for(GoldShape g : goldshape){
            System.out.println(g.getVolume() + " " + g.getPrice());
        }
    }
}

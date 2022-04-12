public class Main {

    public static void main(String[] args) {

        BinOps bins = new BinOps();
        String bynaryFive = "101";
        String bynarySix = "110";
        System.out.println(bins.mult(bynaryFive, bynarySix));
        System.out.println(bins.sum(bynaryFive, bynarySix));
    }
}

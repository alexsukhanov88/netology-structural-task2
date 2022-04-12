public class BinOps {

    public String sum(String a, String b) {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        int sum = aInt + bInt;
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        int mult = aInt * bInt;
        return Integer.toBinaryString(mult);
    }
}
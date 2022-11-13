public class Main {
    public static void main(String[] args) {
        byte numByte = 10;
        short numShort = 20;
        int numInt = 50;
        long numLong = 50000L + (10L * (numByte + numShort + numInt));

        System.out.println("numLong: "+numLong);
    }
}
package sumup;

public class TestSumupImplMain {
    public static void main(String[] args) {
        SumupImpl sumup = new SumupImpl();
        int[] array = {1, 11, 4, 5, 13};
        int[] result = sumup.getSumup(array, 15);
        System.out.println(result[0] + " " + result[1]);
    }
}

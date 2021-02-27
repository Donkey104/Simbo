package sumup;

public class SumupImpl {
    public int[] getSumup(int[] array, int target) {
        int[] result = new int[2];
        for (int index=0; index < array.length - 1; index++) {
            int otherIndex = index + 1;
            while(otherIndex < array.length) {
                if (target == array[index] + array[otherIndex]) {
                    result[0] = array[index];
                    result[1] = array[otherIndex];
                }
                otherIndex++;
            }
        }
        return result;
    }
}

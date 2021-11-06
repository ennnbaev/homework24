public class SortArray {
    public double[] bubbleSorter(double[] mass) {
        double swap;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] > mass[j]) {
                    swap = mass[i];
                    mass[i] = mass[j];
                    mass[j] = swap;
                }
            }
        }
        return mass;
    }
}

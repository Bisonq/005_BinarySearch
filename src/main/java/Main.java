import algorithms.BinarySearch;

public class Main {
    public static void main(String[] args) {
        Integer[] tab1 = {1,3,6,8,9,10};
        Double[] tab2 = {1.2, 3.2, 5.4, 7.6, 9.1, 11.4};

        BinarySearch<Integer> binarySearch1 = new BinarySearch<>(tab1, 8);
        BinarySearch<Double> binarySearch2 = new BinarySearch<>(tab2, 9.1);

        System.out.println(binarySearch1.search());
        System.out.println(binarySearch2.search());
    }
}

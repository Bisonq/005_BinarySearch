package algorithms;

public class BinarySearch <T extends Comparable<T>>{
    private final T[] arrayOfElements;
    private final T key;

    public BinarySearch(T[] arrayOfElements, T key){
        this.arrayOfElements = arrayOfElements;
        this.key = key;
    }

    public int search(){
        int left = 0;
        int right = this.arrayOfElements.length - 1;
        int middle = 0;

        while (left <= right){
            middle = (left + right) / 2;
            int res = arrayOfElements[middle].compareTo(key);
            if(res == 0)
                return middle;
            else if (res < 0)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return -1;
    }
}

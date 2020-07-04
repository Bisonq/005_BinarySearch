package algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    @DisplayName("The Algorithm should work multi-types")
    void test1(){
        //given
        Integer[] tab1 = {3,5,7,9,10,14};
        Double[] tab2 = {3.2,4.5,6.1,7.9,9.9,12.3};
        BinarySearch<Integer> binarySearch1 = new BinarySearch<>(tab1, 7);
        BinarySearch<Double> binarySearch2 = new BinarySearch<>(tab2, 6.1);

        //when
        int result1 = binarySearch1.search();
        int result2 = binarySearch2.search();

        //then
        assertEquals(2, result1);
        assertEquals(2, result2);
    }

    @Test
    @DisplayName("The Algorithm should return correct index when array contain key")
    void test2(){
        //given
        Integer[] tab = {1,2,3,4,5,6};
        BinarySearch<Integer> binarySearch = new BinarySearch<>(tab, 4);

        //when
        int result = binarySearch.search();

        //then
        assertEquals(3, result);
    }


    @Test
    @DisplayName("The Algorrith should return -1 when array do not contain key")
    void test3(){
        //given
        Integer[] tab = {1,2,3,4,5};
        BinarySearch<Integer> binarySearch = new BinarySearch<>(tab, 6);

        //when
        int result = binarySearch.search();

        //then
        assertEquals(-1, result);
    }
}
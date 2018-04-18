package by.jb24.less09hw;

import java.util.Arrays;

public class OutText {
    public void print(Object... pieceOfData) {
        Arrays.stream(pieceOfData).forEach(System.out::println);
    }
}

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SubArrayTest {
    private final SubArray sub = new SubArray();

    String[] nums = "3 5 4 1 2 5 3 4 3 2 1 1 2 4 2 3 4 5 3 1 2 5 4 5 4 1 1 5 3 1 4 5 2 3 2 5 2 5 2 2 1 5 3 2 5 1 2 4 3 1 5 1 3 3 5".split(" ");
    List<Integer> list = Arrays.stream(nums)
            .map(Integer::valueOf)
            .collect(Collectors.toList());

    String[] success = "1 2 1 3 2".split(" ");

    List<Integer> s = Arrays.stream(success)
            .map(Integer::valueOf)
            .collect(Collectors.toList());
    @Test
    void division() {
        assertEquals(10, sub.birthday(list, 18, 6));
    }

    @Test
    void thisPass() {
        assertEquals(2, sub.birthday(s, 3, 2));
    }

}
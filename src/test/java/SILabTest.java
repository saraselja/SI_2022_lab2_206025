import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SILab2Test {
    private List<String> createlist(String... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }
    @Test
    void everyStatementTest(){
        RuntimeException exc1;
        exc1 = assertThrows(RuntimeException.class, () -> SILab2.function(createlist()));
        assertEquals("List length should be greater than 0",exc1.getMessage());

        RuntimeException exc2;
        exc2 = assertThrows(RuntimeException.class, () -> SILab2.function(createlist("0","#","0","#", "0","0","#")));
        assertEquals("List length should be a perfect square",exc2.getMessage());

        List<String> res1 = SILab2.function(createlist("0", "#", "0", "0", "0", "#", "0", "0", "#"));
        assertEquals("2",res1.get(2));
        assertEquals("1",res1.get(0));

        List<String> res2 = SILab2.function(createlist("0", "#", "0", "#", "0", "0", "#", "#", "#"));
        assertEquals("3",res2.get(4));


    }

    @Test
    void everyBranchTest(){
        RuntimeException exc1;
        exc1 = assertThrows(RuntimeException.class, () -> SILab2.function(createlist()));
        assertEquals("List length should be greater than 0",exc1.getMessage());

        RuntimeException exc2;
        exc2 = assertThrows(RuntimeException.class, () -> SILab2.function(createlist("0","#","0","#", "0","0","#")));
        assertEquals("List length should be a perfect square",exc2.getMessage());

        List<String> res1 = SILab2.function(createlist("0", "#", "0", "0", "0", "#", "0", "0", "#"));
        assertEquals("2",res1.get(2));
        assertEquals("1",res1.get(0));

        List<String> res2 = SILab2.function(createlist("0", "#", "0", "#", "0", "0", "#", "#", "#"));
        assertEquals("3",res2.get(4));
    }
}
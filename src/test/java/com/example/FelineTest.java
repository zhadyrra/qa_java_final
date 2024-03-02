package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline felineSpy;

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = felineSpy.eatMeat();
        assertEquals(expected, actual);
    }
    @Test(expected = Exception.class)
    public void eatMeatExceptionTest() throws Exception {
        List<String> actual = felineSpy.getFood("jjj");
    }
    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи", felineSpy.getFamily());
    }

    @Test
    public void getKittensTestWithoutParams() {
        assertEquals(1,felineSpy.getKittens());
    }
    @Test
    public void getKittensTestWithParams() {

        assertEquals(9,felineSpy.getKittens(9));
    }
}
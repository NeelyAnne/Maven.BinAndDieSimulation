package com.github.zipcodewilmington.dietest;

import com.github.zipcodewilmington.Die;
import org.junit.Assert;
import org.junit.Test;

public class NullaryConstructorTest {
    @Test
    public void test1() {
        // given
        Integer expectedFaceValue = null;
        Integer expectedNumberOfFaces = 6;

        // when
        Die die = new Die();
        Integer actualFaceValue = die.getCurrentFaceValue();
        Integer actualNumberOfFaces = die.getNumberOfFaces();

        // then
        Assert.assertEquals(expectedFaceValue, actualFaceValue);
        Assert.assertEquals(expectedNumberOfFaces, actualNumberOfFaces);
    }
}

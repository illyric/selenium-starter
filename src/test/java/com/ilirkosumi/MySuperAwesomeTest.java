package com.ilirkosumi;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MySuperAwesomeTest {

    @Test
    public void mySupperUselessTest() {
        Main main = new Main();
        assertThat(main.getMessage(), is("Hello WebDriver"));
    }

}

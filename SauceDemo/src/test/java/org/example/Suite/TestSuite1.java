package org.example.Suite;

import org.example.Runners.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        StepRunner.class,

})

public class TestSuite1 {
}

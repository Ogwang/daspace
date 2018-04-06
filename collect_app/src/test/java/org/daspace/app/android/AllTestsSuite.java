package org.daspace.app.android;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.daspace.app.android.activities.MainActivityTest;
import org.daspace.app.android.utilities.CompressionTest;
import org.daspace.app.android.utilities.PermissionsTest;
import org.daspace.app.android.utilities.TextUtilsTest;

/**
 * Suite for running all unit tests from one place
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        //Name of tests which are going to be run by suite
        MainActivityTest.class,
        PermissionsTest.class,
        TextUtilsTest.class,
        CompressionTest.class
})

public class AllTestsSuite {
    // the class remains empty,
    // used only as a holder for the above annotations
}

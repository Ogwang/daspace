package org.daspace.app.android.externalintents;

import android.support.test.filters.Suppress;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.daspace.app.android.activities.MainMenuActivity;

import java.io.IOException;

import static org.daspace.app.android.externalintents.ExportedActivitiesUtils.testDirectories;

@Suppress
// Frequent failures: https://github.com/opendatakit/collect/issues/796
public class MainMenuActivityTest {

    @Rule
    public ActivityTestRule<MainMenuActivity> mainMenuActivityRule =
            new ExportedActivityTestRule<>(MainMenuActivity.class);

    @Test
    public void mainMenuActivityMakesDirsTest() throws IOException {
        testDirectories();
    }

}

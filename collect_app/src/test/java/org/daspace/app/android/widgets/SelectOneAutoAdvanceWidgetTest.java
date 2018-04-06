package org.daspace.app.android.widgets;

import android.support.annotation.NonNull;

import org.daspace.app.android.widgets.base.GeneralSelectOneWidgetTest;
import org.robolectric.RuntimeEnvironment;

/**
 * @author James Knight
 */
public class SelectOneAutoAdvanceWidgetTest
        extends GeneralSelectOneWidgetTest<SelectOneAutoAdvanceWidget> {

    @NonNull
    @Override
    public SelectOneAutoAdvanceWidget createWidget() {
        return new SelectOneAutoAdvanceWidget(RuntimeEnvironment.application, formEntryPrompt);
    }
}
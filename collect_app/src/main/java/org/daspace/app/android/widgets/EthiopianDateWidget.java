/*
 * Copyright 2017 Nafundi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.daspace.app.android.widgets;

import android.content.Context;
import android.view.View;

import org.javarosa.form.api.FormEntryPrompt;
import org.daspace.app.android.activities.FormEntryActivity;
import org.daspace.app.android.fragments.dialogs.EthiopianDatePickerDialog;
import org.daspace.app.android.utilities.DateTimeUtils;

import java.util.Date;

import static org.daspace.app.android.fragments.dialogs.CustomDatePickerDialog.DATE_PICKER_DIALOG;

/**
 * @author Grzegorz Orczykowski (gorczykowski@soldevelo.com)
 */
public class EthiopianDateWidget extends AbstractDateWidget {

    public EthiopianDateWidget(Context context, FormEntryPrompt prompt) {
        super(context, prompt);
    }

    @Override
    protected void createWidget() {
        super.createWidget();
        dateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });
    }

    @Override
    protected void setDateLabel() {
        isNullAnswer = false;
        dateTextView.setText(DateTimeUtils.getDateTimeLabel((Date) getAnswer().getValue(), datePickerDetails, false, getContext()));
    }

    protected void showDatePickerDialog() {
        EthiopianDatePickerDialog ethiopianDatePickerDialog = EthiopianDatePickerDialog.newInstance(getFormEntryPrompt().getIndex(), date, datePickerDetails);
        ethiopianDatePickerDialog.show(((FormEntryActivity) getContext()).getSupportFragmentManager(), DATE_PICKER_DIALOG);
    }
}
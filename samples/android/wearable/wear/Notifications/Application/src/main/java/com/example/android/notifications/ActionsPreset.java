/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.notifications;

import android.content.Context;
import android.support.v4.app.NotificationCompat;

/**
 * Base class for notification actions presets.
 */
public abstract class ActionsPreset extends NamedPreset {
    public ActionsPreset(int nameResId) {
        super(nameResId);
    }

    /** Apply the priority to a notification builder */
    public abstract void apply(Context context, NotificationCompat.Builder builder,
            NotificationCompat.WearableExtender wearableOptions);
}

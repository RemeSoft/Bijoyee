package com.remesoft.bijoyee.Helper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ActivitySwitcher {
    public static void switchActivity(Activity currentActivity, Class<?> targetActivity) {
        Intent intent = new Intent(currentActivity, targetActivity);
        currentActivity.startActivity(intent);
    }
    public static void switchActivity(Activity currentActivity, Class<?> targetActivity, Bundle data) {
        Intent intent = new Intent(currentActivity, targetActivity);
        if (data != null) intent.putExtras(data);
        currentActivity.startActivity(intent);
    }
}

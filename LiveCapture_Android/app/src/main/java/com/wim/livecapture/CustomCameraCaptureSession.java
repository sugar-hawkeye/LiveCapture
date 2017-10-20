package com.wim.livecapture;

import android.hardware.camera2.CameraCaptureSession;
import android.support.annotation.NonNull;

/**
 * Created by wim on 2017/10/20.
 */

public class CustomCameraCaptureSession extends CameraCaptureSession.StateCallback {

    @Override
    public void onConfigured(@NonNull CameraCaptureSession session) {

    }

    @Override
    public void onConfigureFailed(@NonNull CameraCaptureSession session) {

    }
}

package com.wim.livecapture;

import android.hardware.camera2.CameraDevice;
import android.support.annotation.IntDef;
import android.support.annotation.NonNull;

/**
 * Created by wim on 2017/10/20.
 */

public class CustomDeviceStateCallback extends CameraDevice.StateCallback{



    private void createCameraCaptureSession(CameraDevice camera) {

    }

    @Override
    public void onOpened(@NonNull CameraDevice camera) {
        createCameraCaptureSession(camera);
    }

    @Override
    public void onDisconnected(@NonNull CameraDevice camera) {

    }

    @Override
    public void onError(@NonNull CameraDevice camera, int error) {

    }

}

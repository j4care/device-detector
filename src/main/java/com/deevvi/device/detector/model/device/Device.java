package com.deevvi.device.detector.model.device;

import java.util.List;
import com.deevvi.device.detector.model.Model;

/**
 * Model for camera parser.
 */
public class Device extends BasicDeviceWithModels {

    private final String model;

    /**
     * Constructor.
     */
    public Device(String rawRegex, String device, String model, String brand, List<Model> models) {

        super(rawRegex, device, brand, models);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

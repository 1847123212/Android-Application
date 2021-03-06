package io.github.openthermalcamera.Palette;

import android.graphics.Color;

public class WhiteHotPalette extends ThermalPalette {


    @Override
    public double getDefaultMinTemperature() {
        return 5;
    }

    @Override
    public double getDefaultMaxTemperature() {
        return 45;
    }

    @Override
    public int temperatureToColor(double temperature, double minTemperature, double maxTemperature) {

        double tempPercent = (temperature - minTemperature) / (maxTemperature - minTemperature);
        if(tempPercent > 1.0) tempPercent = 1.0;
        else if(tempPercent < 0.0) tempPercent = 0.0;

        int whiteLevel = (int) Math.round(tempPercent * 255);

        return Color.argb(255, whiteLevel, whiteLevel, whiteLevel);

    }
}

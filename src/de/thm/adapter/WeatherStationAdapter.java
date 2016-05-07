package de.thm.adapter;

import java.text.DecimalFormat;

/**
 * Created by Nils on 06.05.2016.
 */
public class WeatherStationAdapter implements WeatherStation {
    private WeirdWeatherStation wwsWeirdWeatherStation;

    public WeatherStationAdapter(WeirdWeatherStation wwsWeirdWeatherStation){
        this.wwsWeirdWeatherStation = wwsWeirdWeatherStation;
    }

    public WeirdWeatherStation getWwsWeirdWeatherStation() {
        return wwsWeirdWeatherStation;
    }

    public void setWwsWeirdWeatherStation(WeirdWeatherStation wwsWeirdWeatherStation) {
        this.wwsWeirdWeatherStation = wwsWeirdWeatherStation;
    }

    /**
     * @return Returns the measured temperature in &deg;C
     * *
     */
    @Override
    public double getTemperature() {
        wwsWeirdWeatherStation.startMeasure();
        return (wwsWeirdWeatherStation.getTemperature()-32)/1.8;
    }

    /**
     * @return Returns the measured amount of rainfall in liters per square-meter
     */
    @Override
    public double getRainfallAmount() {
        wwsWeirdWeatherStation.startMeasure();
        return wwsWeirdWeatherStation.getRainfallAmount()*1.75289575289575;
    }

    /**
     * @return Returns the measured velocity of wind in kilometers per hour
     */
    @Override
    public double getWindVelocity() {
        wwsWeirdWeatherStation.startMeasure();
        return wwsWeirdWeatherStation.getWindVelocity()*1.60934;
    }

    /**
     * @return Returns the measured pessure of air in bar
     */
    @Override
    public double getAirPressure() {
        wwsWeirdWeatherStation.startMeasure();
        return wwsWeirdWeatherStation.getAirPressure()/14.503773773;
    }

    /**
     * @return Returns the geographical height above normal-null ocean level in meters
     */
    @Override
    public double getHeightAboveNN() {
        wwsWeirdWeatherStation.startMeasure();
        return wwsWeirdWeatherStation.getHeightAboveNN()/3.28084;
    }

    /**
     * @return Returns the geographical location as string
     */
    @Override
    public String getLocation() {
        wwsWeirdWeatherStation.startMeasure();
        return wwsWeirdWeatherStation.getLocation();
    }

    @Override
    public String toString(){
        DecimalFormat dfFormat = new DecimalFormat("#.##");
        return (String)(getLocation() + " (" + dfFormat.format(getHeightAboveNN()) + "m) " + " : " + dfFormat.format(getTemperature()) + " °C " + dfFormat.format(getAirPressure()) + " bar " + dfFormat.format(getRainfallAmount()) + " l/qm " + dfFormat.format(getWindVelocity()) + " km/h");
    }
}

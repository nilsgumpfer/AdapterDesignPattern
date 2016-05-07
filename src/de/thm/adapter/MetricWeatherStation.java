package de.thm.adapter;

/**
 * Created by Nils on 06.05.2016.
 */
public class MetricWeatherStation implements WeatherStation {

    private double      dTemperature_dc;
    private double      dRainfall_lpsqm;
    private double      dWindVelocity_kmph;
    private double      dAirPressure_bar;
    private double      dHeightAboveNN_m;
    private String      sLocation;

    public MetricWeatherStation(double dTemperature_dc, double dRainfall_lpsqm, double dWindVelocity_kmph, double dAirPressure_bar, double dHeightAboveNN_m, String sLocation){
        this.dTemperature_dc    = dTemperature_dc;
        this.dRainfall_lpsqm    = dRainfall_lpsqm;
        this.dWindVelocity_kmph = dWindVelocity_kmph;
        this.dAirPressure_bar   = dAirPressure_bar;
        this.dHeightAboveNN_m   = dHeightAboveNN_m;
        this.sLocation          = sLocation;
    }

    /**
     * @return Returns the measured temperature in &deg;C
     * *
     */
    @Override
    public double getTemperature() {
        return dTemperature_dc;
    }

    /**
     * @return Returns the measured amount of rainfall in liters per square-meter
     */
    @Override
    public double getRainfallAmount() {
        return dRainfall_lpsqm;
    }

    /**
     * @return Returns the measured velocity of wind in kilometers per hour
     */
    @Override
    public double getWindVelocity() {
        return dWindVelocity_kmph;
    }

    /**
     * @return Returns the measured pessure of air in bar
     */
    @Override
    public double getAirPressure() {
        return dAirPressure_bar;
    }

    /**
     * @return Returns the geographical height above normal-null ocean level in meters
     */
    @Override
    public double getHeightAboveNN() {
        return dHeightAboveNN_m;
    }

    /**
     * @return Returns the geographical location as string
     */
    @Override
    public String getLocation() {
        return sLocation;
    }

    @Override
    public String toString(){
        return (String)(getLocation() + " (" + getHeightAboveNN() + "m) " +  " : " + getTemperature() + " °C " + getAirPressure() + " bar " + getRainfallAmount() + " l/qm " + getWindVelocity() + " km/h");
    }
}

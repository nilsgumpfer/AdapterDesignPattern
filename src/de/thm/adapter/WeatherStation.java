package de.thm.adapter;

/**
 * Created by Nils on 06.05.2016.
 */
public interface WeatherStation {

    /**
     * @return Returns the measured temperature in &deg;C
     * * */
    public double getTemperature();

    /**
     * @return Returns the measured amount of rainfall in liters per square-meter
     */
    public double getRainfallAmount();

    /**
     * @return Returns the measured velocity of wind in kilometers per hour
     */
    public double getWindVelocity();

    /**
     * @return Returns the measured pessure of air in bar
     */
    public double getAirPressure();

    /**
     * @return Returns the geographical height above normal-null ocean level in meters
     */
    public double getHeightAboveNN();

    /**
     * @return Returns the geographical location as string
     */
    public String getLocation();

    @Override
    public String toString();

}

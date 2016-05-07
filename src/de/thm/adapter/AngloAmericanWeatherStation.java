package de.thm.adapter;

/**
 * Created by Nils on 06.05.2016.
 */
public class AngloAmericanWeatherStation implements WeirdWeatherStation {

    private double      dTemperature_dft;
    private double      dRainfall_gpsqy;
    private double      dWindVelocity_mph;
    private double      dAirPressure_psi;
    private double      dHeightAboveNN_ft;
    private String      sLocation;
    private double      dTemperature_dft_tmp;
    private double      dRainfall_gpsqy_tmp;
    private double      dWindVelocity_mph_tmp;
    private double      dAirPressure_psi_tmp;
    private double      dHeightAboveNN_ft_tmp;
    private String      sLocation_tmp;

    public AngloAmericanWeatherStation(double dTemperature_dft, double dRainfall_gpsqy, double dWindVelocity_mph, double dAirPressure_psi, double dHeightAboveNN_ft, String sLocation){
        this.dTemperature_dft_tmp    = dTemperature_dft;
        this.dRainfall_gpsqy_tmp     = dRainfall_gpsqy;
        this.dWindVelocity_mph_tmp   = dWindVelocity_mph;
        this.dAirPressure_psi_tmp    = dAirPressure_psi;
        this.dHeightAboveNN_ft_tmp   = dHeightAboveNN_ft;
        this.sLocation_tmp           = sLocation;
    }

    /**
     * Measure has to be initiated before data is ready to read
     * *
     */
    @Override
    public void startMeasure() {
        dTemperature_dft    = dTemperature_dft_tmp;
        dRainfall_gpsqy     = dRainfall_gpsqy_tmp;
        dWindVelocity_mph   = dWindVelocity_mph_tmp;
        dAirPressure_psi    = dAirPressure_psi_tmp;
        dHeightAboveNN_ft   = dHeightAboveNN_ft_tmp;
        sLocation           = sLocation_tmp;
    }

    /**
     * @return Returns the measured temperature in &deg;F
     * *
     */
    @Override
    public double getTemperature() {
        return dTemperature_dft;
    }

    /**
     * @return Returns the measured amount of rainfall in gallons per square-yard
     */
    @Override
    public double getRainfallAmount() {
        return dRainfall_gpsqy;
    }

    /**
     * @return Returns the measured velocity of wind in miles per hour
     */
    @Override
    public double getWindVelocity() {
        return dWindVelocity_mph;
    }

    /**
     * @return Returns the measured pessure of air in pound-force per square-inch
     */
    @Override
    public double getAirPressure() {
        return dAirPressure_psi;
    }

    /**
     * @return Returns the geographical height above normal-null ocean level in feet
     */
    @Override
    public double getHeightAboveNN() {
        return dHeightAboveNN_ft;
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
        return (String)(getLocation() + " (" + getHeightAboveNN() + "ft) " + " : " + getTemperature() + " °F " + getAirPressure() + " psi " + getRainfallAmount() + " gal p.sqft " + getWindVelocity() + " mph");
    }
}

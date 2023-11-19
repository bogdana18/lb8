package org.Usenko;

import java.util.Date;
import lombok.Value;

import java.util.Date;

@Value
public class WeatherMeasurement {
    Date date;
    int locationId;
    double temperature;
    double humidity;
    double precipitation;
    double windSpeed;
}


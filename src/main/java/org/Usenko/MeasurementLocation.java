package org.Usenko;

import java.util.Objects;

import lombok.Value;

@Value
public class MeasurementLocation {
    int locationId;
    double latitude;
    double longitude;
    String name;
}
package com.openxc.measurements;

import com.openxc.units.Degree;
import com.openxc.util.Range;

/**
 * The Latitude is the current latitude of the vehicle in degrees according to
 * GPS.
 */
public class Heading extends BaseMeasurement<Degree> {
    private final static Range<Degree> RANGE = new Range<Degree>(
            new Degree(0), new Degree(360));
    public final static String ID = "heading";

    public Heading(Degree value) {
        super(value, RANGE);
    }

    public Heading(Number value) {
        this(new Degree(value));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}

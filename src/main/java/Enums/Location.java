package Enums;

public enum Location {

    AKLLocationLatitude(-36.8485),
    AKLLocationLongitude(174.7635),
    WLGLocationLatitude(-41.2866),
    WLGLocationLongitude(174.7756);

    final double Value;

    Location(double value) {

        this.Value= value;
    }
    public double getValue() {
        return Value;
    }
}

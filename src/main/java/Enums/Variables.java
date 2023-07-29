package Enums;

public enum Variables {

    HourlyParam("temperature_2m"),
    DailyParam("daily=weathercode,sunrise");

    final String variables;

    Variables(String value) {
        this.variables = value;
    }

    public String getVariables() {
        return variables;
    }
}

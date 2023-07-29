package Enums;

public enum ErrorMessages {

    WITHOUTTIMEZONE_ERRORMESSAGE("Timezone is required");

    final String Value;

    ErrorMessages(String value) {

        this.Value= value;
    }
    public String getValue() {
        return Value;
    }
}

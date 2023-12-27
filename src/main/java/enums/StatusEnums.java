package enums;

public enum StatusEnums {
    AVAILABLE("available"),
    PENDING("pending"),
    SOLD("sold");

    public final String stringValue;

    StatusEnums(String stringValue) {
        this.stringValue = stringValue;
    }
}

package PraticeExamples01;

public enum ItemsTypes {

    FOOD(1),
    CLOTHING(2),
    HEALTH_AND_WELLNESS(3),
    CULTURE(4);

    private final int code;

    ItemsTypes(int code) {
        this.code = code;
    }

    public int getCode() { return code; }

    public static ItemsTypes fromCode(int code) {
        for (ItemsTypes type : ItemsTypes.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }
}

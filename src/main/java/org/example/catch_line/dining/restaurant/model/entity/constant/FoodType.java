package org.example.catch_line.dining.restaurant.model.entity.constant;

public enum FoodType {

    KOREAN("한식"),
    CHINESE("중식"),
    JAPANESE("일식"),
    WESTERN("양식");

    private final String description;

    FoodType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static FoodType fromKoreanName(String description) {
        for (FoodType type : values()) {
            if (type.getDescription().equals(description)) {
                return type;
            }
        }
        throw new IllegalArgumentException("FoodType에 없는 값입니다 : " + description);
    }
}
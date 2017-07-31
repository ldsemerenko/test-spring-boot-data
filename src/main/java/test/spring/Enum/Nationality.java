package test.spring.Enum;

public enum Nationality{
    UA("UA"),
    GB("GB"),
    CA("CA"),
    BY("BY"),
    HN("HN");


    String value;

    Nationality (String name) {
    this.value = name;
    }

    @Override
    public String toString() {
        return value;
    }
}
package Model;

public enum Position {
    MANAGER("Manager"),
    DEVELOPER("Developer"),
    PRODUCT_OWNER("Product Owner"),
    HR("HR");

    public final String title;

    Position(String title) {
        this.title = title;
    }
}

package Menu;

public class SingleMenu {
    private String name;    // 메뉴명
    private int price;      // 1개의 가격
    private boolean isSet;  // 세트 여부
    private int stack;      // 총 개수

    public SingleMenu(String name, int price, boolean isSet, int stack) {
        this.name = name;
        this.price = price;
        this.isSet = isSet;
        this.stack = stack;
    }



}

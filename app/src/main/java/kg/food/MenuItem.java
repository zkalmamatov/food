package kg.food;

public class MenuItem {
    private int imageRes;
    private String name;
    private String price;

    public MenuItem(int imageRes, String name, String price) {
        this.imageRes = imageRes;
        this.name = name;
        this.price = price;
    }
    public  String getName() {
        return name;
    }

    public String getPrice() {
        return  price;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }
}

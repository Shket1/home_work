package lesson8.advansedTask;

import java.util.Arrays;

public class Brand {
    private String nameBrand;
    private Shop[] shops;

    public Brand(String nameBrand) {
        this.nameBrand = nameBrand;
    }
    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }
    public void addNewShops(Shop[] shops) {
        this.shops = shops.clone();
    }
    public Shop[] getShops() {
        return shops;
    }
    public Shop getShop(int i) {
        if (shops.length > 0) {
            return shops[i];
        } else {
            return null;
        }
    }
}

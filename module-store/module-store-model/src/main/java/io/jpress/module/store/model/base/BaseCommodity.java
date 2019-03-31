package io.jpress.module.store.model.base;

public class BaseCommodity<M extends BaseCommodity<M>> extends BaseEntity<M>{

    public void setBrandId(Long brandId) {
        set("brand_id", brandId);
    }

    public Long getBrandId() {
        return getLong("brand_id");
    }


    public void setName(String name) {
        set("name", name);
    }

    public String getName() {
        return getStr("name");
    }


    public void setBrandName(Long price) {
        set("price", price);
    }

    public Long getPrice() {
        return getLong("price");
    }


    public void setDetails(String details) {
        set("details", details);
    }

    public String getDetails() {
        return getStr("details");
    }


    public void setStock(Long stock) {
        set("stock", stock);
    }

    public Long getStock() {
        return getLong("stock");
    }




    public void setImageUrl(String imageUrl) {
        set("imageUrl", imageUrl);
    }

    public String getImageUrl() {
        return getStr("imageUrl");
    }

    public void setStatus(String status) {
        set("status", status);
    }

    public String getStatus() {
        return getStr("status");
    }
}

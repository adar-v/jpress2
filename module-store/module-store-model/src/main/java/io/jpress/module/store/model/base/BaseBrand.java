package io.jpress.module.store.model.base;

/**
 * 品牌属性
 * @author jie
 * @date
 * @param <M>
 */
public class BaseBrand<M extends BaseBrand<M>> extends BaseEntity<M> {

    public void setBrandName(String brandName) {
        set("brandName", brandName);
    }

    public String getBrandName() {
        return getStr("brandName");
    }


    public void setBrandLogo(String brandLogo) {
        set("brandLogo", brandLogo);
    }

    public String getBrandLogo() {
        return getStr("brandLogo");
    }


    public void setBrandDetail(String detail) {
        set("detail", detail);
    }

    public String getBrandDetail() {
        return getStr("details");
    }









}

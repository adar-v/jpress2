package io.jpress.module.store.model.base;

public class BaseSpu<M extends BaseSpu<M>> extends BaseEntity<M> {

    public void setSpuName(Long spuName) { set("supId",spuName);}

    public Long getSpuName(){ return getLong("spuName"); }

    public void setCategoryId(Long categoryId) { set("categoryId",categoryId);}

    public Long getCategoryId(){ return getLong("categoryId"); }

    public void setBrandId(Long brandId) { set("brandId",brandId);}

    public Long getBrandId(){ return getLong("brandId"); }



}

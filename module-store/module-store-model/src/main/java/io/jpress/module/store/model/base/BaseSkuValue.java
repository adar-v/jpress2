package io.jpress.module.store.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jboot.db.model.JbootModel;

public class BaseSkuValue<M extends BaseSkuValue<M>> extends JbootModel<M> implements IBean {

    public void setSkuId(Long skuId) {
        set("skuId", skuId);
    }

    public Long getSkuId() {
        return getLong("skuId");
    }

    public void setSpecification(Long specification) {
        set("specification", specification);
    }

    public Long getSpecification() {
        return getLong("specification");
    }




}

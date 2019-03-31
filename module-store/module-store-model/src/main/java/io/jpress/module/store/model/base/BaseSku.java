package io.jpress.module.store.model.base;

/**
 * sku 实体类
 * @author jie
 * @date 2019年3月31日
 * @param <M>
 */
public class BaseSku<M extends BaseSku<M>> extends BaseEntity<M> {
    public void setSpuId(Long spuId) {
        set("spuId", spuId);
    }

    public Long getSupId() {
        return getLong("spuId");
    }

    public void setSkuKey(Long skuKey) {
        set("skuKey", skuKey);
    }

    public Long getSkuKey() {
        return getLong("skuKey");
    }

}

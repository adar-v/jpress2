package io.jpress.module.store.model.base;

/**
 * 规格参数模板
 * @author jie
 * @date 2019年3月31日
 * @param <M>
 */
public class BaseSpecification<M extends BaseSpecification<M>> extends BaseEntity<M>{

    public void  setSpecification(String specification){
        set("specification",specification);
    }
    public String getSpecification(){ return getStr("specification");}
}

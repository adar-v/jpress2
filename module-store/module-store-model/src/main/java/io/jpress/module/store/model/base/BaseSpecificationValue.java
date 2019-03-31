package io.jpress.module.store.model.base;

/**
 * 规格参数值
 * @author jie
 * @dete 2019年3月31日
 * @param <M>
 */
public class BaseSpecificationValue<M extends BaseSpecificationValue<M>> extends BaseEntity<M>{
    public void  setSpecificationId(String specificationId){
        set("specificationId",specificationId);
    }
    public String getSpecification(){ return getStr("SpecificationId");}

    public void  setSpecificationValue(String specificationValue){
        set("specificationValue",specificationValue);
    }
    public String getSpecificationValue(){ return getStr("specificationValue");}
}

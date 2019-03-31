package io.jpress.module.store.model.base;

/**
 * BaseCassification
 * @author jie
 * @date 2019年3月28日
 * @param <M>
 */
public class BaseCassification<M extends BaseCassification<M>> extends BaseEntity<M> {

    public void setPid(Long pid) {
        set("pid", pid);
    }

    public Integer getParentId() {
        return getInt("pid");
    }

    public void setName(String name) {
        set("name", name);
    }


    public String getName() {
        return getStr("name");
    }

}

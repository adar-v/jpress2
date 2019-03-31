package io.jpress.module.store.model.base;

/**
 * 分类实体类
 * @author jie
 * @date 2019年3月31日
 * @param <M>
 */
public class BaseCategory<M extends BaseCategory<M>> extends BaseEntity<M>{
    public void setPid(Long pid) {
        set("pid", pid);
    }

    public Long getParentId() {
        return getLong("pid");
    }

    public void setCategoryName(String categoryName) {
        set("categoryName", categoryName);
    }


    public String getCategoryName() {
        return getStr("categoryName");
    }

}

package io.jpress.module.store.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jboot.db.model.JbootModel;

import java.util.Date;

/**
 *通用属性
 * @author jie
 * @date 2019年3月26日
 * @param <M>
 */
public abstract class BaseEntity<M extends BaseEntity<M>> extends JbootModel<M> implements IBean {
    public void setId(Long id) {
        set("id", id);
    }

    public Long getId() {
        return getLong("id");
    }

    public void setCreatedAt(String key) {
        set("created_at", key);
    }

    public Date getCreatedAt() { // createdAt  created_at
        return getDate("created_at");
    }


    public void setUpdatedAt(String key) {
        set("updated_at", key);
    }

    public Date getUpdatedAt() { // updatedAt updated_at
        return getDate("updated_at");

    }
}

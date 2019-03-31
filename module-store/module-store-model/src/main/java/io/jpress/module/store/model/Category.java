package io.jpress.module.store.model;

import io.jboot.db.annotation.Table;
import io.jpress.module.store.model.base.BaseCategory;

@Table(tableName = "tb_category" , primaryKey = "id")
public class Category extends BaseCategory<Category> {
}

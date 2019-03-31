package io.jpress.module.store.model;


import io.jboot.db.annotation.Table;
import io.jpress.module.store.model.base.BaseBrand;

@Table(tableName = "tb_brands" ,primaryKey = "id")
public class Brand extends BaseBrand<Brand> {
}

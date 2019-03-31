package io.jpress.module.store.model;

import io.jboot.db.annotation.Table;
import io.jpress.module.store.model.base.BaseCommodity;

@Table(tableName = "product", primaryKey = "id")
public class Commodity extends BaseCommodity<Commodity> {
}

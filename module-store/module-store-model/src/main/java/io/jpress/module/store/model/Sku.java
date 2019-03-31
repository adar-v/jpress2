package io.jpress.module.store.model;

import io.jboot.db.annotation.Table;
import io.jpress.module.store.model.base.BaseSku;

@Table(tableName = "tb_sku", primaryKey = "id")
public class Sku  extends BaseSku<Sku> {
}

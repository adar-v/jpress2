package io.jpress.module.store.model;

import io.jboot.db.annotation.Table;
import io.jpress.module.store.model.base.BaseSpu;

@Table(tableName = "tb_spu", primaryKey = "id")
public class Spu extends BaseSpu<Spu> {
}

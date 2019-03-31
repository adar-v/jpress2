package io.jpress.module.store.model;

import io.jboot.db.annotation.Table;
import io.jpress.module.store.model.base.BaseSpecification;

@Table(tableName = "tb_specification" , primaryKey = "id")
public class Specification extends BaseSpecification<Specification> {
}

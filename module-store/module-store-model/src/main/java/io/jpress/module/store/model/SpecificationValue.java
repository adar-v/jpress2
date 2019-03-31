package io.jpress.module.store.model;

import io.jboot.db.annotation.Table;
import io.jpress.module.store.model.base.BaseSpecificationValue;

@Table(tableName = "tb_specification_value" , primaryKey = "id")
public class SpecificationValue extends BaseSpecificationValue<SpecificationValue> {
}

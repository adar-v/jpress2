package io.jpress.module.store;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import io.jboot.service.JbootServiceBase;
import io.jpress.commons.utils.SqlUtils;
import io.jpress.module.store.model.Brand;

import java.util.List;


/**
 * brand Service
 * @author jie
 * @date 2019年3月26日
 */
public class StoreServiceprovider extends JbootServiceBase<Brand> {
    public boolean deleteByIds(Object[] ids) {
        return Db.update("delete from brands where id in  " + SqlUtils.buildInSqlPara(ids)) > 0;
    }

    public void pageByColumns() {
    }

    public Boolean findByName(String brandName,Integer id) {
        StringBuilder sql = new StringBuilder("select id from tb_brands where name=");
        if (id!=null ){
            sql.append(brandName.trim()+" and id<>"+ id);

        }else {
            sql.append(brandName.trim());
        }
        return Db.findFirst(String.valueOf(sql)) == null;
    }

    public List<Record> finByTitle(String title) {
        return Db.find("select * from tb_brands where name like '%" + title + "%'");
    }

    public List<Record> finAllBrand(String title) {
        StringBuilder sql = new StringBuilder("select * from tb_brands");
        if (title!=null){
            sql.append(" where name like '%" + title + "%'");

        }
        return Db.find(String.valueOf(sql));
    }
}

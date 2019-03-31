package io.jpress.module.store;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import io.jboot.service.JbootServiceBase;
import io.jpress.module.store.model.Commodity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * commodity
 * @author jie
 * @date 2019年3月27日
 */
public class CommodityService extends JbootServiceBase<Commodity> {

    public Page<Record>  findAllOrTitle(String title) {

        if (null != title){
            return Db.paginate(1, 10, "select *", "where name like '%?%'", title);

        }

        return Db.paginate(1,10,"select * ","from product");
    }

    public Boolean findByCommodity(Integer brandId) {
        Record first = Db.findFirst("select * from product where brand_id=" + brandId);
        return first!=null;

    }




    public Map<String, Object> paginateByAll(int page, int pageSize, String title) {
        Map<String,Object> pageAll= new HashMap<>(16);
        if (null != title){

         pageAll.put("Page", DAO.paginate(page, pageSize, "select *", "from product where name like '%" + title + "%'"));
         pageAll.put("Count",Db.queryInt("select count(*) from product where name like '%" + title +"%'"));


        }else {

            pageAll.put("Page", DAO.paginate(page, pageSize, "select * ", "from product"));
            pageAll.put("Count", Db.queryInt("select count(*) from product"));
        }

        return pageAll;
    }
}

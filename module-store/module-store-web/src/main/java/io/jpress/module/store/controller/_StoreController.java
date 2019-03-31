package io.jpress.module.store.controller;


import com.jfinal.aop.Inject;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.template.stat.ast.If;
import io.jboot.web.controller.annotation.RequestMapping;
import io.jpress.JPressConsts;
import io.jpress.core.menu.annotation.AdminMenu;
import io.jpress.module.store.CommodityService;
import io.jpress.module.store.StoreServiceprovider;
import io.jpress.module.store.model.Commodity;
import io.jpress.web.base.AdminControllerBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Store Menu
 * @author jie
 * @date 2019年3月26日
 */
@RequestMapping(value = "/admin/store" ,viewPath = JPressConsts.DEFAULT_ADMIN_VIEW)
public class _StoreController  extends AdminControllerBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(_StoreController.class);


    @Inject
    private StoreServiceprovider storeServiceprovider;

    @Inject
    private CommodityService commodityService;





    @AdminMenu(text = "商品列表",groupId = "store" ,order =0)
    public void storeList(){
        LOGGER.info("Text===========================================");


//        String title = getPara(0) != null ? getPara(0) : getPara("title");
        String title = getPara("title")!=null ? getPara("title") : null;


        int pageNum = getPara("pageNum") == null ? 1 : Integer.valueOf(getPara("pageNum"));

        Map<String, Object> paginateByAll = commodityService.paginateByAll(pageNum, 2, title);

        int totalCount = (int) paginateByAll.get("Count");
        int totalPage = totalCount%2 == 0 ? totalCount/2 : totalCount/2 + 1;

        setAttr("totalCount",totalPage);
        setAttr("totalPage",totalCount/2);



        setAttr("Commoditys",paginateByAll.get("Page"));

        render("store/commodity_list.html");

    }



    @AdminMenu(text = "品牌管理",groupId = "store" ,order = 1)
    public void  index(){
        String title = getPara(0) != null ? getPara(0) : getPara("title");
        List<Record> brands = storeServiceprovider.finAllBrand(title);
        setAttr("brands",brands);

        render("store/brand_list.html");
    }


    @AdminMenu(text = "分类管理", groupId = "store" ,order = 2)
    public void sortManagement(){
        render("store/ordering.html");
    }

    @AdminMenu(text = "规格管理", groupId = "store" , order = 3)
    public void management(){

        render("store/Specification_list.html");
    }


}

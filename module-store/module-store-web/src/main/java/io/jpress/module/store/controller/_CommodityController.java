package io.jpress.module.store.controller;


import com.jfinal.aop.Inject;
import io.jboot.web.controller.annotation.RequestMapping;
import io.jpress.JPressConsts;
import io.jpress.module.store.CommodityService;
import io.jpress.module.store.StoreServiceprovider;
import io.jpress.module.store.model.Commodity;
import io.jpress.web.base.AdminControllerBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.Name;
import java.util.Date;

@RequestMapping(value = "/admin/commodity",viewPath = JPressConsts.DEFAULT_ADMIN_VIEW)

public class _CommodityController extends AdminControllerBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(_StoreController.class);

    @Inject
    private CommodityService commodityService;

    @Inject
    private StoreServiceprovider storeServiceprovider;

    public void newCommodity(){
        render("store/newCommodity.html");
    }



    public void doSave(){

        String commodityImage = getPara("commodity_image");
        String brand_id = getPara("brand_id");
        String commodityName = getPara("commodity_name");
        String commodityId = getPara("commodity_id");
        String commodityPrice = getPara("commodity_price");
        String commodityDetails = getPara("commodity_details");
        String commodityStock = getPara("commodity_stock");
        String commodityStatus = getPara("commodity_status");
        Commodity commodity = new Commodity().set("brand_id", brand_id).set("name", commodityName).set("price", commodityPrice).set("details", commodityDetails)
                .set("stock", commodityStock).set("status", commodityStatus).set("image_url", commodityImage).set("created_at", new Date())
                .set("updated_at", new Date());
        commodityService.save(commodity);
        renderOkJson();

    }


    public void update(){
        Integer commodityId = getParaToInt(0, 0);
        Commodity commodity = null;
        if (commodityId != null){
            commodity = commodityService.findById(commodityId);
        }
        setAttr("commodity",commodity);
        render("store/newCommodity.html");
    }


    public void delete(){
        LOGGER.debug("TEST");

        Integer commodityId = getParaToInt(0, 0);
        commodityService.deleteById(commodityId);
        redirect("/admin/store/storeList");
    }

}

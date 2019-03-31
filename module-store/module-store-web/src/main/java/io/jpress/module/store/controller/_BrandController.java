package io.jpress.module.store.controller;


import com.jfinal.aop.Inject;
import com.jfinal.kit.Ret;
import com.jfinal.plugin.activerecord.Record;
import io.jboot.web.controller.annotation.RequestMapping;
import io.jpress.JPressConsts;
import io.jpress.module.store.CommodityService;
import io.jpress.module.store.StoreServiceprovider;
import io.jpress.module.store.model.Brand;
import io.jpress.web.base.AdminControllerBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * brand write save
 * @author jie
 * @date 2019年3月26日
 */
@RequestMapping(value = "/admin/brand",viewPath = JPressConsts.DEFAULT_ADMIN_VIEW)
public class _BrandController extends AdminControllerBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(_StoreController.class);


    @Inject
    private StoreServiceprovider storeServiceprovider;

    @Inject
    private CommodityService commodityService;

    public void newBrand() {

        Brand brand = null;
        Integer brandId = getParaToInt(0, 0);
        if (null != brandId) {
            brand = storeServiceprovider.findById(brandId);
        }
        setAttr("brand", brand);
        render("store/newBrand.html");

    }


    public void doSave() {
        String brandLogo = getPara("brand_logo");
        String brandName = getPara("brand_name");
        String brandDescription = getPara("brand_description");
        Integer id = null;
        if (getPara("brand_id") != null) {
            id = Integer.valueOf(getPara("brand_id"));
        }

        Boolean byName = storeServiceprovider.findByName(brandName, id);
        if (byName) {
            if (id == null) {
                Brand brand = new Brand().set("name", brandName).set("image_url", brandLogo).set("description", brandDescription).
                        set("created_at", new Date()).set("updated_at", new Date());
                storeServiceprovider.save(brand);
                renderOkJson();
            } else {
                renderOkJson();
            }

        } else {
            renderError(404);
        }


    }

    public void delete() {
        LOGGER.debug("TEST");
        Integer brandId = getParaToInt(0, 0);
        Boolean isCommodity = commodityService.findByCommodity(brandId);
        if (isCommodity){
            render("store/error.html");

        }else {
            storeServiceprovider.deleteById(brandId);
            renderOkJson();
        }




    }


    public void doDelByIds() {
        Set<String> idsSet = getParaSet("ids");
        storeServiceprovider.deleteByIds(idsSet.toArray());
        renderOkJson();
    }


    public void finByTitle() {
        String title = getPara(0);
        List<Record> brands = storeServiceprovider.finByTitle(title);
        setAttr("brands", brands);
        render("store/brand_list.html");


    }
}

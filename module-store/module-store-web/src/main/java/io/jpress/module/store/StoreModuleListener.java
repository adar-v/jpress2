package io.jpress.module.store;

import com.jfinal.core.Controller;
import io.jpress.core.menu.MenuGroup;
import io.jpress.core.module.ModuleListener;

import java.util.List;

/**
 * insert Menu
 * @author jie
 * @date 2019年3月26日
 */
public class StoreModuleListener implements ModuleListener {
    @Override
    public String onRenderDashboardBox(Controller controller) {
        return null;
    }

    @Override
    public String onRenderToolsBox(Controller controller) {
        return null;
    }

    @Override
    public void onConfigAdminMenu(List<MenuGroup> adminMenus) {
        MenuGroup menuGroup = new MenuGroup();
        menuGroup.setId("store");
        menuGroup.setText("商品管理");
        menuGroup.setOrder(1);
        adminMenus.add(menuGroup);
    }

    @Override
    public void onConfigUcenterMenu(List<MenuGroup> ucenterMenus) {

    }
}

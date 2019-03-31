package io.jpress.module.store;

import io.jboot.service.JbootServiceBase;
import io.jpress.module.store.model.Category;

import java.util.List;

public class CategoryService extends JbootServiceBase<Category> {
    public void findByPid() {

    }

    public List<Category> findPid(Integer pid) {
        return DAO.find("select * from tb_category where pid=" + pid);

    }
}

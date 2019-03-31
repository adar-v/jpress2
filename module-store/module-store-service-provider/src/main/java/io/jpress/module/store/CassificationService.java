package io.jpress.module.store;

import io.jboot.service.JbootServiceBase;
import io.jpress.module.store.model.Cassification;

import java.util.List;

/**
 * CRUD cassification
 * @author jie
 * @date 2019年3月28日
 *
 */
public class CassificationService extends JbootServiceBase<Cassification> {
    public void findByPid() {

    }

    public List<Cassification> findPid(Integer pid) {
        return DAO.find("select * from tb_category where pid=" + pid);

    }
}

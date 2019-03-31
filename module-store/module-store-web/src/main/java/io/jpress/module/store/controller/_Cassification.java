package io.jpress.module.store.controller;

import com.jfinal.aop.Inject;
import io.jboot.web.controller.annotation.RequestMapping;
import io.jpress.JPressConsts;
import io.jpress.module.store.CassificationService;
import io.jpress.module.store.CategoryService;
import io.jpress.module.store.dto.TypeDto;
import io.jpress.module.store.model.Cassification;
import io.jpress.web.base.AdminControllerBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RequestMapping(value = "/admin/tree" , viewPath = JPressConsts.DEFAULT_ADMIN_VIEW)
public class _Cassification extends AdminControllerBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(_Cassification.class);

    @Inject
    private CassificationService cassificationService;

    @Inject
    private CategoryService categoryService;

    public void findAllProductTypes(){
        List<Cassification> cassifications = cassificationService.findAll();

        List<TypeDto> types = cassifications.stream().map(this::buildTypeDto).collect(Collectors.toList());
        Map<Integer, TypeDto> map = types.stream().collect(Collectors.toMap(TypeDto::getId, dto -> dto));

        List<TypeDto> result = new ArrayList<>();
        types.forEach(dto -> {
            if (dto.getParentId() == 0) {
                result.add(dto);
                return;
            }
            TypeDto parent = map.get(dto.getParentId());

            if (parent != null) {

                parent.addChild(dto);
            }
        });

        renderJson(result);
    }

    private TypeDto buildTypeDto(Cassification c) {
        TypeDto dto = new TypeDto();
        dto.setText(c.getName());

        try {
            BeanUtils.copyProperties(c, dto);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dto;
    }

}

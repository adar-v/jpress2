package io.jpress.module.store.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TypeDto implements Serializable {
    private Integer id;
    private Integer parentId;
    private String text;
    private List<TypeDto> nodes = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<TypeDto> getNodes() {
        return nodes;
    }

    public void addChild(TypeDto dto) {

        nodes.add(dto);
    }
}

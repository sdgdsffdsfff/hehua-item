package com.hehua.item.model;

/**
 * @author YaoZhidong
 * @version 1.0
 * @created 14-8-20
 */
public class GenderView {
    private long id;
    private String name;

    public GenderView() {
    }

    public GenderView(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

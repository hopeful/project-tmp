package com.wkb.insurance.module;

import java.io.Serializable;

/**
 * Created by hujie on 2017/3/23.
 */
public class User implements Serializable {

    private Integer id;
    private String account;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

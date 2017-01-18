package com.lyl.mutidata.model;

/**
 * Created by zhou on 2016/12/29.
 */
public class Role {
    private Integer id;
    private String name;
    private String remark;
    private String status;

    public Integer getId() {
        return id;
    }

    public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setId(Integer id) {
        this.id = id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

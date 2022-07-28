package com.test.boot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author zj
 * @since 2022-06-01
 */
@ApiModel(value = "Info对象", description = "")
public class Info implements Serializable {

    private static final long serialVersionUID = 1L;

    private String boss;

    private String room;

    private String telephone;

    private String type1;

    private String worker;

    private String openid;

    private String company;

    private String photo;

    private String process;

    private String reason;

    private String success;

    private String date;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private LocalDateTime xdatetime;

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }
    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public LocalDateTime getXdatetime() {
        return xdatetime;
    }

    public void setXdatetime(LocalDateTime xdatetime) {
        this.xdatetime = xdatetime;
    }

    @Override
    public String toString() {
        return "Info{" +
            "boss=" + boss +
            ", room=" + room +
            ", telephone=" + telephone +
            ", type1=" + type1 +
            ", worker=" + worker +
            ", openid=" + openid +
            ", company=" + company +
            ", photo=" + photo +
            ", process=" + process +
            ", reason=" + reason +
            ", success=" + success +
            ", date=" + date +
            ", id=" + id +
            ", xdatetime=" + xdatetime +
        "}";
    }
}

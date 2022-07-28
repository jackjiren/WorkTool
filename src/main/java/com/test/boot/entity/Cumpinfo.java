package com.test.boot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author zj
 * @since 2022-07-07
 */
@ApiModel(value = "Cumpinfo对象", description = "")
public class Cumpinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String room;

    private String name;

    private String computertype;

    private String ip;

    private String ym;

    private String wg;

    private String size;

    private String num;

    private String nb;

    private String tel;

    private String gt;

    private String computerxlh;

    private String computerscrq;

    private String nbxlh;

    private String nbscrq;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getComputertype() {
        return computertype;
    }

    public void setComputertype(String computertype) {
        this.computertype = computertype;
    }
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getYm() {
        return ym;
    }

    public void setYm(String ym) {
        this.ym = ym;
    }
    public String getWg() {
        return wg;
    }

    public void setWg(String wg) {
        this.wg = wg;
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    public String getNb() {
        return nb;
    }

    public void setNb(String nb) {
        this.nb = nb;
    }
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }
    public String getComputerxlh() {
        return computerxlh;
    }

    public void setComputerxlh(String computerxlh) {
        this.computerxlh = computerxlh;
    }
    public String getComputerscrq() {
        return computerscrq;
    }

    public void setComputerscrq(String computerscrq) {
        this.computerscrq = computerscrq;
    }
    public String getNbxlh() {
        return nbxlh;
    }

    public void setNbxlh(String nbxlh) {
        this.nbxlh = nbxlh;
    }
    public String getNbscrq() {
        return nbscrq;
    }

    public void setNbscrq(String nbscrq) {
        this.nbscrq = nbscrq;
    }

    @Override
    public String toString() {
        return "Cumpinfo{" +
            "id=" + id +
            ", room=" + room +
            ", name=" + name +
            ", computertype=" + computertype +
            ", ip=" + ip +
            ", ym=" + ym +
            ", wg=" + wg +
            ", size=" + size +
            ", num=" + num +
            ", nb=" + nb +
            ", tel=" + tel +
            ", gt=" + gt +
            ", computerxlh=" + computerxlh +
            ", computerscrq=" + computerscrq +
            ", nbxlh=" + nbxlh +
            ", nbscrq=" + nbscrq +
        "}";
    }
}

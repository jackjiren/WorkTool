package com.test.boot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author zj
 * @since 2022-07-28
 */
@ApiModel(value = "Meeting对象", description = "")
public class Meeting implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("日期")
    private LocalDate datetime;

    @ApiModelProperty("备注")
    private String content;

    @ApiModelProperty("会议名称")
    private String meetingname;

    @ApiModelProperty("会议室 ")
    private String room;

    @ApiModelProperty("会议发起单位")
    private String initiator;

    @ApiModelProperty("时长")
    private String duration;

    @ApiModelProperty("会议形式")
    private String meetingform;

    @ApiModelProperty("联系人")
    private String name;

    @ApiModelProperty("视频使用单位")
    private String videouser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public LocalDate getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDate datetime) {
        this.datetime = datetime;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getMeetingname() {
        return meetingname;
    }

    public void setMeetingname(String meetingname) {
        this.meetingname = meetingname;
    }
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getMeetingform() {
        return meetingform;
    }

    public void setMeetingform(String meetingform) {
        this.meetingform = meetingform;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getVideouser() {
        return videouser;
    }

    public void setVideouser(String videouser) {
        this.videouser = videouser;
    }

    @Override
    public String toString() {
        return "Meeting{" +
            "id=" + id +
            ", datetime=" + datetime +
            ", content=" + content +
            ", meetingname=" + meetingname +
            ", room=" + room +
            ", initiator=" + initiator +
            ", duration=" + duration +
            ", meetingform=" + meetingform +
            ", name=" + name +
            ", videouser=" + videouser +
        "}";
    }
}

package me.wangcl.rs.vo;

import java.util.Date;

/**
 * 数据库表M_EVENT对应实体。
 *
 * @author wangcl
 */
public class Event extends ValueObject {
	private static final long serialVersionUID = 2991633615779435339L;

	private Integer eventId;
	private String eventCode;
	private String eventMsg;
	private Date createTime;
	private Date endTime;

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventCode() {
		return eventCode;
	}

	public void setEventMsg(String eventMsg) {
		this.eventMsg = eventMsg;
	}

	public String getEventMsg() {
		return eventMsg;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

}

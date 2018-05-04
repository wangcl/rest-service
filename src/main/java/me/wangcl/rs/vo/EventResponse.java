package me.wangcl.rs.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件查询接口响应对象。
 *
 * @author wangcl
 */
public class EventResponse extends Response {
	private static final long serialVersionUID = -6280542652176321528L;

	private List<Event> events = new ArrayList<>(); // 事件列表

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
}

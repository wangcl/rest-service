package me.wangcl.rs.service;

import me.wangcl.rs.vo.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 模拟的事件查询服务。
 *
 * @author wangcl
 */
public class EventService {
	private static Logger logger = LoggerFactory.getLogger(EventService.class);

	/**
	 * 创建事件。
	 *
	 * @param event 事件
	 */
	public void create(Event event) {
		logger.debug("event (" + event + ") created.");
	}

	/**
	 * 根据编码获取事件。
	 *
	 * @param code 事件编码
	 * @return 事件
	 */
	public Event getOne(String code) {
		Event e = new Event();
		e.setEventId(0);
		e.setEventCode("MSG_EVENT");
		e.setEventMsg("测试消息");
		e.setCreateTime(new Date());
		return e;
	}

	/**
	 * 获取事件列表。
	 *
	 * @return 事件列表
	 */
	public List<Event> getList() {
		List<Event> events = new ArrayList<>(2);

		Event e1 = new Event();
		e1.setEventId(1);
		e1.setEventCode("MSG_EVENT");
		e1.setEventMsg("测试消息");
		e1.setCreateTime(new Date());

		Event e2 = new Event();
		e2.setEventId(2);
		e2.setEventCode("LOG_EVENT");
		e2.setEventMsg("测试日志");
		e2.setCreateTime(new Date());

		events.add(e1);
		events.add(e2);

		return events;
	}

	/**
	 * 更新事件。
	 *
	 * @param event 事件
	 */
	public void update(Event event) {
		logger.debug("event (" + event + ") updated.");
	}

	/**
	 * 删除事件。
	 *
	 * @param code 事件编码
	 */
	public void delete(String code) {
		logger.debug("event (code:" + code + ") deleted.");
	}

}

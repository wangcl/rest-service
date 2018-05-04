package me.wangcl.rs.vo;

/**
 * 交互接口的响应对象。
 *
 * @author wangcl
 */
public class Response extends ValueObject {
	private static final long serialVersionUID = -1003632792532118494L;

	public static String RESULT_Y = "Y"; // 调用成功
	public static String RESULT_N = "N"; // 调用失败

	protected String result = RESULT_Y; // 默认：成功
	protected String message;


	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

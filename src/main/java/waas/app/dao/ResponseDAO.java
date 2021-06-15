package waas.app.dao;

public class ResponseDAO {

	private String message;

	public ResponseDAO(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

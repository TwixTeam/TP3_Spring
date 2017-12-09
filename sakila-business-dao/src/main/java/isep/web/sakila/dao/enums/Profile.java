package isep.web.sakila.dao.enums;

public enum Profile {
	
	ADMIN(1, "ROLE_ADMIN"),
	STAFF(2, "ROLE_STAFF");
	
	private int code;
	private String description;
	
	private Profile(int code, String description) {
		this.code = code;
		this.description = description;
	}
	public int getCode() {
		return code;
	}
	public String getDescription () {
		return description;
	}
	public static Profile toEnum(Integer code) {
		if (code == null) {
			return null;
		}
		for (Profile x : Profile.values()) {
			if (code.equals(x.getCode())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id invalid: " + code);
	}

}

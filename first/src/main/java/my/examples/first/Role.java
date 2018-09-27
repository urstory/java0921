package my.examples.first;

// 1건의 정보를 저장하는 객체 (Value Object)
public class Role {
	private int roleId;
	private String description;

	public Role() { // 기본생성자.
		
	}
	public Role(int roleId, String description) {
		super();
		this.roleId = roleId;
		this.description = description;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}

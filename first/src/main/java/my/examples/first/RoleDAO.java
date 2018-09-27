package my.examples.first;
import java.util.List;

public interface RoleDAO {
	// 1건의 Role정보를 저장한다.
	public int addRole(Role role);
	//role_id에 해당하는 Role정보를 삭제한다.
	public int deleteRole(int roleId);
	// role_id에 해당하는 Role정보를 읽어온다.
	public Role getRole(int roleId);
	// 모든 Role정보를 읽어온다.
	public List<Role> getRoles();
	// role_id에 해당하는 Role의 description정보를 수정한다.
	public int updateRole(Role role);
}

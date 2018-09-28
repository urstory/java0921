package my.examples.first;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDao2 {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;
	// RowMapper는 칼럼의 값을 객체에 담기위한 규칙을 가지는 객체이다.
	// 예를 들어 Role이 roleId 라는프로퍼티를 가지고 있으면
	// role_id 칼럼의 값을 roleId에 저장하겠다라는 규칙을 만들어준다.
	private RowMapper<Role> rowMapper = BeanPropertyRowMapper.newInstance(Role.class);

	public RoleDao2(DataSource dataSource) {
		System.out.println("RoleDao2 !!");
		// NamedParameterJdbcTemplate 는 JDBC를 쉽게 하도록 도와주는 객체.
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource)
                .withTableName("role");
	}
	
	public List<Role> selectAll(){
		// query(SQL, 바인딩할값이있는객체, 칼럼의값을dto에담아주기위한mapper)
		return jdbc.query(RoleDaoSqls.SELECT_ALL, Collections.emptyMap(), rowMapper);
	}
	
	public Role selectById(Integer id) {
		try {
			Map<String, ?> params = Collections.singletonMap("roleId", id);
			return jdbc.queryForObject(RoleDaoSqls.SELECT_BY_ROLE_ID, params, rowMapper);		
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}

}

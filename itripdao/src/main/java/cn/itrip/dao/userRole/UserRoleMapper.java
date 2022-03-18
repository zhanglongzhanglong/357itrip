package cn.itrip.dao.userRole;
import cn.itrip.pojo.UserRole;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface UserRoleMapper {

	public UserRole getUserRoleById(@Param(value = "id") Long id)throws Exception;

	public List<UserRole>	getUserRoleListByMap(Map<String, Object> param)throws Exception;

	public Integer getUserRoleCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertUserRole(UserRole userRole)throws Exception;

	public Integer updateUserRole(UserRole userRole)throws Exception;

	public Integer deleteUserRoleById(@Param(value = "id") Long id)throws Exception;

}

package cn.itrip.dao.functRole;
import cn.itrip.pojo.FunctRole;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface FunctRoleMapper {

	public FunctRole getFunctRoleById(@Param(value = "id") Long id)throws Exception;

	public List<FunctRole>	getFunctRoleListByMap(Map<String, Object> param)throws Exception;

	public Integer getFunctRoleCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertFunctRole(FunctRole functRole)throws Exception;

	public Integer updateFunctRole(FunctRole functRole)throws Exception;

	public Integer deleteFunctRoleById(@Param(value = "id") Long id)throws Exception;

}

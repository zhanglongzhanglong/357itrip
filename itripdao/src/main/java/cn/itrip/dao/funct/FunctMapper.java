package cn.itrip.dao.funct;
import cn.itrip.pojo.Funct;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface FunctMapper {

	public Funct getFunctById(@Param(value = "id") Long id)throws Exception;

	public List<Funct>	getFunctListByMap(Map<String, Object> param)throws Exception;

	public Integer getFunctCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertFunct(Funct funct)throws Exception;

	public Integer updateFunct(Funct funct)throws Exception;

	public Integer deleteFunctById(@Param(value = "id") Long id)throws Exception;

}

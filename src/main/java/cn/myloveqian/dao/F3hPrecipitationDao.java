package cn.myloveqian.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import cn.myloveqian.domain.F3hPrecipitation;

@Mapper
public interface F3hPrecipitationDao {

    int insertSelective(@Param("pojo") F3hPrecipitation pojo);

    int update(@Param("pojo") F3hPrecipitation pojo);
}

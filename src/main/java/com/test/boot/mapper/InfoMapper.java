package com.test.boot.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.boot.entity.Info;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zj
 * @since 2022-06-01
 */
@Mapper
@Repository

public interface InfoMapper extends BaseMapper<Info> {

}

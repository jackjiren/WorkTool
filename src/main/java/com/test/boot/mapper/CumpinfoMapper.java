package com.test.boot.mapper;

import com.test.boot.entity.Cumpinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zj
 * @since 2022-07-07
 */
@Mapper
@Repository
public interface CumpinfoMapper extends BaseMapper<Cumpinfo> {

}

package com.test.boot.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.boot.entity.Info;
import com.test.boot.mapper.InfoMapper;
import com.test.boot.service.IInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zj
 * @since 2022-06-01
 */
@Service
public class InfoServiceImpl extends ServiceImpl<InfoMapper, Info> implements IInfoService {



}

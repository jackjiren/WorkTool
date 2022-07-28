package com.test.boot.service.impl;

import com.test.boot.entity.Meeting;
import com.test.boot.mapper.MeetingMapper;
import com.test.boot.service.IMeetingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zj
 * @since 2022-07-28
 */
@Service
public class MeetingServiceImpl extends ServiceImpl<MeetingMapper, Meeting> implements IMeetingService {

}

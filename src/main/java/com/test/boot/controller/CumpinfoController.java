package com.test.boot.controller;



import com.test.boot.service.ICumpinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zj
 * @since 2022-07-07
 */
@Controller
@ResponseBody
@RequestMapping("/boot/cumpinfo")
public class CumpinfoController {
    @Autowired
    private ICumpinfoService iCumpinfoService;

    @RequestMapping("/count")
    public long getCumpinfo(){

        return iCumpinfoService.count();
    }
}

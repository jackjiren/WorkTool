package com.test.boot.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.test.boot.entity.Info;
import com.test.boot.mapper.InfoMapper;
import com.test.boot.service.IInfoService;
import com.test.boot.service.impl.InfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zj
 * @since 2022-06-01
 */

@RestController
@RequestMapping("/info")
public class InfoController {
    @RequestMapping("/getdata")
    public String getdata(){
      return new InfoServiceImpl().toString();
    };

    @Autowired
    private InfoMapper infoMapper;

    @RequestMapping("/getdata1")
    public List<Info> info(){
        return infoMapper.selectList(null);
    };

   @Autowired
    private IInfoService iInfoService;


   @RequestMapping("/count")
   public  long testServices(){
       QueryWrapper queryWrapper=new QueryWrapper();

      return iInfoService.count();
   };
   @PostMapping("/upload")
    public String upload(@RequestParam Map<String,String> map){
       //TODO 上传相关代码
       System.out.println(map.toString());
       Info info = new Info();
       info.setBoss(map.get("boss"));
       info.setCompany(map.get("company"));
       info.setRoom(map.get("room"));
       info.setDate(map.get("data"));
       info.setTelephone(map.get("telephone"));
       info.setProcess(map.get("process"));
       info.setReason(map.get("reason"));
       info.setSuccess(map.get("success"));
       info.setType1(map.get("type1"));
       info.setWorker(map.get("worker"));

       //上传时间
       LocalDateTime time = LocalDateTime.now();
       info.setXdatetime(time);


       iInfoService.save(info);
       return "保存成功！";



   };


}

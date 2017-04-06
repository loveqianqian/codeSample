package cn.myloveqian.service.impl;

import cn.myloveqian.dao.WeatherDao;
import cn.myloveqian.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * cn.myloveqian.service.impl
 *
 * @author zhiwei
 * @create 2017-04-06 16:02.
 * @github {@https://github.com/loveqianqian}
 * @微信号 zhiweilaile
 */
@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private WeatherDao weatherDao;


}

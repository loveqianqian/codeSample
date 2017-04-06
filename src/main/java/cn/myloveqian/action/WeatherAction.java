package cn.myloveqian.action;

import cn.myloveqian.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * cn.myloveqian.action
 *
 * @author zhiwei
 * @create 2017-04-05 15:47.
 * @github https://github.com/loveqianqian
 * @微信号 zhiweilaile
 */
@RestController
@RequestMapping("/weather")
public class WeatherAction {

    @Autowired
    private WeatherService weatherService;

    @RequestMapping(value = "/main/{cityName}", method = RequestMethod.GET)
    public
    @ResponseBody
    Map<String, Object> getMain(@PathVariable("cityName") String cityName,
                                HttpServletRequest request,
                                HttpServletResponse response) {
        Map<String, Object> result = new HashMap<>();
        result.put("key", cityName);
        result.put("value", "12摄氏度");
        return result;
    }
}

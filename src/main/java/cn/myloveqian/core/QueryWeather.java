package cn.myloveqian.core;

import cn.myloveqian.bean.WeatherDataBean;
import com.alibaba.fastjson.JSON;
import okhttp3.*;
import okhttp3.internal.http.HttpMethod;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import java.io.IOException;

/**
 * cn.myloveqian.core
 *
 * @author zhiwei
 * @create 2017-04-06 23:54.
 * @github {@https://github.com/loveqianqian}
 * @微信号 zhiweilaile
 */
@Component
public class QueryWeather {

    public enum HttpMethodEnum {

        GET("GET"), PUT("PUT"), DELETE("DELETE"), POST("POST");

        private String name;

        HttpMethodEnum(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private OkHttpClient client = new OkHttpClient();

    public String queryUrl(String url, HttpMethodEnum methodEnum) throws IOException {
        Request request = new Request.Builder()
                .method(methodEnum.getName(), null)
                .url(url)
                .build();
        Call call = client.newCall(request);
        Response execute = call.execute();
        ResponseBody body = execute.body();
        return body.string();
    }

    public <T> T packageResult(String jsonResult, Class<T> classObject) {
        return JSON.parseObject(jsonResult, classObject);
    }

    public static void main(String[] args) throws IOException {
        QueryWeather queryWeather = new QueryWeather();
        String url =
                "http://op.juhe.cn/onebox/weather/query?cityname=%E5%A4%A9%E6%B4%A5&dtype=&key=3f86f82a9c8cefdc509e0eadf2ef92b3";
        String result = queryWeather.queryUrl(url, HttpMethodEnum.GET);
        System.out.println(result);
        WeatherDataBean weatherDataBean = queryWeather.packageResult(result, WeatherDataBean.class);
        System.out.println(weatherDataBean.getReason());
    }

}

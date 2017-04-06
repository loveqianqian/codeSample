package cn.myloveqian.bean;

import java.util.List;

/**
 * cn.myloveqian.bean
 *
 * @author zhiwei
 * @create 2017-04-06 15:04.
 * @github {@https://github.com/loveqianqian}
 * @微信号 zhiweilaile
 */
public class WeatherDataBean {

    /**
     * reason : 查询成功!
     * result : {"data":{"realtime":{"city_code":"101030100","city_name":"天津","date":"2017-04-06","time":"13:00:00","week":4,"moon":"三月初十","dataUptime":1491455778,"weather":{"temperature":"21","humidity":"50","info":"晴","img":"0"},"wind":{"direct":"西风","power":"3级","offset":null,"windspeed":null}},"life":{"date":"2017-4-6","info":{"chuanyi":["舒适","建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"],"ganmao":["少发","各项气象条件适宜，无明显降温过程，发生感冒机率较低。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较不宜","天气较好，无雨水困扰，但考虑气温很高，请注意适当减少运动时间并降低运动强度，运动后及时补充水分。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"]}},"weather":[{"date":"2017-04-06","info":{"day":["0","晴","24","西北风","微风","05:48"],"night":["1","多云","13","东南风","3-4 级","18:39"]},"week":"四","nongli":"三月初十 "},{"date":"2017-04-07","info":{"dawn":["1","多云","13","东南风","3-4 级","18:39"],"day":["2","阴","22","东南风","微风","05:46"],"night":["7","小雨","12","东北风","微风","18:40"]},"week":"五","nongli":"三月十一"},{"date":"2017-04-08","info":{"dawn":["7","小雨","12","东北风","微风","18:40"],"day":["7","小雨","17","东北风","4-5 级","05:44"],"night":["0","晴","8","东北风","微风","18:41"]},"week":"六","nongli":"三月十二"},{"date":"2017-04-09","info":{"dawn":["0","晴","8","东北风","微风","18:41"],"day":["0","晴","18","西南风","微风","05:43"],"night":["0","晴","11","西南风","微风","18:42"]},"week":"日","nongli":"三月十三"},{"date":"2017-04-10","info":{"dawn":["0","晴","11","西南风","微风","18:42"],"day":["2","阴","22","西南风","微风","05:41"],"night":["2","阴","13","西南风","微风","18:43"]},"week":"一","nongli":"三月十四"}],"f3h":{"temperature":[{"jg":"20170406110000","jb":"21"},{"jg":"20170406140000","jb":"22"},{"jg":"20170406170000","jb":"23"},{"jg":"20170406200000","jb":"18"},{"jg":"20170406230000","jb":"16"},{"jg":"20170407020000","jb":"14"},{"jg":"20170407050000","jb":"13"},{"jg":"20170407080000","jb":"18"},{"jg":"20170407110000","jb":"20"}],"precipitation":[{"jg":"20170406110000","jf":"0"},{"jg":"20170406140000","jf":"0"},{"jg":"20170406170000","jf":"0"},{"jg":"20170406200000","jf":"0"},{"jg":"20170406230000","jf":"0"},{"jg":"20170407020000","jf":"0"},{"jg":"20170407050000","jf":"0"},{"jg":"20170407080000","jf":"0"},{"jg":"20170407110000","jf":"0"}]},"pm25":{"key":"Tianjin","show_desc":0,"pm25":{"curPm":"193","pm25":"148","pm10":"182","level":4,"quality":"中度污染","des":"应减少外出，外出时佩戴口罩，敏感人群应尽量避免外出"},"dateTime":"2017年04月06日12时","cityName":"天津"},"jingqu":"","jingqutq":"","date":"","isForeign":"0"}}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * data : {"realtime":{"city_code":"101030100","city_name":"天津","date":"2017-04-06","time":"13:00:00","week":4,"moon":"三月初十","dataUptime":1491455778,"weather":{"temperature":"21","humidity":"50","info":"晴","img":"0"},"wind":{"direct":"西风","power":"3级","offset":null,"windspeed":null}},"life":{"date":"2017-4-6","info":{"chuanyi":["舒适","建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"],"ganmao":["少发","各项气象条件适宜，无明显降温过程，发生感冒机率较低。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较不宜","天气较好，无雨水困扰，但考虑气温很高，请注意适当减少运动时间并降低运动强度，运动后及时补充水分。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"]}},"weather":[{"date":"2017-04-06","info":{"day":["0","晴","24","西北风","微风","05:48"],"night":["1","多云","13","东南风","3-4 级","18:39"]},"week":"四","nongli":"三月初十 "},{"date":"2017-04-07","info":{"dawn":["1","多云","13","东南风","3-4 级","18:39"],"day":["2","阴","22","东南风","微风","05:46"],"night":["7","小雨","12","东北风","微风","18:40"]},"week":"五","nongli":"三月十一"},{"date":"2017-04-08","info":{"dawn":["7","小雨","12","东北风","微风","18:40"],"day":["7","小雨","17","东北风","4-5 级","05:44"],"night":["0","晴","8","东北风","微风","18:41"]},"week":"六","nongli":"三月十二"},{"date":"2017-04-09","info":{"dawn":["0","晴","8","东北风","微风","18:41"],"day":["0","晴","18","西南风","微风","05:43"],"night":["0","晴","11","西南风","微风","18:42"]},"week":"日","nongli":"三月十三"},{"date":"2017-04-10","info":{"dawn":["0","晴","11","西南风","微风","18:42"],"day":["2","阴","22","西南风","微风","05:41"],"night":["2","阴","13","西南风","微风","18:43"]},"week":"一","nongli":"三月十四"}],"f3h":{"temperature":[{"jg":"20170406110000","jb":"21"},{"jg":"20170406140000","jb":"22"},{"jg":"20170406170000","jb":"23"},{"jg":"20170406200000","jb":"18"},{"jg":"20170406230000","jb":"16"},{"jg":"20170407020000","jb":"14"},{"jg":"20170407050000","jb":"13"},{"jg":"20170407080000","jb":"18"},{"jg":"20170407110000","jb":"20"}],"precipitation":[{"jg":"20170406110000","jf":"0"},{"jg":"20170406140000","jf":"0"},{"jg":"20170406170000","jf":"0"},{"jg":"20170406200000","jf":"0"},{"jg":"20170406230000","jf":"0"},{"jg":"20170407020000","jf":"0"},{"jg":"20170407050000","jf":"0"},{"jg":"20170407080000","jf":"0"},{"jg":"20170407110000","jf":"0"}]},"pm25":{"key":"Tianjin","show_desc":0,"pm25":{"curPm":"193","pm25":"148","pm10":"182","level":4,"quality":"中度污染","des":"应减少外出，外出时佩戴口罩，敏感人群应尽量避免外出"},"dateTime":"2017年04月06日12时","cityName":"天津"},"jingqu":"","jingqutq":"","date":"","isForeign":"0"}
         */

        private DataBean data;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * realtime : {"city_code":"101030100","city_name":"天津","date":"2017-04-06","time":"13:00:00","week":4,"moon":"三月初十","dataUptime":1491455778,"weather":{"temperature":"21","humidity":"50","info":"晴","img":"0"},"wind":{"direct":"西风","power":"3级","offset":null,"windspeed":null}}
             * life : {"date":"2017-4-6","info":{"chuanyi":["舒适","建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"],"ganmao":["少发","各项气象条件适宜，无明显降温过程，发生感冒机率较低。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较不宜","天气较好，无雨水困扰，但考虑气温很高，请注意适当减少运动时间并降低运动强度，运动后及时补充水分。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"]}}
             * weather : [{"date":"2017-04-06","info":{"day":["0","晴","24","西北风","微风","05:48"],"night":["1","多云","13","东南风","3-4 级","18:39"]},"week":"四","nongli":"三月初十 "},{"date":"2017-04-07","info":{"dawn":["1","多云","13","东南风","3-4 级","18:39"],"day":["2","阴","22","东南风","微风","05:46"],"night":["7","小雨","12","东北风","微风","18:40"]},"week":"五","nongli":"三月十一"},{"date":"2017-04-08","info":{"dawn":["7","小雨","12","东北风","微风","18:40"],"day":["7","小雨","17","东北风","4-5 级","05:44"],"night":["0","晴","8","东北风","微风","18:41"]},"week":"六","nongli":"三月十二"},{"date":"2017-04-09","info":{"dawn":["0","晴","8","东北风","微风","18:41"],"day":["0","晴","18","西南风","微风","05:43"],"night":["0","晴","11","西南风","微风","18:42"]},"week":"日","nongli":"三月十三"},{"date":"2017-04-10","info":{"dawn":["0","晴","11","西南风","微风","18:42"],"day":["2","阴","22","西南风","微风","05:41"],"night":["2","阴","13","西南风","微风","18:43"]},"week":"一","nongli":"三月十四"}]
             * f3h : {"temperature":[{"jg":"20170406110000","jb":"21"},{"jg":"20170406140000","jb":"22"},{"jg":"20170406170000","jb":"23"},{"jg":"20170406200000","jb":"18"},{"jg":"20170406230000","jb":"16"},{"jg":"20170407020000","jb":"14"},{"jg":"20170407050000","jb":"13"},{"jg":"20170407080000","jb":"18"},{"jg":"20170407110000","jb":"20"}],"precipitation":[{"jg":"20170406110000","jf":"0"},{"jg":"20170406140000","jf":"0"},{"jg":"20170406170000","jf":"0"},{"jg":"20170406200000","jf":"0"},{"jg":"20170406230000","jf":"0"},{"jg":"20170407020000","jf":"0"},{"jg":"20170407050000","jf":"0"},{"jg":"20170407080000","jf":"0"},{"jg":"20170407110000","jf":"0"}]}
             * pm25 : {"key":"Tianjin","show_desc":0,"pm25":{"curPm":"193","pm25":"148","pm10":"182","level":4,"quality":"中度污染","des":"应减少外出，外出时佩戴口罩，敏感人群应尽量避免外出"},"dateTime":"2017年04月06日12时","cityName":"天津"}
             * jingqu :
             * jingqutq :
             * date :
             * isForeign : 0
             */

            private RealtimeBean realtime;
            private LifeBean life;
            private F3hBean f3h;
            private Pm25BeanX pm25;
            private String jingqu;
            private String jingqutq;
            private String date;
            private String isForeign;
            private List<WeatherBeanX> weather;

            public RealtimeBean getRealtime() {
                return realtime;
            }

            public void setRealtime(RealtimeBean realtime) {
                this.realtime = realtime;
            }

            public LifeBean getLife() {
                return life;
            }

            public void setLife(LifeBean life) {
                this.life = life;
            }

            public F3hBean getF3h() {
                return f3h;
            }

            public void setF3h(F3hBean f3h) {
                this.f3h = f3h;
            }

            public Pm25BeanX getPm25() {
                return pm25;
            }

            public void setPm25(Pm25BeanX pm25) {
                this.pm25 = pm25;
            }

            public String getJingqu() {
                return jingqu;
            }

            public void setJingqu(String jingqu) {
                this.jingqu = jingqu;
            }

            public String getJingqutq() {
                return jingqutq;
            }

            public void setJingqutq(String jingqutq) {
                this.jingqutq = jingqutq;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getIsForeign() {
                return isForeign;
            }

            public void setIsForeign(String isForeign) {
                this.isForeign = isForeign;
            }

            public List<WeatherBeanX> getWeather() {
                return weather;
            }

            public void setWeather(List<WeatherBeanX> weather) {
                this.weather = weather;
            }

            public static class RealtimeBean {
                /**
                 * city_code : 101030100
                 * city_name : 天津
                 * date : 2017-04-06
                 * time : 13:00:00
                 * week : 4
                 * moon : 三月初十
                 * dataUptime : 1491455778
                 * weather : {"temperature":"21","humidity":"50","info":"晴","img":"0"}
                 * wind : {"direct":"西风","power":"3级","offset":null,"windspeed":null}
                 */

                private String city_code;
                private String city_name;
                private String date;
                private String time;
                private int week;
                private String moon;
                private int dataUptime;
                private WeatherBean weather;
                private WindBean wind;

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public int getWeek() {
                    return week;
                }

                public void setWeek(int week) {
                    this.week = week;
                }

                public String getMoon() {
                    return moon;
                }

                public void setMoon(String moon) {
                    this.moon = moon;
                }

                public int getDataUptime() {
                    return dataUptime;
                }

                public void setDataUptime(int dataUptime) {
                    this.dataUptime = dataUptime;
                }

                public WeatherBean getWeather() {
                    return weather;
                }

                public void setWeather(WeatherBean weather) {
                    this.weather = weather;
                }

                public WindBean getWind() {
                    return wind;
                }

                public void setWind(WindBean wind) {
                    this.wind = wind;
                }

                public static class WeatherBean {
                    /**
                     * temperature : 21
                     * humidity : 50
                     * info : 晴
                     * img : 0
                     */

                    private String temperature;
                    private String humidity;
                    private String info;
                    private String img;

                    public String getTemperature() {
                        return temperature;
                    }

                    public void setTemperature(String temperature) {
                        this.temperature = temperature;
                    }

                    public String getHumidity() {
                        return humidity;
                    }

                    public void setHumidity(String humidity) {
                        this.humidity = humidity;
                    }

                    public String getInfo() {
                        return info;
                    }

                    public void setInfo(String info) {
                        this.info = info;
                    }

                    public String getImg() {
                        return img;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }
                }

                public static class WindBean {
                    /**
                     * direct : 西风
                     * power : 3级
                     * offset : null
                     * windspeed : null
                     */

                    private String direct;
                    private String power;
                    private Object offset;
                    private Object windspeed;

                    public String getDirect() {
                        return direct;
                    }

                    public void setDirect(String direct) {
                        this.direct = direct;
                    }

                    public String getPower() {
                        return power;
                    }

                    public void setPower(String power) {
                        this.power = power;
                    }

                    public Object getOffset() {
                        return offset;
                    }

                    public void setOffset(Object offset) {
                        this.offset = offset;
                    }

                    public Object getWindspeed() {
                        return windspeed;
                    }

                    public void setWindspeed(Object windspeed) {
                        this.windspeed = windspeed;
                    }
                }
            }

            public static class LifeBean {
                /**
                 * date : 2017-4-6
                 * info : {"chuanyi":["舒适","建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"],"ganmao":["少发","各项气象条件适宜，无明显降温过程，发生感冒机率较低。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较不宜","天气较好，无雨水困扰，但考虑气温很高，请注意适当减少运动时间并降低运动强度，运动后及时补充水分。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"]}
                 */

                private String date;
                private InfoBean info;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public InfoBean getInfo() {
                    return info;
                }

                public void setInfo(InfoBean info) {
                    this.info = info;
                }

                public static class InfoBean {
                    private List<String> chuanyi;
                    private List<String> ganmao;
                    private List<String> kongtiao;
                    private List<String> xiche;
                    private List<String> yundong;
                    private List<String> ziwaixian;

                    public List<String> getChuanyi() {
                        return chuanyi;
                    }

                    public void setChuanyi(List<String> chuanyi) {
                        this.chuanyi = chuanyi;
                    }

                    public List<String> getGanmao() {
                        return ganmao;
                    }

                    public void setGanmao(List<String> ganmao) {
                        this.ganmao = ganmao;
                    }

                    public List<String> getKongtiao() {
                        return kongtiao;
                    }

                    public void setKongtiao(List<String> kongtiao) {
                        this.kongtiao = kongtiao;
                    }

                    public List<String> getXiche() {
                        return xiche;
                    }

                    public void setXiche(List<String> xiche) {
                        this.xiche = xiche;
                    }

                    public List<String> getYundong() {
                        return yundong;
                    }

                    public void setYundong(List<String> yundong) {
                        this.yundong = yundong;
                    }

                    public List<String> getZiwaixian() {
                        return ziwaixian;
                    }

                    public void setZiwaixian(List<String> ziwaixian) {
                        this.ziwaixian = ziwaixian;
                    }
                }
            }

            public static class F3hBean {
                private List<TemperatureBean> temperature;
                private List<PrecipitationBean> precipitation;

                public List<TemperatureBean> getTemperature() {
                    return temperature;
                }

                public void setTemperature(List<TemperatureBean> temperature) {
                    this.temperature = temperature;
                }

                public List<PrecipitationBean> getPrecipitation() {
                    return precipitation;
                }

                public void setPrecipitation(List<PrecipitationBean> precipitation) {
                    this.precipitation = precipitation;
                }

                public static class TemperatureBean {
                    /**
                     * jg : 20170406110000
                     * jb : 21
                     */

                    private String jg;
                    private String jb;

                    public String getJg() {
                        return jg;
                    }

                    public void setJg(String jg) {
                        this.jg = jg;
                    }

                    public String getJb() {
                        return jb;
                    }

                    public void setJb(String jb) {
                        this.jb = jb;
                    }
                }

                public static class PrecipitationBean {
                    /**
                     * jg : 20170406110000
                     * jf : 0
                     */

                    private String jg;
                    private String jf;

                    public String getJg() {
                        return jg;
                    }

                    public void setJg(String jg) {
                        this.jg = jg;
                    }

                    public String getJf() {
                        return jf;
                    }

                    public void setJf(String jf) {
                        this.jf = jf;
                    }
                }
            }

            public static class Pm25BeanX {
                /**
                 * key : Tianjin
                 * show_desc : 0
                 * pm25 : {"curPm":"193","pm25":"148","pm10":"182","level":4,"quality":"中度污染","des":"应减少外出，外出时佩戴口罩，敏感人群应尽量避免外出"}
                 * dateTime : 2017年04月06日12时
                 * cityName : 天津
                 */

                private String key;
                private int show_desc;
                private Pm25Bean pm25;
                private String dateTime;
                private String cityName;

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public int getShow_desc() {
                    return show_desc;
                }

                public void setShow_desc(int show_desc) {
                    this.show_desc = show_desc;
                }

                public Pm25Bean getPm25() {
                    return pm25;
                }

                public void setPm25(Pm25Bean pm25) {
                    this.pm25 = pm25;
                }

                public String getDateTime() {
                    return dateTime;
                }

                public void setDateTime(String dateTime) {
                    this.dateTime = dateTime;
                }

                public String getCityName() {
                    return cityName;
                }

                public void setCityName(String cityName) {
                    this.cityName = cityName;
                }

                public static class Pm25Bean {
                    /**
                     * curPm : 193
                     * pm25 : 148
                     * pm10 : 182
                     * level : 4
                     * quality : 中度污染
                     * des : 应减少外出，外出时佩戴口罩，敏感人群应尽量避免外出
                     */

                    private String curPm;
                    private String pm25;
                    private String pm10;
                    private int level;
                    private String quality;
                    private String des;

                    public String getCurPm() {
                        return curPm;
                    }

                    public void setCurPm(String curPm) {
                        this.curPm = curPm;
                    }

                    public String getPm25() {
                        return pm25;
                    }

                    public void setPm25(String pm25) {
                        this.pm25 = pm25;
                    }

                    public String getPm10() {
                        return pm10;
                    }

                    public void setPm10(String pm10) {
                        this.pm10 = pm10;
                    }

                    public int getLevel() {
                        return level;
                    }

                    public void setLevel(int level) {
                        this.level = level;
                    }

                    public String getQuality() {
                        return quality;
                    }

                    public void setQuality(String quality) {
                        this.quality = quality;
                    }

                    public String getDes() {
                        return des;
                    }

                    public void setDes(String des) {
                        this.des = des;
                    }
                }
            }

            public static class WeatherBeanX {
                /**
                 * date : 2017-04-06
                 * info : {"day":["0","晴","24","西北风","微风","05:48"],"night":["1","多云","13","东南风","3-4 级","18:39"]}
                 * week : 四
                 * nongli : 三月初十
                 */

                private String date;
                private InfoBeanX info;
                private String week;
                private String nongli;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public InfoBeanX getInfo() {
                    return info;
                }

                public void setInfo(InfoBeanX info) {
                    this.info = info;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getNongli() {
                    return nongli;
                }

                public void setNongli(String nongli) {
                    this.nongli = nongli;
                }

                public static class InfoBeanX {
                    private List<String> day;
                    private List<String> night;

                    public List<String> getDay() {
                        return day;
                    }

                    public void setDay(List<String> day) {
                        this.day = day;
                    }

                    public List<String> getNight() {
                        return night;
                    }

                    public void setNight(List<String> night) {
                        this.night = night;
                    }
                }
            }
        }
    }
}

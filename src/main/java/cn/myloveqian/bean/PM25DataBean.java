package cn.myloveqian.bean;

/**
 * cn.myloveqian.bean
 *
 * @author zhiwei
 * @create 2017-04-06 15:09.
 * @github {@https://github.com/loveqianqian}
 * @微信号 zhiweilaile
 */
public class PM25DataBean {
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

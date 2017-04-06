package cn.myloveqian.bean;

import java.util.List;

/**
 * cn.myloveqian.bean
 *
 * @author zhiwei
 * @create 2017-04-06 15:07.
 * @github {@https://github.com/loveqianqian}
 * @微信号 zhiweilaile
 */
public class DayWeatherDataBean {
    /**
     * date : 2017-04-06
     * info : {"day":["0","晴","24","西北风","微风","05:48"],"night":["1","多云","13","东南风","3-4 级","18:39"]}
     * week : 四
     * nongli : 三月初十
     */

    private String date;
    private InfoBean info;
    private String week;
    private String nongli;

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

    public static class InfoBean {
        private List<String> day;
        private List<String> dawn;
        private List<String> night;

        public List<String> getDay() {
            return day;
        }

        public void setDay(List<String> day) {
            this.day = day;
        }

        public List<String> getDawn() {
            return dawn;
        }

        public void setDawn(List<String> dawn) {
            this.dawn = dawn;
        }

        public List<String> getNight() {
            return night;
        }

        public void setNight(List<String> night) {
            this.night = night;
        }
    }
}

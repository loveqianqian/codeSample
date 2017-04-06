package cn.myloveqian.bean;

import java.util.List;

/**
 * cn.myloveqian.bean
 *
 * @author zhiwei
 * @create 2017-04-06 15:08.
 * @github {@https://github.com/loveqianqian}
 * @微信号 zhiweilaile
 */
public class F3HDataBean {

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

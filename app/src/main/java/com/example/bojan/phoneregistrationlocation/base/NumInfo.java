package com.example.bojan.phoneregistrationlocation.base;

/**
 * Create by bojan
 * on 2018/8/15
 */
public class NumInfo extends BaseBean{
    private ResultEntity result;
    /**
     * msg : 手机号码不正确
     * msgid : 1000801
     */

    private String msg;

    private String msgid;

    public ResultEntity getResult() {
        return result;
    }

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public static class ResultEntity {
        private String status;
        private String phone;
        private String area;
        private String postno;
        private String att;
        private String ctype;
        private String par;
        private String prefix;
        private String operators;
        private String style_simcall;
        private String style_citynm;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getPostno() {
            return postno;
        }

        public void setPostno(String postno) {
            this.postno = postno;
        }

        public String getAtt() {
            return att;
        }

        public void setAtt(String att) {
            this.att = att;
        }

        public String getCtype() {
            return ctype;
        }

        public void setCtype(String ctype) {
            this.ctype = ctype;
        }

        public String getPar() {
            return par;
        }

        public void setPar(String par) {
            this.par = par;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public String getOperators() {
            return operators;
        }

        public void setOperators(String operators) {
            this.operators = operators;
        }

        public String getStyle_simcall() {
            return style_simcall;
        }

        public void setStyle_simcall(String style_simcall) {
            this.style_simcall = style_simcall;
        }

        public String getStyle_citynm() {
            return style_citynm;
        }

        public void setStyle_citynm(String style_citynm) {
            this.style_citynm = style_citynm;
        }

        @Override
        public String toString() {
            return "ResultEntity{" +
                    "status='" + status + '\'' +
                    ", phone='" + phone + '\'' +
                    ", area='" + area + '\'' +
                    ", postno='" + postno + '\'' +
                    ", att='" + att + '\'' +
                    ", ctype='" + ctype + '\'' +
                    ", par='" + par + '\'' +
                    ", prefix='" + prefix + '\'' +
                    ", operators='" + operators + '\'' +
                    ", style_simcall='" + style_simcall + '\'' +
                    ", style_citynm='" + style_citynm + '\'' +
                    '}';
        }
    }
    @Override
    public String toString() {
        return "NumInfo{" +
                "success='" + success + '\'' +
                ", result=" + result +
                '}';
    }

}

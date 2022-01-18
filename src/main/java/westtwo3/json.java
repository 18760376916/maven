package westtwo3;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.List;

public class json {
    @JSONField(serialize = false)
    private int code;
    @JSONField(serialize = false)
    private String updateTime;
    @JSONField(serialize = false)
    private  String fxLink;
    private List<info> daily = new ArrayList<>();
    @JSONField(serialize = false)
    private String license;
    public json(){}

    public json(int code, String updateTime, String fxLink, List<info> daily, String license) {
        this.code = code;
        this.updateTime = updateTime;
        this.fxLink = fxLink;
        this.daily = daily;
        this.license = license;
    }

    public int getCode() {
        return code;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public String getFxLink() {
        return fxLink;
    }

    public List<info> getDaily() {
        return daily;
    }

    public String getLicense() {
        return license;
    }
}

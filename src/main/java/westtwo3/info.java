package westtwo3;

public class info {
    private String name,city_id,wei,jin,fxDate,tempMax,tempMin,textDay;
    public info(String name,String city_id,String wei,String jin,String fxDate,String tempMax,String tempMin,String textDay){
        this.city_id=city_id;
        this.name= name;
        this.wei=wei;
        this.jin=jin;
        this.fxDate=fxDate;
        this.tempMax=tempMax;
        this.tempMin=tempMin;
        this.textDay=textDay;
    }

    public String getName() {
        return name;
    }

    public String getCity_id() {
        return city_id;
    }

    public String getWei() {
        return wei;
    }

    public String getJin() {
        return jin;
    }

    public String getFxDate() {
        return fxDate;
    }

    public String getTempMax() {
        return tempMax;
    }

    public String getTempMin() {
        return tempMin;
    }

    public String getTextDay() {
        return textDay;
    }
}

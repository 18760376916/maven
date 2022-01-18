package westtwo3;

import com.alibaba.fastjson.JSON;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.Chars;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

public class getInfo {
    public static List<info> getF(){
        //获得客户端
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        //创建get请求
        HttpGet httpGet = new HttpGet("https://devapi.qweather.com/v7/weather/3d?key=4cb4ea53a98d4ffa9b71a50041753e3f&location=101230101");
        //响应模型
        CloseableHttpResponse response = null;//福州：101230101
        try {
            response = httpClient.execute(httpGet);//发送get请求
        } catch (IOException e) {
            e.printStackTrace();
        }
        String ht = null;
        try {
            ht = EntityUtils.toString(response.getEntity(), Charset.forName("utf-8"));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        json it = JSON.parseObject(ht,json.class);
        return it.getDaily();
    }
    public static List<info> getB(){
        //获得客户端
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        //创建get请求
        HttpGet httpGet = new HttpGet("https://devapi.qweather.com/v7/weather/3d?key=4cb4ea53a98d4ffa9b71a50041753e3f&location=101010100");
        //响应模型
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);//发送get请求
        } catch (IOException e) {
            e.printStackTrace();
        }
        String ht = null;
        try {
            ht = EntityUtils.toString(response.getEntity(), Charset.forName("utf-8"));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        json it = JSON.parseObject(ht,json.class);
        return it.getDaily();
    }
    public static List<info> getS(){
        //获得客户端
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        //创建get请求
        HttpGet httpGet = new HttpGet("https://devapi.qweather.com/v7/weather/3d?key=4cb4ea53a98d4ffa9b71a50041753e3f&location=101020100");
        //响应模型
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);//发送get请求
        } catch (IOException e) {
            e.printStackTrace();
        }
        String ht = null;
        try {
            ht = EntityUtils.toString(response.getEntity(), Charset.forName("utf-8"));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        json it = JSON.parseObject(ht,json.class);
        return it.getDaily();
    }
}

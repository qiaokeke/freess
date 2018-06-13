package top.qiaokeke.freess.service.http.impl;

import com.alibaba.fastjson.JSON;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import top.qiaokeke.freess.domain.SSObject;
import top.qiaokeke.freess.service.http.FreessService;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class FreessServiceimpl implements FreessService {


    @Override
    public List<SSObject> getSSObjectsFromFreesscf() {

        String url = "http://free-ss.cf/ss.json";

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response;
        try{
            response = client.newCall(request).execute();
        }catch (IOException e){
            return null;
        }

        List<SSObject> ssObjects=new LinkedList<>();
        try {
            Map<String,Object> map = (Map<String, Object>) JSON.parse(response.body().string());

            List<Object> ssStrings = (List<Object>) map.get("data");
            System.out.println(ssStrings);

            for (Object o: ssStrings){
                System.out.println(o);
                List<String> strings = (List<String>) o;

                SSObject ssObject =new SSObject();
                ssObject.setAddress(strings.get(1));
                ssObject.setPort(strings.get(2));
                ssObject.setPassword(strings.get(3));
                ssObject.setMethod(strings.get(4));
                ssObject.setTime(strings.get(5));
                ssObject.setCountry(strings.get(6));
                ssObjects.add(ssObject);
            }
            //ssObjects = JSON.parseArray(response.body().string(),SSObject.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return ssObjects;
    }
}

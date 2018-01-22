package com.simple.springcp.spring;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: by Administrator on 2018/1/22.
 */
public class ClassPathXmlApplicationContext implements Factory{
    private Map<String,Object> mapBeans = new HashMap<>();

    public ClassPathXmlApplicationContext(){
        SAXBuilder sb = new SAXBuilder();// 创建一个SAXBuilder对象
        Document doc = null;
        try {
            doc = sb.build(this.getClass().getClassLoader().getResourceAsStream("spring.xml"));
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 构造文档对象
        Element root = doc.getRootElement(); // 获取根元素
        List list = root.getChildren("bean");// 取名字为disk的所有元素
        for (int i = 0; i < list.size(); i++) {
            Element element = (Element) list.get(i);
            String id = element.getAttributeValue("id");
            String classz = element.getAttributeValue("class");
            try {
                Object o = Class.forName(classz).newInstance();
                mapBeans.put(id,o);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public Object getBean(String id) {
        return mapBeans.get(id);
    }
}

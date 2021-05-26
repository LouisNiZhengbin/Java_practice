package test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
我有一个文本文件 user.txt， 我知道数据是键值对形式的，但是不知道内容是什么。
请写一个程序判断是否有"C++"这样的键存在，如果有就改变其为100
分析：
A:把文件中的数据加载到集合中
B:遍历集合，获取得到得到每一个键
C:判断键是否有为“C++”的，如果有就修改其值为“100”
D：把集合中的数据重新存储到文件中
 */

public class PropertiesDemo {
    public static void main(String[] args) throws IOException{
        //创建集合对象
        Properties prop = new Properties();
        //读取文件到集合
        Reader r = new FileReader("F:\\项目\\java项目\\practice\\src\\test\\name.txt");
        prop.load(r);
        r.close();
        //遍历获取键和值
        Set<String> set = prop.stringPropertyNames(); //获取键的集合
        for(String key:set){
            System.out.println("打印键值："+key);
            if(key.equals("c++")){
                String value = prop.getProperty(key);
                prop.setProperty(key, "100"); //把指定键设置为100
                //由于键是不可以重复的因此修改一次即可
            }
        }

        //将修改后的集合元素重新写入到文件中
        Writer w= new FileWriter("F:\\项目\\java项目\\practice\\src\\test\\name.txt");
        prop.store(w, null);
        w.close();
    }
}

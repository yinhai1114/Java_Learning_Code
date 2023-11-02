package com.yinhai.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author 银海
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1",new User(1, "hello"));
        userDAO.save("2",new User(2, "xiaowang"));
        userDAO.save("3",new User(3, "xiaobai"));
        System.out.println(userDAO.list());
        userDAO.update("213213213",new User(0,"xiaowang1"));
        System.out.println("修改后");
        System.out.println(userDAO.list());
        userDAO.delete("1");
        System.out.println(userDAO.list());
    }
}

class DAO<T>{
    private Map<String,T> map = new HashMap<>();

    @Test
    public void save(String id,T entity){
        map.put(id,entity);
    }
    @Test
    public T get (String id){//符合
        return (T)map.get(id);
    }
    @Test
    public void update(String id,T entity){//符合
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            if(!id.equals(key)){
                System.out.println("错误，没有该键值");
                return;
            }
        }
        map.put(id,entity);
    }
    @Test
    public List<T> list() {//使用迭代器也行 都一样
        Collection<T> values = map.values();
        System.out.println("---取出所有的value 放在List集合内----");
        List<T> list = new ArrayList<>(values);
        return list;
    }
    @Test
    public void delete(String id){
        if(map.remove(id) != null){
            System.out.println("删除成功");
        }else{
            System.out.println("失败");
        }
    }
}
class User{
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
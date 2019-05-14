package com.route;
import java.io.Serializable;


import com.alibaba.fastjson.JSON;


public class Person implements Serializable {
private static final long serialVersionUID = 1L;


private int id;
private String name;


public Person() {
super();
}


public Person(int id, String name) {
super();
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
public String toString() { // 这里偷懒用了Fastjson
return JSON.toJSONString(this);
}

}
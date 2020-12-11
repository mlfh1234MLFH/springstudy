package com.redstar.entry;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Created by liwenchao
 * @CreateDate: 2020/7/29 17:54
 * @Description:
 * @Content:
 */
public class User  implements Serializable {
    private Integer id;
    private String userName;
    private Date Birthday;
    private String  Sex;
    private String Address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", Birthday=" + Birthday +
                ", Sex='" + Sex + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}

/**
 * @Title:  User.java
 * @Package com.rh.spring.boot.blog.domain
 * @Description: TODO(用一句话描述该文件做什么)
 * @author RH
 * @date  2018年4月11日 下午1:49:39
 * @version V1.0
 * Update Logs:
 * ****************************************************
 * Name:
 * Date:
 * Description:
 ******************************************************
*/
package com.rh.spring.boot.blog.domain;

/**
 * @ClassName: User
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author RH
 * @date 2018年4月11日 下午1:49:39
 */
public class User {

    private Long id;

    private String name;

    private String email;

    public User() {
    }

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id 要设置的 id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 要设置的 name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email 要设置的 email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}

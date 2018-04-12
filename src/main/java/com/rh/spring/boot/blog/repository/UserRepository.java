/**
 * @Title:  UserRepository.java
 * @Package com.rh.spring.boot.blog.repository
 * @Description: TODO(用一句话描述该文件做什么)
 * @author RH
 * @date  2018年4月11日 下午1:56:15
 * @version V1.0
 * Update Logs:
 * ****************************************************
 * Name:
 * Date:
 * Description:
 ******************************************************
*/
package com.rh.spring.boot.blog.repository;

import java.util.List;

import com.rh.spring.boot.blog.domain.User;

/**
 * @ClassName: UserRepository
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author RH
 * @date 2018年4月11日 下午1:56:15
 */
public interface UserRepository {

    User saveOrUpdateUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);

    List<User> getUserList();
}

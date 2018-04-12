/**
 * @Title:  UserRepositoryImpl.java
 * @Package com.rh.spring.boot.blog.repository
 * @Description: TODO(用一句话描述该文件做什么)
 * @author RH
 * @date  2018年4月11日 下午2:03:00
 * @version V1.0
 * Update Logs:
 * ****************************************************
 * Name:
 * Date:
 * Description:
 ******************************************************
*/
package com.rh.spring.boot.blog.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Repository;
import com.rh.spring.boot.blog.domain.User;

/**
 * @ClassName: UserRepositoryImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author RH
 * @date 2018年4月11日 下午2:03:00
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    private static AtomicLong counter = new AtomicLong();

    private ConcurrentMap<Long, User> userMap = new ConcurrentHashMap<Long, User>();

    @Override
    public User saveOrUpdateUser(User user) {
        Long id = user.getId();

        if (id == null) {
            id = counter.incrementAndGet();
            user.setId(id);
        }

        this.userMap.put(id, user);

        return user;
    }

    @Override
    public void deleteUser(Long id) {
        this.userMap.remove(id);
    }

    @Override
    public User getUserById(Long id) {
        return this.userMap.get(id);
    }

    @Override
    public List<User> getUserList() {
        return new ArrayList<User>(this.userMap.values());
    }

}

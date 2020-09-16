package com.thoughtworks.cleanarch.domain.contexts.edit;

import java.util.Optional;

/**
 * description: BlogRepository <br>
 * date: 2020/9/16/016 11:04 <br>
 *
 * @author: LouWei <br>
 * version: 1.0 <br>
 */
public interface BlogRepository {
    void save(Blog blog);

    Optional<Blog> findByID(String id);
}

package com.thoughtworks.cleanarch.domain.contexts.edit;

import com.thoughtworks.cleanarch.domain.core.concepts.DomainService;

/**
 * description: BlogService <br>
 * date: 2020/9/16/016 11:03 <br>
 *
 * @author: LouWei <br>
 * version: 1.0 <br>
 */
public class BlogService implements DomainService {
    private BlogRepository repository;

    public BlogService(BlogRepository repository) {
        this.repository = repository;
    }

    public Blog create(String title, String context) {
        Blog blog = new Blog(title, context);
        repository.save(blog);
        return blog;
    }

    public Blog get(String id) {
        return repository.findByID(id).orElseThrow(() -> new BlogNotFoundException("Blog not found."));
    }

    public Blog edit(String id, String title, String context) {
        Blog blog = get(id);
        blog.saveDraft(title, context);
        repository.save(blog);
        return blog;
    }
}

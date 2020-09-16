package com.thoughtworks.cleanarch.domain.contexts.edit;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

/**
 * description: Blog <br>
 * date: 2020/9/16/016 10:57 <br>
 *
 * @author: LouWei <br>
 * version: 1.0 <br>
 */
@Getter
@AllArgsConstructor
public class Blog {
    private String id;
    private String title;
    private String context;
    private List<HistoryBlog> historyBlogList;

    public Blog(String title, String context) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.context = context;
    }

    public void saveDraft(String title, String context) {
        this.title = title;
        this.context = context;
    }
}

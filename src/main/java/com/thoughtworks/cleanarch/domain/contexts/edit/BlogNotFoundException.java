package com.thoughtworks.cleanarch.domain.contexts.edit;

import com.thoughtworks.cleanarch.domain.core.exceptions.DomainException;

/**
 * description: BlogNotFoundException <br>
 * date: 2020/9/16/016 11:09 <br>
 *
 * @author: LouWei <br>
 * version: 1.0 <br>
 */
public class BlogNotFoundException extends DomainException {
    public BlogNotFoundException(String message) {
        super(message);
    }
}

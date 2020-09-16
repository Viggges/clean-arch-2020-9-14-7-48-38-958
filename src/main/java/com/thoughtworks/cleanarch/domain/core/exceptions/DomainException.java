package com.thoughtworks.cleanarch.domain.core.exceptions;

/**
 * description: DomainException <br>
 * date: 2020/9/16/016 10:58 <br>
 *
 * @author: LouWei <br>
 * version: 1.0 <br>
 */
public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}

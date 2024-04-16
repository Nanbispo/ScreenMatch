package com.alura.screenMatch.repositories;

public interface IConvertData {
    <T> T getDatas(String json, Class<T> classe);
}

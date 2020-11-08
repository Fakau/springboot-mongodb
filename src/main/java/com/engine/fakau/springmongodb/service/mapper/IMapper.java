package com.engine.fakau.springmongodb.service.mapper;

public interface IMapper<U, V> {
    V toEntity(U u);
    U toDto(V v);
}

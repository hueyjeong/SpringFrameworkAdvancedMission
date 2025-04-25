package com.example.springframeworkadvanced.mapper;

import com.example.springframeworkadvanced.domain.User;
import com.example.springframeworkadvanced.dto.RegisterRequest;
import org.mapstruct.factory.Mappers;

public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toUser(RegisterRequest registerRequest);
}

package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;


@RedisHash("daily")
public class Rating {
    @Id
    private final String characterId;
    private final String name;

    public String getCharacterId() {
        return characterId;
    }

    public String getName() {
        return name;
    }

    public Rating(String characterId, String name) {
        this.characterId = characterId;
        this.name = name;
    }
}

package com.backend.reactjs.dto;

public class PossitonDto {
    private short id;

    private String name;

    public PossitonDto(short id, String name) {
        this.id = id;
        this.name = name;
    }

    public short getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}


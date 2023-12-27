package dtoBuilders;

import dtos.TagDto;

public class TagBuilder {
    public Long id;
    public String name;

    public TagBuilder WithId(Long id) {
        this.id = id;
        return this;
    }

    public TagBuilder WithName(String name) {
        this.name = name;
        return this;
    }

    public TagDto Build() {
        return new TagDto(this);
    }
}

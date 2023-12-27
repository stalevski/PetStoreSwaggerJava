package dtos;

import dtoBuilders.TagBuilder;

public class TagDto {
    public Long id;
    public String name;

    public TagDto(TagBuilder tagBuilder) {
        this.id = tagBuilder.id;
        this.name = tagBuilder.name;
    }
}

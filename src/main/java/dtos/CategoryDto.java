package dtos;

import dtoBuilders.CategoryBuilder;

public class CategoryDto {
    public Long id;
    public String name;

    public CategoryDto(CategoryBuilder tagBuilder) {
        this.id = tagBuilder.id;
        this.name = tagBuilder.name;
    }
}

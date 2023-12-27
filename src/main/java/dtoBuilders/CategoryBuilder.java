package dtoBuilders;

import dtos.CategoryDto;

public class CategoryBuilder {
    public Long id;
    public String name;

    public CategoryBuilder WithId(Long id) {
        this.id = id;
        return this;
    }

    public CategoryBuilder WithName(String name) {
        this.name = name;
        return this;
    }

    public CategoryDto Build() {
        return new CategoryDto(this);
    }
}

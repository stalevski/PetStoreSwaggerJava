package dtoBuilders;

import dtos.CategoryDto;
import dtos.PetDto;
import dtos.TagDto;

import java.util.ArrayList;
import java.util.List;

public class PetBuilder {
    public Long id;
    public CategoryDto category;
    public String name;
    public List<String> photoUrls = new ArrayList<>();
    public List<TagDto> tags = new ArrayList<>();
    public String status;

    public PetBuilder WithId(Long id) {
        this.id = id;
        return this;
    }

    public PetBuilder WithCategory(CategoryDto category) {
        this.category = category;
        return this;
    }

    public PetBuilder WithName(String name) {
        this.name = name;
        return this;
    }

    public PetBuilder WithPhotoUrl(String photoUrl) {
        photoUrls.add(photoUrl);
        return this;
    }

    public PetBuilder WithTags(TagDto tag) {
        tags.add(tag);
        return this;
    }

    public PetBuilder WithStatus(String status) {
        this.status = status;
        return this;
    }

    public PetDto Build() {
        return new PetDto(this);
    }

}

package dtos;

import dtoBuilders.PetBuilder;

import java.util.List;

public class PetDto {
    public Long id;
    public CategoryDto category;
    public String name;
    public List<String> photoUrls;
    public List<TagDto> tags;
    public String status;

    public PetDto(PetBuilder petBuilder) {
        this.id = petBuilder.id;
        this.category = petBuilder.category;
        this.name = petBuilder.name;
        this.photoUrls = petBuilder.photoUrls;
        this.tags = petBuilder.tags;
        this.status = petBuilder.status;
    }
}

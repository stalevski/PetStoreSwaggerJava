package dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDto {
    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private int userStatus;
}
package com.collegeadmision.springbootapp.hari;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Long id;
    @NotNull(message = "Value cannot be null")
    private String name;
    @Min(value = 1)
    @Max(value = 150)
    private int rollNo;
    //@Pattern(regexp = "[0-9]*[a-z]*[A-Z]*^@gmail.com")
    private String emailId;
    @NotBlank
    @Pattern(regexp = "[0-9]+")
    @Size(min = 6, max = 6)
    private String pinCode;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}

package com.fastcampus.javaallinone.project3.mycontact.domain;

import com.fastcampus.javaallinone.project3.mycontact.domain.dto.Birthday;
import com.fastcampus.javaallinone.project3.mycontact.domain.dto.PersonDto;
import lombok.*;
import org.springframework.util.StringUtils;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @NotEmpty
    @Column(nullable = false)
    private String name;

    @NonNull
    @Min(1)
    private Integer age;

    private String hobby;

    @NotEmpty
    @NonNull
    @Column(nullable = false)
    private String bloodType;

    private String address;

    @Valid
    @Embedded
    private Birthday birthday;

    private String job;

    @ToString.Exclude
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private Block block;

    public void set(PersonDto personDto) {
        if(personDto.getAge() != 0) {
            this.setAge(personDto.getAge());
        }

        if(!StringUtils.isEmpty(personDto.getHobby())) {
            this.setHobby(personDto.getHobby());
        }

        if(!StringUtils.isEmpty(personDto.getBloodType())) {
            this.setHobby(personDto.getBloodType());
        }

        if(!StringUtils.isEmpty(personDto.getAddress())) {
            this.setHobby(personDto.getAddress());
        }

        if(!StringUtils.isEmpty(personDto.getJob())) {
            this.setHobby(personDto.getJob());
        }

        if(!StringUtils.isEmpty(personDto.getPhoneNumber())) {
            this.setHobby(personDto.getPhoneNumber());
        }
    }
}

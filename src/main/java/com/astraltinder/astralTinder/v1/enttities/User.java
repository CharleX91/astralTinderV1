package com.astraltinder.astralTinder.enttities;

import com.astraltinder.astralTinder.enums.Gender;
import com.astraltinder.astralTinder.enums.Province;
import com.astraltinder.astralTinder.enums.Roles;
import com.astraltinder.astralTinder.enums.SexualOrientation;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Roles role;

    private String name;

    private String surname;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    @DateTimeFormat(pattern = "mm:HH")
    private Date birthHour;

    @OneToMany
    private List<User> matches;

    @OneToMany
    private List<User> likeReceived;

    @OneToMany
    private List<User> likeSent;

    @OneToMany
    private List<User> dislike;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private Province province;

    @Enumerated(EnumType.STRING)
    private SexualOrientation sexOrient;    

    @OneToOne
    private AstralPlane astralPlane;

}
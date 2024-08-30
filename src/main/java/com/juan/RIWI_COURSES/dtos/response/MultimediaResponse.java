package com.juan.RIWI_COURSES.dtos.response;
import com.juan.RIWI_COURSES.utils.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MultimediaResponse {

    //Media without id and status
    private Type type;
    private String lesson_id;
    private String url;

}

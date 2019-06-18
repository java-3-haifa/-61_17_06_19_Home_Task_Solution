package com.telran.hometask61solution.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@ToString
public class UpdateCommentDto extends FullCommentDto{
    private String topicId;

    @Builder(builderMethodName = "updateCommentBuilder")
    public UpdateCommentDto(String author, String message, String id, LocalDateTime date,String topicId){
        super(author, message, id, date);
        this.topicId = topicId;
    }
}

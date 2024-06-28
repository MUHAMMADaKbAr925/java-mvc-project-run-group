package run.Group.web.DTO;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;


import lombok.*;
import run.Group.web.models.Club;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {
    private Long id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime endTime;
    private String type;
    private String photoUrl;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private Club club;
}
package run.Group.web.DTO;
import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import lombok.Builder;
import run.Group.web.models.UserEntity;
import lombok.*;
@Data
@Builder
public class ClubDto {
    private Long id;
    @NotEmpty(message = "Club title should not be empty")
    private String title;
    @NotEmpty(message = "Photo link should not be empty")
    private String photoUrl;
    @NotEmpty(message = "Content should not be empty")
    private String content;
    private UserEntity createdBy;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private List<EventDto> events;
}
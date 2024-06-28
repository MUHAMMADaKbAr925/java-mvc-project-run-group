package run.Group.web.services;
import java.util.*;

import run.Group.web.DTO.ClubDto;
import run.Group.web.models.Club;


public interface ClubService {
  List<ClubDto> findAllClubs();
  Club saveClub(ClubDto clubDto);
  ClubDto findClubById(Long clubId);
  void updateClub(ClubDto club);
  void delete(Long clubId);
  List<ClubDto> searchClubs(String query);
}
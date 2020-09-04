package com.ln.mapper;

import com.ln.entity.Player;
import com.ln.entity.School;
import com.ln.entity.Team;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlayerMapper {
    //查询
    List<Player> getAll();

    void delete(@Param("id") Long id);

    List<School> findSchool();

    List<Team> findTeam();

    void save(Player player);

    Player getOneByName(@Param("pname") String pname);
}

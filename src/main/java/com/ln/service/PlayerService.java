package com.ln.service;

import com.ln.entity.Player;
import com.ln.entity.School;
import com.ln.entity.Team;

import java.util.List;

public interface PlayerService {
    //查询
    List<Player> getAll();

    void delete(Long[] ids);

    List<School> findSchool();

    List<Team> findTeam();

    void save(Player player);

    Player getOneByName(String pname);
}

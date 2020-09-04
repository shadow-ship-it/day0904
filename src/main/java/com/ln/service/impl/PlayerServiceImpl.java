package com.ln.service.impl;

import com.ln.entity.Player;
import com.ln.entity.School;
import com.ln.entity.Team;
import com.ln.mapper.PlayerMapper;
import com.ln.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerMapper playerMapper;
    @Override
    public List<Player> getAll() {
        return playerMapper.getAll();
    }

    @Override
    public void delete(Long[] ids) {
        if (ids != null && ids.length>=1){
            for (Long id : ids) {
                playerMapper.delete(id);
            }
        }
    }

    @Override
    public List<School> findSchool() {
        return playerMapper.findSchool();
    }

    @Override
    public List<Team> findTeam() {
        return playerMapper.findTeam();
    }

    @Override
    public void save(Player player) {
        if (player != null){
            playerMapper.save(player);
        }
    }

    @Override
    public Player getOneByName(String pname) {
       return playerMapper.getOneByName(pname);
    }


}

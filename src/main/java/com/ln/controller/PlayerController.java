package com.ln.controller;

import com.ln.entity.Player;
import com.ln.entity.School;
import com.ln.entity.Team;
import com.ln.service.PlayerService;
import com.ln.utils.ResultVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @RequestMapping("/query")
    public List<Player> query(){
        return playerService.getAll();
    }

    @RequestMapping("/delete")
    public ResultVo delete(@RequestBody Long[] ids){
        try {
            playerService.delete(ids);
            return new ResultVo(true,"删除成功");
        }catch (Exception e){
            return new ResultVo(false,"删除失败");
        }
    }

    @RequestMapping("/findSchool")
    public List<School> findSchool(){
        List<School> list = playerService.findSchool();
        return list;
    }

    @RequestMapping("/findTeam")
    public List<Team> findTeam(){
        return playerService.findTeam();
    }

    @RequestMapping("/save")
    public ResultVo save(@RequestBody Player player){
        Player player1 = null;
        if (player != null){
            player1 = playerService.getOneByName(player.getPname());
        }
        if (player1 != null){
            return new ResultVo(false,"名字已存在");
        }else {
            try {
                playerService.save(player);
                return new ResultVo(true,"编辑成功");
            }catch (Exception e){
                return new ResultVo(false,"编辑失败");
            }
        }
    }
}

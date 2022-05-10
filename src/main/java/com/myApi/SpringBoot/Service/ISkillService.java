/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.myApi.SpringBoot.Service;

import com.myApi.SpringBoot.Model.Skill;
import java.util.List;


public interface ISkillService {
    public void crearSkill(Skill skill);
    public void borrarSkill(Long id);
    public List<Skill> listarSkills();
}

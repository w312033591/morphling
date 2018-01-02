package com.lianqu1990.morphling.dao.jpa.entity;
// Generated 2017-11-6 16:32:55 by Hibernate Tools 5.2.1.Final

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Where;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * MenuRole generated by hbm2java
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@DynamicInsert
@DynamicUpdate
@Where(clause = "state = 1")
@Table(name = "menu_role" )
public class MenuRole implements java.io.Serializable {

    private Integer id;
    private int roleId;
    private int menuId;
    private byte state;


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "role_id", nullable = false)
    public int getRoleId() {
        return this.roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Column(name = "menu_id", nullable = false)
    public int getMenuId() {
        return this.menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    @Column(name = "state", nullable = false)
    public byte getState() {
        return this.state;
    }

    public void setState(byte state) {
        this.state = state;
    }

}
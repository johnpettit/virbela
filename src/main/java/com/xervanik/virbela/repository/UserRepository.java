package com.xervanik.virbela.repository;

import com.xervanik.virbela.model.User;

import java.util.ArrayList;

//TODO add a backend DB
public class UserRepository {
    private ArrayList<User> userList = new ArrayList<User>();
    private Integer idCounter = 1;  //TODO prefer to use UUIDs as ids

    public UserRepository() {
    }

    public User getOneUser(Integer id) {
        for(User user: userList) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public ArrayList<User> getAllUsers() {
        return this.userList;
    }

    //TODO some better error checking  Checking for dupes on email?
    public User addUser(User user) {
        user.setId(this.idCounter);
        idCounter++;
        this.userList.add(user);
        return user;
    }

    //TODO some better error checking
    public void editUser(User eUser) {
        for(User user: userList) {
            if(user.getId() == eUser.getId()) {
                if(findIndex(user) == -1) {
                    return;
                }
                userList.set(findIndex(user),eUser);
            }
        }
    }

    //TODO some better error checking
    public void removeUser(Integer id) {
        for(User user: userList) {
            if(user.getId() == id) {
                Integer index = findIndex(user);
                if(index == -1) {
                    return;
                }
                userList.remove(userList.get(index));
            }
        }
    }

    private Integer findIndex(User user) {
        for(int x = 0; x < userList.size(); x++) {
            if(user.getId() == userList.get(x).getId()) {
                return x;
            }
        }
        return -1;
    }
}

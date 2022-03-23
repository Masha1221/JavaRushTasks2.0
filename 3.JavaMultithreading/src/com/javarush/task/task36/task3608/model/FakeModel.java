package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

public class FakeModel implements Model {
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return this.modelData;
    }

    @Override
    public void loadUsers() {

        modelData.getUsers().add(new User());
    }
}

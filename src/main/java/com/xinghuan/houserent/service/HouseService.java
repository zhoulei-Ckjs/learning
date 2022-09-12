package com.xinghuan.houserent.service;

import com.xinghuan.houserent.domain.House;

public class HouseService {
    private House[] houses;

    public HouseService(int size) {
        this.houses = new House[size];      //创建HouseService时指定数组的大小
        houses[0] = new House(1, "jack", "112", "闵行区", 3500, "未出租");
    }
    public House[] list(){
        return houses;
    }
}
